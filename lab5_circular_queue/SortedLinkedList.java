// SortedLinkedList.java
// fall 2025
// prof. lehman
//
// demonstrates sorted dynamic linked list
// uses Node2.java to store single int
//
class SortedLinkedList {

    // data
    private Node2 head;
    private int size;

    public SortedLinkedList() {
        head = null;
        size = 0;
    }

    public void insert(int value) {

        // create new node
        Node2 newNode = new Node2(value);

        // check to see if value goes at head (new first item)
        if (head == null || value < head.data) {
            // if (value < head.data || head == null) { //*** be careful, can not check
            // .data if null
            newNode.next = head;
            head = newNode;
        } else {
            // item after head (first item)

            // move current to item before insertion point
            Node2 current = head;
            while (current.next != null && current.next.data < value) {
                current = current.next;
            }

            // link in new node
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public String toString() {
        String result = "";

        Node2 current = head;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        return result;
    }

}// class
