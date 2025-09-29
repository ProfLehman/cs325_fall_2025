/*
    Node2.java
	Fall 2025
	Lehman
	
	Demonstrates basic data node for linked-list structures
	
    Stores int data
*/
public class Node2 {
    ;
    public int data;
    public Node2 next;

    // default constructor
    public Node2() {
        data = -1;
        next = null;
    }

    // alternate constructor
    public Node2(int value) {
        data = value;
        this.next = null;
    }

}