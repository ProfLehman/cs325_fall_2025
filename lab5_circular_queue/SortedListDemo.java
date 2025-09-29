// SortedListDemo.java
// fall 2025
// prof. lehman
//
// demonstrates inserting into sorted list
// using both dynamic linked list 
// and static array

import java.util.Random;

public class SortedListDemo {
    public static void main(String[] args) {

        // allow command line running java SortedListDemo 20 random n

        // defaults
        int numItems = 40000; // Adjust for demo
        String testType = "random"; // "front", "back", "random"
        boolean show = false;

        if (args.length > 0) {
            numItems = Integer.parseInt(args[0]);
            testType = args[1];
            if (args[2].charAt(0) == 'y')
                show = true;
            else
                show = false;
        }

        int maxValue = numItems * 3;

        System.out.printf("Running Tests for %d items inserted at %s\n\n", numItems, testType);

        Random rand = new Random();

        // create array list and linked list
        SortedArrayList arrayList = new SortedArrayList(numItems);
        SortedLinkedList linkedList = new SortedLinkedList();

        // --------------------------------
        // ---- Array insertion ----
        // --------------------------------

        // set starting item based on test type
        int item = -1;
        if (testType.equals("front"))
            item = numItems;
        else if (testType.equals("back"))
            item = 0;

        long start = System.nanoTime();
        for (int i = 0; i < numItems; i++) {

            // set item to random number for random test
            if (testType.equals("random"))
                item = rand.nextInt(maxValue);

            // insert item
            arrayList.insert(item);

            // adjust item for front and back
            if (testType.equals("front"))
                item--; // front
            else if (testType.equals("back"))
                item++; // end
        }

        // start timer
        long end = System.nanoTime();

        if (show)
            System.out.println(arrayList);

        System.out.printf("Array insert time: %.3f ms%n",
                (end - start) / 1_000_000.0);

        System.out.println();
        System.out.println();

        // --------------------------------
        // ---- Linked list insertion ----
        // --------------------------------

        // set starting item based on test type
        item = -1;
        if (testType.equals("front"))
            item = numItems;
        else if (testType.equals("back"))
            item = 0;

        start = System.nanoTime();
        for (int i = 0; i < numItems; i++) {

            // set item to random number for random test
            if (testType.equals("random"))
                item = rand.nextInt(maxValue);

            // insert item
            linkedList.insert(item);

            // adjust item for front and back
            if (testType.equals("front"))
                item--; // front
            else if (testType.equals("back"))
                item++; // end
        }

        // stop timer
        end = System.nanoTime();

        if (show)
            System.out.println(linkedList);

        System.out.printf("Linked list insert time: %.3f ms%n",
                (end - start) / 1_000_000.0);

    }// main

} // class
