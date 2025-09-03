/*

mystery.java
In-Class Exercise 9.3.2025

In groups ...
1. "Deskcheck" algorithm to ensure you understand its function
    List variables and update values as they change
    number, reversed, digit

2. Covert code to Java

3. Run from command line
    javac myster.java
    java mystery 2468

    or

    java mystery.java 2468


Algorithm Mystery

    Input from command line: number

    reversed ← 0

    While number > 0 do

        digit ← number mod 10

        reversed ← reversed * 10 + digit

        number ← number div 10

    EndWhile

    Output reversed

End Mystery Algorithm
 */

public class mystery {

    public static void main(String args[]) {

        int number;

        // get number from command line
        if (args.length > 0)
            number = Integer.parseInt(args[0]);
        else
            number = 123; // default if command line not used

        int reversed;
        reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println(reversed);
    }// main

}// class
