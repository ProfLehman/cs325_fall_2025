/*
    Node2.java
	Fall 2025
	Lehman
	
	Demonstrates basic data node for linked-list structures
	
    Stores int data
*/
public class Node2 {

    public int data;
    public Node2 next;
    public int[] arr;

    // default constructor
    public Node2() {
        this.data = -1;
        this.next = null;
        this.arr = new int[100000000]; // array of ints
    }

    // alternate constructor
    public Node2(int value) {
        data = value;
        this.next = null;
        this.arr = new int[100000000]; // array of ints
    }

}