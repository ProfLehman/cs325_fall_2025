
//node.java
//dr. lehman
//fall 2025
//node for dynamic linked list

public class node {

	//data
	public long data; //data for node
	public node next; //link to next node
	
	//default constructor
	public node() {
		data = 0;
		next = null;
	}
	
	//alternate constructor - set initial data
	public node(long d) {
		data = d;
		next = null;
	}
	
	//alternate constructor - set initial data and next node
	public node(long d, node n) {
		data = d;
		next = n;
	}
		
}//class
