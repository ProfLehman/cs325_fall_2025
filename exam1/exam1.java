/*
	exam1.java
	fall 2025
	prof. lehman
	sample answers for exam1
*/

public class exam1 {

    public static void main(String[] args) {

        // #1
        System.out.println(test(5)); // 2
        System.out.println(test(-5)); // 0
        System.out.println();

        // #2 option 1
        System.out.println(maskE("cheese")); // chs
        System.out.println(maskE("huntington")); // huntington
        System.out.println(maskE("excellent")); // xcllnt
        System.out.println();

        // #2 option 2
        System.out.println(maskE("cheese", 0)); // chs
        System.out.println(maskE("huntington", 0)); // huntington
        System.out.println(maskE("excellent", 0)); // xcllnt
        System.out.println();

        // #3
        // 3a. code file: test1.java
        // 3b. compile: javac test1.java
        // 3c.creates bytecode class file: test1.class
        // 3d.
        if (args.length > 0) {
            String word = args[0];
            System.out.println(maskE(word)); // use command line word
        }
        System.out.println();

        // #4 See Book class
        /*
         * // #5
         * Book novel = new Book();
         * novel.updateTitle("The Journey");
         * novel.updatePages(250);
         * System.out.println();
         * 
         * // #6
         * Book manual = new Book("Quick Guide", 40);
         * System.out.println();
         * 
         * // #7
         * System.out.println(novel);
         * System.out.println(manual.toString()); // alternate - less common
         * System.out.println();
         * 
         * // #8
         * int total = 0;
         * total = total + novel.pages();
         * System.out.println("total pages: " + total);
         * System.out.println();
         * 
         * // #9 - See Book class
         */
        /*
         * //#16
         * Stack s;
         * Stack s2
         * 
         * //place items in stack
         * //ie. s.push('A'), s.push('B'), s.push('C'), etc...
         * 
         * //move items from stack to stack 2
         * while (!s.empty())
         * {
         * s2.push( s.top() )
         * s.pop()
         * }
         * 
         * //move items from stack 2 back to stack
         * while (!s2.empty)
         * {
         * s.push( s2.top() );
         * s2.pop();
         * }
         * 
         */

    }// main

    // #1
    public static int test(int n) {
        System.out.println("in test n = " + n);
        if (n <= 1)
            return 0;
        else if (n % 2 == 0)
            return 1 + test(n - 1);
        else
            return 0 + test(n - 1);

    }// test

    // #2 first option
    // replaces every 'e' with '*'
    public static String maskE(String s) {
        // base case: empty string
        if (s.length() == 0)
            return "";

        char first = s.charAt(0);
        if (first == 'e')
            return "*" + maskE(s.substring(1));
        else
            return first + maskE(s.substring(1));
    }

    // #2 - second option
    public static String maskE(String s, int i) {

        // base case: reached end of string
        if (i >= s.length())
            return "";
        char ch = s.charAt(i);
        if (ch == 'e')
            return "*" + maskE(s, i + 1);
        else
            return ch + maskE(s, i + 1);
    }

}// class
