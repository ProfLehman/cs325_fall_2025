//hashTest.java
//dr. lehman
//fall 2025
//demonstrate hashChaining class

public class hashTest {

    public static void main(String[] args) {

        // create hash table that can hold 13 values
        hashChaining myApp = new hashChaining(17);

        int keys[] = { 189, 345, 123, 999, 222, 444, 555, 874 };

        for (int x = 0; x < keys.length; x++) {
            myApp.insert(keys[x]);
        }

        System.out.println(keys.length + " keys inserted");
        System.out.println();

        for (int x = 0; x < keys.length; x++) {
            System.out.println("find " + keys[x] + " " + myApp.find(keys[x]));
        }

        System.out.println();
        myApp.showStats();

    }// main

}// class
