## Stack class

```java
//StackCharArray.java
//dr. lehman
//fall 2025
//class to implement stack ADT with array
//

public class StackCharArray {

	//data
	private char data[];
	private int top;
	private int MAX;
	private int size;
	
	//methods

	/**
	 * create empty stack with max size 5
	 */
	public StackCharArray() {
		MAX = 5;
		data = new char[MAX];
		top = data.length;
		size = 0;
	}
	
	/**
	 * create stack with max size m
	 * 
	 * @param m max size of array
	 */
	public StackCharArray(int m) {
		MAX = m;
		data = new char[MAX];
		top = data.length;
		size = 0;
	}
	
	/**
	 * add char to stack
	 * 
	 * @param v char to add
	 */
	public void push(char v) {
		if (!full()) {
			top--;
			data[top] = v;
			size++;
		}
	}
	
	/**
	 * returns last item added to stack (does not remove item) 
	 * or '?' if stack is empty
	 * 
	 * @return top item or '?' if empty
	 */
	public char top() {	
		if (!empty())
			return data[top];
		else
			return '?';
	}

	/**
	 * remove last item added to stack
	 */
	public void pop() {
		if (!empty()){
			top++;
			size--;
		}		
	}
	
	/**
	 * returns empty if not items on status
	 * 
	 * @return true if stack empty
	 */
	public boolean empty() {
		return top == MAX;
	}
	
	/**
	 * returns true if size equals max
	 * 
	 * @return true if stack is full
	 */
	public boolean full() {
		return top == 0;
	}
	
	/**
	 * returns number of items stored in stack
	 * 
	 * @return number of items stored in stack
	 */
	public int size() 
	{
		return size;
	}
	
}//class
```

## test code

```
//testStack.java
//dr. lehman
//fall 2025
//tests ArrayCharStack

public class testStack {

	public static void main(String[] args) {
		
		StackCharArray a = new StackCharArray(); //default constructor
		
		//add letters a, b, c, d
		a.push( 'a' );
		a.push( 'b' );
		a.push( 'c' );
		
		System.out.println( a.top() ); //c
		System.out.println( a.size() ); //3

		a.pop();
	
		System.out.println( a.top() ); //b
		System.out.println( a.size() ); //2
		
		a.push('d'); //add letter d
		
		System.out.println( a.top() ); //d
		System.out.println();
		
		//alternate constructor
		StackCharArray b = new StackCharArray(150);
		
		System.out.println( b.size() ); //0
		
		//add letters A to M
		for (int x=65; x<=77; x++)
			b.push( (char)x ) ;//type cast to ASCII
		
		System.out.println( b.size() ); //13
		 
		//display all values in stack (top) M L K J I H G F E D C B A
		while (!b.empty())
		{
			System.out.print( b.top() + " " );
			b.pop();
		}
		
		System.out.println();
		System.out.println( b.size() ); //0
		System.out.println( b.top() ); //? denotes undefined
		
		//asserts
		//test with java -ea StackTest
		assert b.size() == 0: "Error: expect size 0";

		//note: invalid assert to demonstrate error
		assert b.size() == 1: "Error: expect size 1";
		
				
	}//main

}//class
```