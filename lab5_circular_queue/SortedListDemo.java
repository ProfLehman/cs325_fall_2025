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
        int numItems = 40000; // Adjust for demo
        int maxValue = 1000000;

        Random rand = new Random();

        // create array list and linked list
        SortedArrayList arrayList = new SortedArrayList(numItems);
        SortedLinkedList linkedList = new SortedLinkedList();

        // ---- Array insertion ----
        // int item = numItems; // insert front
        // item = 0; // insert end

        long start = System.nanoTime();
        for (int i = 0; i < numItems; i++) {
            arrayList.insert(rand.nextInt(maxValue)); // insert random number
            // arrayList.insert(item);
            // item--; // insert front
            // item++; // insert end
        }

        // start timer
        long end = System.nanoTime();

        // System.out.println(arrayList);

        System.out.printf("Array insert time: %.3f ms%n",
                (end - start) / 1_000_000.0);

        System.out.println();
        System.out.println();

        // ---- Linked list insertion ----
        // item = numItems;
        // item = 0;

        start = System.nanoTime();
        for (int i = 0; i < numItems; i++) {
            linkedList.insert(rand.nextInt(maxValue)); // insert random number
            // linkedList.insert(item);
            // item--; // insert front
            // item++; // insert back
        }

        // stop timer
        end = System.nanoTime();

        // System.out.println(linkedList);

        System.out.printf("Linked list insert time: %.3f ms%n",
                (end - start) / 1_000_000.0);

    }// main

} // class
