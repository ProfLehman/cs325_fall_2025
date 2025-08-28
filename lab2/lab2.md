# CS325 Data Structures  
## Lab #2 – 25 points - Due Friday, September 8th at 5:00 pm

---

## Purpose
The purpose of this assignment is to begin thinking about algorithms and their *limits*.  
You will create a Java program that determines prime numbers using the **Sieve of Eratosthenes** algorithm.  
(Reference: [Wikipedia – Sieve of Eratosthenes](http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes))

---

## Requirements

- Your program must define a **`void` method** called `showPrimes` that:
  - Accepts an integer value (maximum prime) as an argument.  
  - Calculates all primes up to this maximum using the Sieve of Eratosthenes algorithm.  
  - Displays the primes to the console.  
  - You **must** use the algorithm as described (do not substitute another method).  

- Input: The maximum value will be provided as a **command line argument**.  
  - Example:  
    ```bash
    java lab2 50
    ```
- Default: If no command line argument is given, use a default of **1000**.  
  - Example:  
    ```bash
    java lab2
    ```
- Make your program as **efficient** as possible (loop choice, logic, stopping point, etc.).

---

## Reflection Questions (3 points)

Add a paragraph (or two) to your **program comments** addressing:

1. What is the maximum prime number you can find using your program?  
2. How does printing vs. not printing the numbers affect performance?  
3. What factors limit your program from finding larger prime numbers?  

---


## Starter Code

```java
// lab2.java
// your name
// September 5, 2025
// calculates primes using Sieve of Eratosthenes
// demonstrates command line arguments and methods
// 
// *** add answers to performance questions here ***

public class lab2 {
    public static void main(String[] args) {
        int num = 0;
        // add code to get num from command line argument
        // call showPrimes
        showPrimes(num);
    } // main

    public static void showPrimes(int N) {
        // add code to display primes
    } // showPrimes
} // lab2
```





## Pseudocode


```C
// your code must match this algorithm

// command line
get N from the command line
if no argument is given, set N = 1000

// setup
create and initialize an array of boolean values (size N+1)
set array[0] and array[1] = false
set array[2..N] = true

// mark off values
for i = 2 to sqrt(N) step 1:
{
    if array[i] is true:
    {
        for j = i^2 to N, step i:  note: this says step i and not 1 (one)
        {
            array[j] = false
            }
    }
}
// display results
for i = 2 to N step 1:
{
     if array[i] is true:
        print i
}   
```
---
| &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; | &nbsp; |
|---|---|---|---|---|---|---|---|---|---|
0 |1 |2 |3 |4 |5 |6 |7 |8 |9 |
10 |11 |12 |13 |14 |15 |16 |17 |18 |19 |
20 |21 |22 |23 |24 |25 |26 |27 |28 |29 |
30 |31 |32 |33 |34 |35 |36 |37 |38 |39 |
40 |41 |42 |43 |44 |45 |46 |47 |48 |49 |
50 |51 |52 |53 |54 |55 |56 |57 |58 |59 |
60 |61 |62 |63 |64 |65 |66 |67 |68 |69 |
70 |71 |72 |73 |74 |75 |76 |77 |78 |79 |
80 |81 |82 |83 |84 |85 |86 |87 |88 |89 |
90 |91 |92 |93 |94 |95 |96 |97 |98 |99 |
100 |101 |102 |103 |104 |105 |106 |107 |108 |109 |
---
## Submitting your assignment

Your program must be called **lab2.java**

Host `lab2.java` on your GitHub account and **upload a link to your code in Moodle**

-- end --
