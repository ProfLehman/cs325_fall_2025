/*
 * RecursivePalindrome.java
 * fall 2025
 * j.l. lehman
 *
 * recursive solutions to palindrome
 */
public class RecursivePalindrome {

    public static void main(String[] args) {

        String words[] = { "a", "racecar", "noon", "hannah", "abcba", "abbca", "nope", "ab" };

        for (int i = 0; i < words.length; i++) {

            System.out.print(words[i] + "  palindrome = ");
            System.out.print(palindrome(words[i]));

            System.out.print(" ");
            System.out.println(palindrome2(words[i]));
        }

    }// main


    // *** Approach #1 ***
    //
    // recursive method to determine palindrome status
    // approach modifies the string each time a recursive call is made
    private static boolean palindrome(String s) {

        if (s.length() <= 1)
            return true; // base case - stop and report true if length is 0 or 1
        else {
            char first = s.charAt(0); // get first letter
            char last = s.charAt(s.length() - 1); // get last letter
            if (first != last)
                return false; // base case - stop and report false if first and last are not same
            else
                // recursive call removing first and last letter
                return palindrome(s.substring(1, s.length() - 1)); // recursive call

        }
    }// palindrome


    // *** Approach #2 ***
    //
    // palindrome2 calls palindromeHelper
    // which is an alternate recursive approach passing indexes rather than changing the string
    // that sends the first and list indexes
    private static boolean palindrome2(String s) {
        return palindromeHelper(s, 0, s.length() - 1); // helper method
    }

    // helper method for palindrome2
    private static boolean palindromeHelper(String s, int first, int last) {

        if (first >= last)
            return true; // base case - stop once first and last index same or cross over
        else {
            if (s.charAt(first) != s.charAt(last))
                return false; // base case - stop and return false if first and last do not match
            else
                // recursive call moving first to right x1 letter and last to left x1 letter
                return palindromeHelper(s, first + 1, last - 1); // recursive call
        }
    }// palindrome

}// class
