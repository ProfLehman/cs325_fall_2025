// TestLimitLinkedList.java
// fall 2025
// prof. lehman
//
// demonstrates running out of heap memory
// note: modify Node.java to include an array of ints
// note: show memory performance for OS to watch memory allocation
//       in Windows, task manager, performance, memory

// -Xms is starting heap size
// -Xmx is maximum heap size

// java -Xms2g -Xmx4g TestLimitLinkedList
// java -Xms4g -Xmx6g TestLimitLinkedList

import java.util.Random;

public class TestLimitLinkedList {

    public static void main(String[] args) {

        /*
         * test array allocation
         * int test[] = new int[2000000000];
         * test[0] = 9;
         * printHeapUsage();
         */

        int maxValue = 1000000000;

        Random rand = new Random();

        SortedLinkedList linkedList = new SortedLinkedList();

        int count = 0;
        while (true) {

            linkedList.insert(rand.nextInt(maxValue)); // insert random number

            count++;
            System.out.println(count);

            printHeapUsage();
        }

    }// main

    private static void printHeapUsage() {
        Runtime rt = Runtime.getRuntime();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        long used = total - free;
        long max = rt.maxMemory();

        System.err.printf("Heap used: %,d bytes (%.2f MB)%n", used, bytesToMB(used));
        System.err.printf("Heap total (committed): %,d bytes (%.2f MB)%n", total, bytesToMB(total));
        System.err.printf("Heap max (-Xmx): %,d bytes (%.2f MB)%n", max, bytesToMB(max));
    }

    private static double bytesToMB(long b) {
        return b / (1024.0 * 1024.0);
    }

} // class
