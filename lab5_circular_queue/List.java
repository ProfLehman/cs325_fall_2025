
// List.java
// fall 2021
// dr. lehman
// implements unsorted and unsorted 
// List ADT using dynamic memory

public class List {

	private Node first;
	private int size;

	public List() {
		first = null;
		size = 0;
	}

	public boolean empty() {
		return first == null;
	}

	public void reset() {
		first = null;
	}

	public int size() {
		return size;
	}

	public void add(char item) {
		
		// create new node with data (needed for both unsorted and sorted)
		Node temp = new Node();
		temp.data = item;

		// *** unsorted ***
		// add item to front of list
		// temp.next = first; 
		// first = temp;

		// *** sorted ***
		// add item keeping items sorted
		Node cur = first;
		Node prev = null;

		// look for insertion point, one node beyond
		boolean found = false;
		while (cur != null && !found) {
			if (cur.data > item)
				found = true; // item belongs before this node
			else {
				// advance cur and prev
				prev = cur;
				cur = cur.next;
			}
		}

		// add new node to front of list
		if (cur == first) {
			temp.next = first;
			first = temp;
		} else {
			// add new node to middle or end of list
			temp.next = cur;
			prev.next = temp;
		}

		
		// update size (needed for both unsorted and sorted)
		size++;

	}// add

	public boolean find(char item) {

		Node cur = first;
		boolean found = false;

		while (cur != null && !found) {
			if (cur.data == item)
				found = true;
			else {
				cur = cur.next;
			}
		}
		return found;
	}

	public void remove(char item) {

		Node cur = first;
		Node prev = null;
		boolean found = false;

		// position cur and prev for remove
		while (cur != null && !found) {
			if (cur.data == item)
				found = true;
			else {
				prev = cur;
				cur = cur.next;
			}
		}

		// remove item if found
		if (found) {
			if (prev == null) // first item in list
				first = first.next;
			else // second or later item in list
				prev.next = cur.next;
			size--;
		}
	}

	public String toString() {

		String result = "List(x" + this.size + "): ";

		if (!empty()) {
			Node temp = first;
			while (temp != null) {
				result = result + temp.data + " ";
				temp = temp.next;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		List g = new List();
	
		System.out.println(g);
		
		g.add('J');
		System.out.println(g);

		g.add('C');
		System.out.println(g);

		g.add('M');
		System.out.println(g);

		g.add('L');
		System.out.println(g);

		g.add('A');
		System.out.println(g);

		g.add('X');
		System.out.println(g);

		g.add('D');
		System.out.println(g);

		System.out.println();
		System.out.println(g.find('A'));
		System.out.println(g.find('J'));
		System.out.println(g.find('X'));
		System.out.println(g.find('N'));
		System.out.println();

		g.remove('A');
		System.out.println(g);

		g.remove('X');
		System.out.println(g);

		g.remove('J');
		System.out.println(g);

		g.remove('L');
		System.out.println(g);

		g.remove('D');
		System.out.println(g);

		g.remove('C');
		System.out.println(g);

		g.remove('M');
		System.out.println(g);

		System.out.println();
		g.add('J');
		System.out.println(g);

	}

}// class
