import java.util.Random;
import java.util.GregorianCalendar;

/**
 * sortDemo.java
 * j.l. lehman
 * Ported from c++ to Java Fall 2015
 * (modified fall 2017 (zybooks), fall 2019 (Sedgewick quicksort),
 * fall 2021 (Morin quicksort))
 *
 * Original development in
 * C++ fall 2002 (modified fall 2005, 2006, 2007, 2008, 2009, 2011, 2013)
 * demonstrates bubble, selection, insertion sort, heap sort, quick sort, and
 * bad sort provides mechanism for generating random arrays for sorting displays
 * the number of comparisons and swaps for each sort and tracks the computation
 * time in seconds
 * 
 * Note: two versions of quicksort are included (Sedgewick 'w' and Morin 'q')
 * 
 * note: to increase stack size use java -Xss1G sortDemo 60000 q 0 100 n n y
 *
 * @author (Jeff Lehman)
 * @version (October 11, 2021)
 */

public class sortDemo {
    /*
     * class data
     */
    long numC = 0; // number of comparisons
    long numS = 0; // number of swaps

    GregorianCalendar time;
    long start;
    long stop;

    int size; // size of array
    char algorithm; // sorting algorithm
    int seed; // random seed
    int maxRandom; // maximum number to place in array
    boolean showData; // display before and after sort
    boolean showPass; // display pass data
    boolean sorted; // pre-sort data

    int data[];

    Random rn;

    /*
     * alternate constructor
     */
    public sortDemo(int tempsize, char tempAlgorithm, int tempSeed, int tempMaxRandom, boolean tempShow,
            boolean tempPass, boolean tempSorted) {
        size = tempsize;
        algorithm = tempAlgorithm;
        seed = tempSeed;
        maxRandom = tempMaxRandom;
        showData = tempShow;
        showPass = tempPass;
        sorted = tempSorted;

        setUpArray();
    }

    /*
     * default constructor
     */
    public sortDemo() {
        size = 10;
        algorithm = 's';
        seed = 0;
        maxRandom = 500;
        showData = false;
        showPass = false;
        sorted = false;

        setUpArray();
    }

