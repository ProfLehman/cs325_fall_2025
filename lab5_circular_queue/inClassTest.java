// inClassTest.java

public class inClassTest {
    public static void main(String[] args) {

        // create five nodes
        Node n1 = new Node('A');
        Node n2 = new Node('B');
        Node n3 = new Node('C');
        Node n4 = new Node('D');
        Node n5 = new Node('E');

        // link them
        n1.next = n3;
        n3.next = n5;
        n5.next = n2;
        n2.next = n4;

        System.out.println(n1.data); // 1. A

        System.out.println(n1.next.data); // 2. C

        System.out.println(n5.data); // 3. E

        Node temp = n5;

        System.out.println(temp.data); // 4. E

        System.out.println(temp.next.data); // 5. B

        System.out.println(temp.next.next.data); // 6. D

        // System.out.println(temp.next.next.next.next); // 7.

        System.out.println(temp);
        System.out.println(n5);

        System.out.println(n3);
        System.out.println(n1.next);

    }// main
}// class