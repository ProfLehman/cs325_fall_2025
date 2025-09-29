class SortedLinkedList {
    private Node2 head;

    public void insert(int value) {
        Node2 newNode = new Node2(value);
        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node2 current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void print() {
        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
