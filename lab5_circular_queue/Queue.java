/**
 * Queue.java
 * fall 2019
 * 
 * Queue implemented with dynamic linked-list
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

public class Queue {

	//data
	Node front;
	Node back;
	int size;
	
	public Queue()
	{
		front = null;
		back = null;
		size = 0;
	}
	
	public void enqueue(char value)
	{
	   Node temp = new Node();
	   temp.data = value;
	   temp.next = null;
	   size++;
	   
	   //check for empty list
	   if (front == null)
	   {
		   front = temp;
		   back = temp;
	   }
	   else
	   {
		   	back.next = temp;  //links back to temp
		   	back = temp; //back points to temp
	   }
	}
	
	public void dequeue() {
		if (front != null) {
			//Node t = front;
			front = front.next; //would rely on JVM for garbage collection unless
		   // t = null;           //set to null which marks for removal by JVM
			size--;
		}
	}
		
	public char front()
	{
		if (front != null)
		 return front.data;
		else
	     return '?';
	}
	
	public int size() {
		return size;
	}
	
	public boolean empty()
	{
		return front == null;
	}
	
	public void destroy()
	{
		while (front != null)
		{
			Node t = front;
			front = front.next;
			t = null;//mark for removal by JVM
			size--;
		}
	}
	
	public String toString()
	{
		String result = "Q: ";
		
		Node t = front;
		while (t != null)
		{
			result += t.data + " ";
			t = t.next;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		System.out.println( q.front() );//?
		q.enqueue('A');
		System.out.println( q.front() );//A
		q.enqueue('B');
		System.out.println( q.front() );//A
		System.out.println( q.size() );//2
	
		System.out.println( q );//A B
		System.out.println();
		
		
		q.dequeue();
		System.out.println( q );//A
		System.out.println();
		
		for (int i=67; i<72; i++)
		{
			q.enqueue( (char) i ); //convert int to char
		}
		System.out.println( q );
		System.out.println();
		
		q.destroy();
		
		//remove all items from queue without destroy
		/*
		while (!q.empty())
		{
			q.dequeue();
			System.out.println( q );			
		}
		*/
		
		System.out.println( q );//?
		System.out.println( q.front() );//?
		System.out.println( q.size() );//0
		System.out.println();
		
		q.enqueue('A');
		System.out.println( q );//A
		System.out.println( q.front() );//A
		System.out.println( q.size() );//1
		
	}//main
	
}//class
