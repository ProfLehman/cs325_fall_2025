/**
 * Stack.java
 * fall 2019
 * 
 * Stack implemented with dynamic linked-list
 * 
 * Uses class Node.java
 *  
 *    public class Node {
 * 	      public char data;
 * 	      public Node next;
 *     }
 * 
 * @author jlehman
 *
 */
public class Stack {

	// data for stack
	Node top;
	int size;
	
	public Stack() {
		top = null; // empty stack
		size = 0;
	}

	public void push(char c) {
		Node temp;
		temp = top;
		top = new Node();
		top.data = c;
		top.next = temp;
		size++;
	}

	public char top() {
		if (top != null)
			return top.data;
		else
			return '?';
					
	}

	public void pop() {
		if (top != null) {
			//Node temp = top; //
			top = top.next; //relies on JVM for garbage collection
			//temp = null; //mark as null to help with garbage collection
			size--;
		}
	}
	
	public void destroy()
	{
		top = null;
		size = 0;
	}

	public int size() {
		return size;
	}
	
	public boolean empty()
	{
		return top == null;
	}

	public static void main(String args[]) {
		Stack s = new Stack();
		
		System.out.println("size: " + s.size() + ", top: " + s.top());
		
		
		s.push('X');
		s.push('Y');
		s.push('Z');
		System.out.println("size: " + s.size() + ", top: " + s.top());
	
		
		s.pop();
		System.out.println("size: " + s.size() + ", top: " + s.top());
		
		int count = 0;
		while (count < 10)
		{
			s.push( (char) (count+65) );
			System.out.println("size: " + s.size() + ", top: " + s.top());
			count++;
		}
		
		s.destroy();
		System.out.println("size: " + s.size() + ", top: " + s.top());
		
	}// main

}// class
