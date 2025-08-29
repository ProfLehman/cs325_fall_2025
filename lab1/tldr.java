// tldr.java
// prof. lehman
// fall 2025
// tldr (too long, didn't read) Java Intro
// javac tldr.java, java tldr
public class tldr {
    public static void main(String[] args) {

        // raw data types
        int i = 7;
        double d = 9.8;
        char c = 'A';
        boolean b = true;

        // output
        System.out.println(i + ", " + d + ", " + c + ", " + b);
        System.out.println(); // blank line

        // if statements
        if (i < 10) {
            System.out.println("i < 10");
        } else if (i == 10) {
            System.out.println("i == 10");
        } else {
            System.out.println("i > 10");
        }
        System.out.println(); // blank line

        // while loop
        int x = 0;
        while (x < 5) {
            // formatted output
            System.out.printf("x = %d\n", x);
            x++;
        }
        System.out.println(); // blank line

        // for loop
        for (int y = 0; y < 5; y++) {
            System.out.println(y);
        }
        System.out.println(); // blank line

        // array
        int data[] = { 10, 20, 15, 23, 45 };

        for (int z = 0; z < data.length; z++) {
            System.out.printf("data[%d] => %d\n", z, data[z]);
        }
        System.out.println(); // blank line

        // call method (ie. function)
        System.out.println(doSomething(7));
        int answer = doSomething(89);
        System.out.println("Answer = " + answer);

    }// main

    // method adds 1000 to argument
    public static int doSomething(int temp) {
        temp = temp + 1000;
        return temp;
    }

}// class
