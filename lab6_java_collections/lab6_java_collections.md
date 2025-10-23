# Lab #6 Java Collections

- CS325 Data Structures  
- 25 points
- Due **Thursday**, October 16th at 5:00 pm (encouraged to complete before fall break)

---

## Purpose

The purpose of this assignment is to learn to use Java Built-in libraries of abstract data types 
known as the [Java Collections Framework](https://www.w3schools.com/java/java_data_structures.asp). 
This framework includes `queue` and `stack` classes.

See `demo1.java` and in-class code demonstrating basic use of `Stack` and `Queue` classes from the Java Collections Framework.


## Lab 6 Problem
Most computer applications require users to enter data. When users enter numbers they prefer to use
formatting symbols such as commas, decimal points, and dollar signs. They may occasionally enter an extra
formatting symbol or space.

User input for most programming languages is captured in a string format that must be converted to a
numeric format. Your assignment is to write a function called toDouble that will take a numeric value as a
string and convert the value to a double. Your function must allow dollar signs, negative sign, commas,
spaces, and a single decimal point.

Use the Java Collection stack and queue to implement your function (see sample program for how to use
Java Collection stack and queue). Place all values to the left of the decimal on the stack. Place all values to
the right of the decimal place (if any) on a queue. The result should be calculated by removing and adding
values from the stack and queue. When you pop values from the stack, multiply the first value by 1, the
second by 10, the third by 100, etc ... until all values are removed from the stack. When you remove values
from the queue divide the first value by 10, the second by 100, the third by 1000, etc ... until all values are
removed from the queue.

Hints:
- Design and test this algorithm on paper before you begin
- Step 1 – place digits in stack and queue, make note of negative if applicable, 
use the String methods and Character methods
Push int values onto the stack/queue (only push digits)
- Step 2 – pop all values from stack and update value
- Step 3 – pop all values form queue and update value
- Step 4 – set value as negative if applicable


---

## Requirements
1. Must use Java Collections `Queue` and `Stack` classes.
2. Must use algorithm described above (ie. no ParseInt approaches)
3. Add x3 additional test cases (3 points)
4. Add your name to the comments at top of page (1 point)

--- 

## Starter Code for lab6 - update this code 
```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * lab6.java
 * fall 2025
 * 
 * your name
 * 
 * convert String to double using Java Collection Stack and Queue
 */

public class lab6 {
    public static void main(String[] args) {

        // test cases - add x3 additional cases here
        test("6", 6.0);
        test("7,000,000", 7000000.0);
        test(" $$$7 000 000 ", 7000000.0);
        test("$5,678.13 ", 5678.13);
        test("$0.25", 0.25);
        test(" -$.25", -0.25);
        test("-8.96", -8.96);

        // *** add three additional test cases here

    }// main

    private static double toDouble(String a) {

        double answer = 0.0;

        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();

        boolean decimalFound = false; // *** may or may not use this approach
        boolean negative = false; // *** may or may not use this approach

        // *** add code here ***

        return answer;

    }// toDouble

    // test method
    private static void test(String s, double expected) {

        double actual = toDouble(s);

        if (actual == expected)
            System.out.printf("Passed: %15s => %15f\n", s, actual);
        else
            System.out.printf(" Error: %15s => %15f   Expected: %15f\n", s, actual, expected);

    } // test

}// class

```

---
## Submitting your assignment

Host `lab6.java` on your GitHub account and **upload a link to your code in Moodle**

-- end --
