/*
 * recursion2.java
 * dr. lehman
 * fall 2021
 * demonstrates use of recursion for array processing
 * note use of helper recursive functions to simplify function calls
*/

public class recursion2 {

	public static void main(String[] args) {

		courseWork(126);
		System.out.println();

		int values[] = { 10, 20, 30, 40 };

		System.out.println("total: " + total(values));
		System.out.println("total: " + totalH(values, 0));
		System.out.println();

		System.out.println("greater: " + greater(values, 25));
		System.out.println("greater: " + greaterH(values, 25, 0, values.length));
		System.out.println();

		System.out.println("average: " + average(values));
		System.out.println("average: " + averageH(values, 0, 0));
		System.out.println();

	}// main

	/*
	 * *****************************************************************************
	 * ****** fun recursive function for course work
	 */
	public static void courseWork(int hours) {
		System.out.println("*** Beginning hours = " + hours);

		if (hours >= 128) // base case (when stop)
		{
			System.out.println(hours + " hours, You can graduate!");
		} else {
			System.out.println(hours + " hours, More course work needed ...");
			courseWork(hours + 1); // recursive call
		}

		System.out.println("*** End hours = " + hours);
	}

	
	/*
	 * *****************************************************************************
	 * ****** function to calculate sum of array values, calls recursive function
	 * total
	 */
	public static int total(int data[]) {
		return totalH(data, 0);
	}

	/*
	 * recursive function to calculate sum of array values
	 * 
	 * sum is "stored" in return variable i is index of value to add base case
	 * relies on stopping once i reaches length of array
	 */
	public static int totalH(int data[], int i) {
		if (i < data.length)
			return data[i] + totalH(data, i + 1); // recursive call
		else
			return 0; // base case when i is >= array length
	}

	
	/*
	 * *****************************************************************************
	 * ****** function to count number of items in array > n using recursive
	 * function greaterH
	 */
	public static int greater(int data[], int n) {
		return greaterH(data, n, 0, data.length);
	}

	/*
	 * recursive function counts number of items in array > n
	 * 
	 * temp is int[] n is item to compare i is starting position in array to compare
	 * max is number of items in array note: could eliminate max if using .length
	 * property of array
	 */
	public static int greaterH(int temp[], int n, int i, int max) {
		if (i >= max) // base case
			return 0;
		else {
			if (temp[i] > n)
				return 1 + greaterH(temp, n, i + 1, max); // recursive call
			else
				return 0 + greaterH(temp, n, i + 1, max); // recursie call
		}
	}

	
	/*
	 * *****************************************************************************
	 * ****** function to calculate average of values in array
	 */
	private static double average(int[] values) {
		return averageH(values, 0, 0);
	}

	/*
	 * recursive helper function for sumArray
	 */
	public static double averageH(int temp[], int i, double sum) {
		if (i >= temp.length) // base case
			return sum / temp.length;
		else
			return averageH(temp, i + 1, sum + temp[i]); // recursive call
	}

}// recursion2
