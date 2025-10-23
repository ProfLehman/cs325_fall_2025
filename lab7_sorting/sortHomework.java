import java.util.Random;
import java.util.GregorianCalendar;

/**
 * sortHomework.java
 * j.l. lehman
 * fall 2025
 * 
 * homework grader, for bubble, selection, insertion sorts
 * reads x7 ints from command line
 * 
 * java sortHomework 10 35 5 25 20 25 15
 * 
 */

public class sortHomework {
    /*
     * class data
     */
    long numC = 0; // number of comparisons
    long numS = 0; // number of swaps

    GregorianCalendar time;
    long start;
    long stop;

    int size; // size of array
    int maxRandom;

    char algorithm; // sorting algorithm
    int data[];

    boolean showData = false;
    boolean showPass = false;
    boolean sorted = false;

    Random rn;

    /*
     * default constructor
     */
    public sortHomework() {
        size = 7;
        algorithm = 'b';
        maxRandom = 100;
        showData = false;
        showPass = false;
        sorted = false;

        setUpArray();
    }

    /*
     * set up Array place random data
     */
    public void setUpArray() {

    }

    /*
     * display data horizontally across screen
     * 
     */
    public void display() {
        for (int x = 0; x < size; x++)
            System.out.print(data[x] + " ");

        System.out.println();
        System.out.println();
    }// display

    /*
     * start stats time, comparisons, swaps
     */
    private void resetStats() {
        numC = 0; // number of comparisons
        numS = 0; // number of swaps
    }// resetStats

    /*
     * start time
     */
    private void startTime() {
        time = new GregorianCalendar();
        start = time.getTimeInMillis();
    }

    /*
     * stop time
     */
    private void stopTime() {
        time = new GregorianCalendar();
        stop = time.getTimeInMillis();
    }

    /*
     * show stats displays comparisons and swaps
     */
    private void showStats() {
        // stop time
        long diff = (stop - start) / 1000;

        System.out.println();
        System.out.printf("Time: %,d seconds\n", diff);
        System.out.println();
        System.out.printf("number of comparisons = %,d\n", numC);
        System.out.printf("number of swaps = %,d\n", numS);
        System.out.println();
    }// showStats

    /*
     * selection sort
     * 
     */
    private void selectionSort() {

        for (int i = 0; i < size - 1; i++) {

            // find the next smallest value
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                numC++;
                if (data[j] < data[minIndex])
                    minIndex = j;
            } // for y

            if (showPass)
                System.out.println("pass: " + i + ", next smallest = " + data[minIndex]);

            // swap next smallest with item at i
            // if check prevents swap if item already in place
            if (minIndex != i) {
                int temp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = temp;
                numS++;
            }

            if (showPass)
                this.display();

        } // for x

    }// selectionSort

    /*
     * insertion sort
     */

    private void insertionSort() {

        int passC = 0;

        for (int i = 1; i < size; i++) {

            // insert the next value
            int j = i;

            if (showPass)
                System.out.println("pass: " + (i - 1) + ", Inserting " + data[j]);

            numC++;
            passC = 1;
            while (j > 0 && data[j] < data[j - 1]) {
                numC++;
                passC++;

                if (showPass)
                    System.out.println("Swaping " + data[j] + " and " + data[j - 1]);

                // swap
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                numS++;

                j--;
            } // while j
            if (j == 0) {
                passC--;
                numC--;
            }

            System.out.println("Pass compare " + passC);

            if (showPass)
                this.display();

        } // for i

    }// insertionSort

    /*
     * Bubble Sort
     */
    // bubble sort
    private void bubbleSort() {
        boolean didSwap = false; // allows for optimization to stop once sorted

        for (int x = 0; x < size - 1; x++) {

            didSwap = false;

            for (int y = 0; y < size - 1 - x; y++) {

                numC++;
                if (data[y] > data[y + 1]) {
                    // swap
                    int temp = data[y];
                    data[y] = data[y + 1];
                    data[y + 1] = temp;
                    numS++;
                    didSwap = true;
                } // if

            } // for y

            if (showPass) {
                System.out.println("pass: " + x + " " + data[size - 1 - x] + " now in place");
                this.display();
            }

            // you can increase efficiency by stopping if data is sorted ie. no swaps
            // if (didSwap == false)
            // x = size; // effectively breaks out out loop
        } // for x

    }// bubbleSort

    public void sort(char algorithm, String a[]) {

        data = new int[7];
        for (int x = 0; x < 7; x++)
            data[x] = Integer.parseInt(a[x]);

        showPass = true;

        System.out.println("\nOriginal Data");
        this.display();

        this.resetStats();
        this.startTime();

        this.resetStats();
        this.startTime();

        switch (algorithm) {
            case 'i':
                System.out.printf("Insertion with %,d items\n\n", size);
                this.insertionSort();
                break;
            case 's':
                System.out.printf("Selection Sort with %,d items\n\n", size);
                this.selectionSort();
                break;
            case 'b':
                System.out.printf("Bubble Sort with %,d items\n\n", size);
                this.bubbleSort();
                break;

            default:
                System.out.println("Error: invalid algorithm");
        }

        this.stopTime();

        // show data
        System.out.println("\nSorted Data");
        this.display();

        showStats();
    }

    // main test program - uses command line arguments to create and run instance of
    // sortDemo
    public static void main(String args[]) {

        // get command line parameters
        if (args.length != 7) {
            System.out.println();
            System.out.println("*** Error missing arrray arguments ***");
            System.out.println();
        } else {
            // process command line argument

            System.out.println("----------------------------------");
            System.out.println("------ Bubble --------------------");
            System.out.println("----------------------------------");
            sortHomework testb = new sortHomework();
            testb.sort('b', args);

            System.out.println("----------------------------------");
            System.out.println("------ Selection------------------");
            System.out.println("----------------------------------");
            testb.sort('s', args);

            System.out.println("----------------------------------");
            System.out.println("------ Insertion------------------");
            System.out.println("----------------------------------");
            testb.sort('i', args);
        }
    }// main

}// class
