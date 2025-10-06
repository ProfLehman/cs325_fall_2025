
import java.util.LinkedList;
import java.util.Queue;

// createIntQueue.java
// prof. lehman
// fall 2025
// demonstrates creating a Queue of int values from string

public class demo3 {

    public static void main(String[] args) {

        String s = "0123456789";

        Queue<Integer> q = new LinkedList<Integer>();

        System.out.println(q);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            int temp1 = (int) c - 48; // type case to int and subtract 48

            int temp2 = Character.getNumericValue(c);

            int temp3 = Integer.parseInt(s.substring(i, i + 1));

            q.add(temp1);
            // q.add(temp2);
            // q.add(temp3);

            System.out.println(q);
        }

        System.out.println();

        System.out.println(q);

        while (q.isEmpty() == false) {
            System.out.println("front " + q.element());
            System.out.println();

            q.remove();
            System.out.println(q);
        }
    }// main

}// class