    /*
     * set up Array place random data
     */
    public void setUpArray() {
        data = new int[size];

        if (seed == -1)
            rn = new Random();// set random seed based on time of day
        else
            rn = new Random(seed);// set random seed to user provided value

        // add random numbers to array
        for (int x = 0; x < size; x++)
            data[x] = rn.nextInt(maxRandom + 1);

        if (sorted) {
            // store settings
            boolean tempShowData = showData;
            boolean tempShowPass = showPass;
            char tempAlgorithm = algorithm;
            showData = false;
            showPass = false;

            // sort data
            algorithm = 'q';
            this.quickSort();

            // reset settings
            showData = tempShowData;
            showPass = tempShowPass;
            algorithm = tempAlgorithm;

        }
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

        numC++;
        for (int i = 0; i < size - 1; i++) {
            numC++;

            // find the next smallest value
            int minIndex = i;
            numC++;
            for (int j = i + 1; j < size; j++) {
                numC++;

                numC++;
                if (data[j] < data[minIndex])
                    minIndex = j;
            } // for y

            if (showPass)
                System.out.println("pass: " + i + ", next smallest = " + data[minIndex]);

            // swap next smallest with item at i
            // if check prevents swap if item already in place
            numC++;
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

        numC++;
        for (int i = 1; i < size; i++) {
            numC++;

            // insert the next value
            int j = i;

            if (showPass)
                System.out.println("pass: " + (i - 1) + ", Inserting " + data[j]);

            numC++;
            numC++;
            while (j > 0 && data[j] < data[j - 1]) {
                numC++;
                numC++;

                if (showPass)
                    System.out.println("Swaping " + data[j] + " and " + data[j - 1]);

                numC++;
                // swap
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                numS++;

                j--;
            } // while j

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

        numC++;
        for (int x = 0; x < size - 1; x++) {
            numC++;

            didSwap = false;

            numC++;
            for (int y = 0; y < size - 1 - x; y++) {
                numC++;

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
                System.out.println(data[size - 1 - x] + " now in place");
                this.display();
            }

            // you can increase efficiency by stopping if data is sorted ie. no swaps
            numC++;
            if (didSwap == false)
                x = size; // effectively breaks out out loop
        } // for x

    }// bubbleSort

    /*
     * heapSort
     */
    private void heapSort() {
        // step #1 - build heap - call heapDown from first non-leaf down to index 0 ie.
        // root
        int firstNonLeaf = size / 2 - 1;

        if (showPass) {
            System.out.println("first non-leaf node index = " + firstNonLeaf);
            System.out.println();
        }

        numC++;
        for (int i = firstNonLeaf; i >= 0; i--) {
            numC++;

            heapDown(size, i);
            if (showPass) {
                System.out.println("After Heap Down ...");
                display();
            }
        }

        if (showPass) {
            System.out.println("After Heap Created");
            this.display();
        }

        // step #2 - sort by swapping and calling heapDown
        int tempN = size; // tempN stores temporary logical size of array
        numC++;
        for (int i = 0; i < size - 1; i++) {
            numC++;

            // swap root with tempN
            int temp = data[tempN - 1];
            data[tempN - 1] = data[0];
            data[0] = temp;
            numS++;

            if (showPass) {
                System.out.println(data[tempN - 1] + " in place");
                display();
            }

            tempN--; // adjust logical size of heap

            heapDown(tempN, 0); // fix heap

            if (showPass) {
                System.out.println("Heap Fixed");
                display();
            }

        } // for
    }// heapSort

    /*
     * heapDown - recursive support function for heapSort
     */
    private void heapDown(int N, int i) {

        int leftChild = i * 2 + 1;
        int rightChild = i * 2 + 2;
        int swapIndex = -1; // assume no swap

        numC++;
        if (rightChild < N) // has both left & right child
        {
            numC += 2;
            if (data[i] < data[rightChild] || data[i] < data[leftChild]) // less than either left or right child
            {
                numC++;
                if (data[rightChild] > data[leftChild]) // determine child for swap
                {
                    swapIndex = rightChild; // mark for swap with right child
                } else {
                    swapIndex = leftChild; // mark for swap with left child
                }
            }
        } else {
            numC++;
            if (leftChild < N) // has left child
            {
                numC++;
                if (data[i] < data[leftChild]) {
                    swapIndex = leftChild; // mark for swap with left child
                }
            }
        }

        numC++;
        if (swapIndex != -1) {
            // swap with swapIndex
            int temp = data[i];
            data[i] = data[swapIndex];
            data[swapIndex] = temp;
            numS++;

            heapDown(N, swapIndex);// recursive call
        }

    }// heapDown

    /*
     * Sedgewick - quicksort
     */
    private void quickSort() {
        quickSortH(0, size - 1);
    }

    /*
     * Sedgewick - quicksort - recursive quicksort helper
     */
    private void quickSortH(int low, int high) {
        numC++;
        if (low < high) {
            int pivotLocation = partition(low, high);
            quickSortH(low, pivotLocation - 1);
            quickSortH(pivotLocation + 1, high);
        }
    }

    /*
     * Sedgewick - quickSort partition
     */
    public int partition(int low, int high) {
        int i = low;
        int j = high + 1;
        boolean done = false;

        int pivotValue = data[low]; // assume first value is pivot

        if (showPass) {
            // print array partition values
            System.out.printf("Partitioning items: %d to %d\n\n", low, high);

            for (int x = low; x <= high; x++)
                System.out.print(data[x] + " ");
            System.out.println();
        }

        while (!done) {

            // Increment i while data[i] < pivot value and i != high
            i++;
            numC++;
            numC++;
            while (data[i] < pivotValue && !done) {
                numC++;
                numC++;

                numC++;
                if (i == high)
                    done = true;
                else
                    i++;
            }

            if (showPass) {
                System.out.printf("move i right to %d, value %d\n", i, data[i]);
            }

            // Decrement j while pivot value < data[j] and j != low
            j--;
            numC++;
            numC++;
            while (data[j] >= pivotValue && !done) {
                numC++;
                numC++;

                numC++;
                if (j == low)
                    done = true;
                else
                    j--;

            }

            if (showPass) {
                System.out.printf("move j left to %d, value %d\n", j, data[j]);
            }

            /*
             * If there are zero or one items remaining, all numbers are partitioned. Return
             * j
             */
            numC++;
            if (i >= j) {
                done = true;
                if (showPass) {
                    System.out.println("\nDone as i >= j ie. " + i + " >= " + j);
                }

            } else {
                // Swap data[i] with data[j]
                if (showPass) {
                    System.out.printf("Swapping items at %d and %d, thus ", i, j);
                    System.out.printf("%d and %d\n\n", data[i], data[j]);
                }

                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                numS++;
            }

            if (showPass) {
                // print array partition values
                for (int x = low; x <= high; x++)
                    System.out.print(data[x] + " ");
                System.out.println();
            }
        } // while !done

        // swap data[low] with data[j]
        if (showPass) {
            System.out.printf("\nSwapping items at (low) %d and (j) %d, thus ", low, j);
            System.out.printf("%d and %d\n", data[low], data[j]);
        }

        // swap data[low] with data[j]
        int temp = data[j];
        data[j] = data[low];
        data[low] = temp;
        numS++;

        if (showPass) {
            // print array partition values
            System.out.println("At end of partition pass");
            for (int x = low; x <= high; x++)
                System.out.print(data[x] + " ");
            System.out.println();
            System.out.printf("%d at position %d is now at in place\n\n", data[j], j);
        }

        return j;
    }

    /*
     * Morin quicksort
     */
    private void mquickSort() {
        mquickSortH(0, size);
    }

    /*
     * Morin Quicksort helper
     */
    private void mquickSortH(int i, int n) {

        if (showPass) {
            // print array partition values
            System.out.printf("\nmquickSortH i:%d n:%d\n", i, n);

            for (int x = i; x < n; x++)
                System.out.print(data[x] + " ");
            System.out.println();
        }

        numC++;
        if (n > 1) {

            // get pivot value
            int x = data[i + rn.nextInt(n)];

            int p = i - 1;
            int j = i;
            int q = i + n;

            if (showPass) {
                System.out.printf("Pivot = %d  \n", x);
                System.out.printf(" p = %d  j = %d  q = %d\n", p, j, q);
            }

            numC++;
            while (j < q) {
                numC++;

                if (data[j] < x) { // move to beginning of array
                    numC++;
                    // swap(a, j++, ++p);
                    p++;

                    if (showPass) {
                        System.out.printf("Move beginning - Swapping = j:%d & p:%d\n", data[j], data[p]);
                    }

                    int temp = data[j];
                    data[j] = data[p];
                    data[p] = temp;
                    numS++;
                    j++;

                } else if (data[j] > x) {
                    numC++;
                    numC++;

                    // swap(a, j, --q); // move to end of array
                    q--;
                    if (showPass)
                        System.out.printf("Move end - Swapping = j:%d & q:%d\n", data[j], data[q]);
                    int temp = data[j];
                    data[j] = data[q];
                    data[q] = temp;
                    numS++;

                } else {
                    numC++;
                    numC++;
                    if (showPass)
                        System.out.printf("Keeping = j:%d \n", data[j]);

                    j++; // keep in the middle
                }

                if (showPass)
                    System.out.printf(" p = %d  j = %d  q = %d\n", p, j, q);
            } // while

            if (showPass) {
                // print array partition values

                System.out.printf("end call mquickSortH i:%d n:%d\n", i, n);

                for (int z = i; z < n; z++)
                    System.out.print(data[z] + " ");
                System.out.println();
            }

            if (showPass) {
                System.out.println("Next calls will be ...");
                System.out.printf("left mquickSortH %d, %d\n", i, p - i + 1);
                System.out.printf("right mquickSortH %d, %d\n", q, n - (q - i));
            }
            mquickSortH(i, p - i + 1); // recursive call
            mquickSortH(q, n - (q - i)); // recursive call
        } // if
    }

    // data array in methods
    // Add numS++ when an array swap occurs
    // Add numC++ when any comparison occurs
    // Use if (showPass) { } to display messages within algorithm to show how
    // algorithm works
    // Add new sort to main menu print statements
    // Add new sort to sort method case statement
    //

    // ****************************************
    // *** end ***
    // ****************************************

    /*
     * ' badsort - swaps random values until sorted
     */
    private void badSort() {
        Random rn = new Random();

        numC++;
        while (!sorted()) {
            int x = rn.nextInt(size); // pick random array index
            int y = rn.nextInt(size); // pick second random array index

            // swap data[x] with data[y]
            int temp = data[x];
            data[x] = data[y];
            data[y] = temp;
            numS++;

            if (showPass) {
                System.out.println("Swapped " + x + " and " + y);
                display();
            }

        }
    }

    /*
     * is sorted
     */
    private boolean sorted() {
        boolean result = true;
        int i = 0;
        while (i < size - 1 && result == true) {
            numC++;
            if (data[i] > data[i + 1])
                result = false;
            else
                i++;
        }
        return result;
    }

    public void sort() {

        // show data
        if (showData) {
            System.out.println("\nOriginal Data");
            this.display();
        }

        this.resetStats();
        this.startTime();

        this.resetStats();
        this.startTime();

        switch (algorithm) {
            case 'd':
                System.out.printf("Bad Sort with %,d items\n\n", size);
                this.badSort();
                break;
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
            case 'h':
                System.out.printf("Heap Sort with %,d items\n\n", size);
                this.heapSort();
                break;
            case 'w':
                System.out.printf("Sedgewick Quick Sort with %,d items\n\n", size);
                this.quickSort();
                break;
            case 'q':
                System.out.printf("Morin Quick Sort with %,d items\n\n", size);
                this.mquickSort();
                break;

            default:
                System.out.println("Error: invalid algorithm");
        }

        this.stopTime();

        // show data
        if (showData) {
            System.out.println("\nSorted Data");
            this.display();
        }

        showStats();
    }

    // main test program - uses command line arguments to create and run instance of
    // sortDemo
    public static void main(String args[]) {

        // get command line parameters
        if (args.length != 7) {
            System.out.println();
            System.out.println("*** Error missing argument ***");
            System.out.println();
            System.out.println("       expecting number of items [int]");
            System.out.println("       sorting algorithm [ s | i | b | h | q | w | d ]");
            System.out.println("random seed (-1 time of day, 0+) [int]");
            System.out.println("           maximum random number [int]");
            System.out.println("     display before & after data [ y | n ]");
            System.out.println("               display pass data [ y | n ]");
            System.out.println("                 sort data first [ y | n ]");
            System.out.println();
            System.out.println("ie. java sortDemo 25 s 0 100 y n n");
            System.out.println("          list of 25 items, selection sort, seed 0, max value 100");
            System.out.println("          displays original and sorted list, does not show intermediate steps");
            System.out.println("          does not sort data first");
            System.out.println();
        } else {
            // process command line arguments
            int size = Integer.parseInt(args[0]); // size of array
            char algorithm = args[1].charAt(0);
            int seed = Integer.parseInt(args[2]); // random seed
            int max = Integer.parseInt(args[3]); // max integer
            boolean show = (args[4].charAt(0) == 'y' ? true : false); // set true/false using ternary operator
            boolean pass = (args[5].charAt(0) == 'y' ? true : false); // set true/false using ternary operator
            boolean sorted = (args[6].charAt(0) == 'y' ? true : false); // set true/false using ternary operator

            sortDemo test = new sortDemo(size, algorithm, seed, max, show, pass, sorted);

            test.sort();
        }
    }// main

}// class