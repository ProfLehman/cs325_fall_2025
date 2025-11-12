
// arraysTree.java
// 11.2.2021
// j.l. lehman
//
// store tree with parallel arrays
//
//               77
//             /    \
//            14    80
//           /  \   
//          3    17
//         / \     \
//        1  6     71
//

public class arraysTree {

	public static void main(String args[])
	{
		//tree is "hard coded"
		
		//             0   1   2   3, 4,  5    6   7   8   9  10
		int data[] = {14,  6,  1, -1, 3, 17,  71, 77, 80, -1, -1};
		int left[] = { 4, -1, -1, -1, 2, -1,  -1,  0, -1,  3,  9};
		int right[] ={ 5, -1, -1, -1, 1,  6,  -1,  8, -1, -1, -1};

		int root = 7;
		int free = 10; //free has index of first available node
		
		//display all values in tree
		System.out.println();
		traverse( data, left, right, root );
		
		//show available spaces in array
		System.out.println();
		System.out.println();
		showAvailable( left, free );
	}
	
	//traverse tree
	public static void traverse(int data[], int left[], int right[], int p)
	{
		if (p != -1)
		{
			//change order for inorder, preorder, postorder traversals
			traverse( data, left, right, left[p] );
			System.out.print( data[p] + " ");
			traverse( data, left, right, right[p] );
		}
	}
	
	//traverse free list in array
	public static void showAvailable( int link[], int p )
	{
		while (p != -1)
		{
			System.out.printf( "array index %d is available\n", p);
			p = link[p];
		}
	}
	
}