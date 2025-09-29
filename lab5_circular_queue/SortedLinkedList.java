class SortedLinkedList {
    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
