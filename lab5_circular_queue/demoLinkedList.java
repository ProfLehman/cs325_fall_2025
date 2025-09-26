/**
 * LinkedList.java fall 2025
 * 
 * Demonstrates "hard coding" dynamic linked-list
 * 
 * Uses class Node.java
 * 
 * public class Node { public char data; public Node next; }
 * 
 * @author jlehman
 *
 */
public class demoLinkedList {

    public static void main(String[] args) {

        Node a = new Node();

        a.data = 'A';
        a.next = null;

        System.out.println(a.data); // A
        System.out.println(a.next); // null
        System.out.println();

        // create nodes b, c, and d
        Node b = new Node();
        b.data = 'B';
        b.next = null;

        Node c = new Node();
        c.data = 'C';
        c.next = null;

        Node d = new Node();
        d.data = 'D';
        d.next = null;

        // link node a to b, b to c, and c to d forming a "linked list"
        a.next = b;
        b.next = c;
        c.next = d;

        // display data
        System.out.println(a.data); // A
        System.out.println(b.data); // B
        System.out.println(c.data); // C
        System.out.println();

        // can use .next to reference linked notes
        System.out.println(a.next.data); // B
        System.out.println(a.next.next.next.data); // D
        System.out.println();

        System.out.println(a); // memory address for object a
        System.out.println();
        System.out.println(b); // memory address for object b
        System.out.println(a.next); // also memory address for object b
        System.out.println();

        // traverse linked list printing all values in list is A B C D
        Node temp = a;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println();

        // call recursive function to display list
        show(a);
        System.out.println(); // displays A B C D

        show(b); // start with second node
        System.out.println(); // displays B C D

        // create a new list with three nodes
        // generally label first node as "first" or "front" or "top" depending on ADT
        Node first = new Node('A', null); // first node
        first.next = new Node('D', null); // second node
        first.next.next = new Node('T', null); // third node

        show(first); // display list A D T

    }// main

    // method to display linked list, uses recursion
    public static void show(Node p) {
        if (p != null) {
            System.out.print(p.data + " ");
            show(p.next); // recursive call
        } else
            System.out.println();
    }

}// class