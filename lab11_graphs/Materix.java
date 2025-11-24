import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Matrix.java
// fall 2021
// prof. lehman
// demonstrates implementation of graph with matrix
// demonstrates breadth first and depth first searches

public class Matrix {

	public static void main(String[] args) {
		System.out.println("Graph as Matrix");

		// symbol table
		// 0 1 2 3 4 5
		String nodes[] = { "A", "B", "C", "D", "E", "F" };

		// matrix
		int data[][] = new int[nodes.length][nodes.length];

		// set edges
		data[0][1] = 8; // A -> B
		data[0][4] = 5; // A -> E

		data[1][2] = 5; // B -> C
		data[1][3] = 2; // B -> D

		data[2][5] = 1; // C -> F

		data[3][2] = 2; // D -> C
		data[3][5] = 3; // D -> F

		data[4][1] = 2; // E -> B
		data[4][3] = 3; // E -> D
		data[4][5] = 7; // E -> F

		
		
		// display nodes
		for (int c = 0; c < nodes.length; c++) {
			System.out.println(nodes[c]);
		}
		System.out.println();

		// print all edges
		for (int r = 0; r < nodes.length; r++) {
			for (int c = 0; c < nodes.length; c++) {
				if (data[r][c] > 0)
					System.out.println(nodes[r] + " -> " + nodes[c] + " : " + data[r][c]);
			}
		}
		System.out.println();

		
		
		// find index (assumes found) for single node
		String n = nodes[0];
		int i = 0;
		while (!nodes[i].equals(n))
			i++;

		// display adjacent nodes
		for (int c = 0; c < nodes.length; c++) {
			if (data[i][c] > 0)
				System.out.println(nodes[i] + " -> " + nodes[c] + " : " + data[i][c]);
		}
		System.out.println();

		
		
		// *** breadth first search ***
		System.out.print("BFS: ");

		// Java Collection Queue
		Queue<String> q = new LinkedList<String>();

		// add first node
		q.add(nodes[0]);

		boolean found[] = new boolean[nodes.length];
		found[0] = true;

		while (q.isEmpty() == false) {
			// get next node from queue
			String current = q.element();
			q.remove();

			System.out.print(current + " ");

			// find index of node
			i = 0;
			while (!nodes[i].equals(current))
				i++;

			// add adjacent nodes not found
			for (int c = 0; c < nodes.length; c++) {
				if (data[i][c] > 0 && found[c] == false) {
					q.add(nodes[c]);
					found[c] = true;
				}
			}

		}
		System.out.println();

		
		
		// *** depth first search ***
		System.out.print("DFS: ");

		// Java Collection Queue
		Stack<String> s = new Stack<String>();

		// add first node
		s.add(nodes[0]);

		found = new boolean[nodes.length];
		found[0] = true;

		while (s.isEmpty() == false) {
			// get next node from stack
			String current = s.peek();
			s.pop();

			System.out.print(current + " ");

			// find index of node
			i = 0;
			while (!nodes[i].equals(current))
				i++;

			// add adjacent nodes not found
			for (int c = 0; c < nodes.length; c++) {
				if (data[i][c] > 0 && found[c] == false) {
					s.add(nodes[c]);
					found[c] = true;
				}
			}

		}

	}// main

}// class
