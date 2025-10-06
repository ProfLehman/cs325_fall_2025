/*
 * charToInt.java
 * fall 2025
 * prof. lehman
 * demonstrates how to convert char to int values
 */

public class demo2 {

    public static void main(String[] args) {

        String s = "$98,765,432.10";

        for (int x = 0; x < s.length(); x++) {

            if (Character.isDigit(s.charAt(x))) {

                // option #1
                // covert by casting character ASCII value to int
                // note: '0' => 48, '1' => 49, etc...
                int a = (int) s.charAt(x) - 48;

                // option #2
                // convert with Integer.parseInt which takes a String as input thus need to use
                // substring method
                int b = Integer.parseInt(s.substring(x, x + 1));

                // option #3
                // convert using Character getNumericValue method
                int c = Character.getNumericValue(s.charAt(x));

                // note: a should equal b should equal c
                System.out.printf("int values: %d %d %d\n", a, b, c);

            } // if

        } // for

    }// main

}// class
