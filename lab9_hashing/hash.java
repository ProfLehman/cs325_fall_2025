//hash.java
//dr. lehman
//fall 2025
//demonstrate hashChaining class

public class hash {

    public static void main(String[] args) {

        //create hash table that can hold 13 values
        hashChaining myApp = new hashChaining(17);

        myApp.insert(170);
        myApp.insert(15);
        myApp.insert(29);
        myApp.insert(38);
        myApp.insert(1);
        myApp.insert(14);
        myApp.insert(131);

        System.out.println("find 170 " + myApp.find(170));
        System.out.println("find 15 " + myApp.find(15));
        System.out.println("find 29 " + myApp.find(29));
        System.out.println("find 38 " + myApp.find(38));
        System.out.println("find 162 " + myApp.find(162));
        System.out.println("find 14 " + myApp.find(14));
        System.out.println("find 1 " + myApp.find(1));
        System.out.println("find 131 " + myApp.find(131));

        myApp.showStats();	
    }//main

}//class
