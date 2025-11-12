/**
 * tree.java
 * fall 2021
 * 
 * @author jlehman
 * @description demonstrates binary search trees
 * using static methods
 */
public class tree {


	public static void inorder(Node n)
	{
		if (n != null)
		{
			inorder(n.left);
			System.out.print( n.data + ", " );
			inorder(n.right);
		}
	}
	
	public static Node insert(Node n, int v)
	{
		if (n == null)
		{
			System.out.println( "adding " + v);
			
			n = new Node();
			n.data = v;
			n.left = null;
			n.right = null;
		}
		else
			if (v < n.data)
				n.left = insert(n.left, v);
			else
				n.right = insert(n.right, v);
		
		return n;
	}//insert
	
	
	public static boolean find(Node n, int v)
	{
		if (n == null)
			return false;
		else
			if (n.data == v)
				return true;
			else
				if (v < n.data)
					return find(n.left, v);
				else
					return find(n.right, v);
	}
	
	public static int height(Node n, int level) {
		if (n == null)
			return level;
		else {
			int leftHeight = height(n.left, level + 1);
			int rightHeight = height(n.right, level + 1);
			if (leftHeight > rightHeight)
				return leftHeight;
			else
				return rightHeight;
		}
	}
	
	public static void main(String[] args) {

		Node root = null;
		
		root = insert(root, 10);
		root = insert(root, 5);
		root = insert(root, 20);
		root = insert(root, 15);

		inorder(root);
		System.out.println();
		
		
		System.out.println( find(root, 15) );
		System.out.println( find(root, 7) );
		
		System.out.println( "height = " + height(root, 0) );
	}

}//class