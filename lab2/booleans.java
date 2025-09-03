// booleans.java
// fall 2025
// j.l. lehman
// demonstrates how to create and use a boolean array

public class booleans {
    public static void main(String[] args) {

        boolean[] switches = new boolean[8]; // {false, false, false, false, ... false}

        // Turn them all on using a traditional for loop
        for (int i = 0; i < switches.length; i++) {
            switches[i] = true;
        }

        // turn off 3 and 5
        switches[3] = false;
        switches[5] = false;

        // Print array values using a traditional for loop
        for (int i = 0; i < switches.length; i++) {
            System.out.println(i + ", " + switches[i]);
        } // for

        System.out.println();

        // check array and print ON or OFF
        for (int i = 0; i < switches.length; i++) {
            if (switches[i] == true)
                System.out.println(i + " ON");
            else
                System.out.println(i + " OFF");
        } // for

    } // main

} // class
