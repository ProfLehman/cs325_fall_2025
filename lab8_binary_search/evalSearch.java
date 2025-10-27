
// evalSearch.java (updated evalSearchF08.cpp)
//j.l. lehman
//fall 2017, modified fall 2019, fall 2021
//
//sequential
//binary search - recursive
//binary search - while loop
//binary search - Jon Bently (removes recursion and loop)
//
//Note: array size for searching is always 1048576
//
//Program varies the number of searches to demonstrate the time differences for using
//each search approach.
//

import java.util.GregorianCalendar;

public class evalSearch {

	// sequential search - while loop
	public static int sequentialSearch(int first, int last, int item, int a[]) {
		boolean found = false;
		while (first <= last && !found) {
			if (a[first] == item)
				found = true;
			else if (a[first] > item) // stop early - only used if items sorted
				found = true;
			else
				first++;
		} // while

		if (found && a[first] == item)
			return a[first];
		else
			return -1;
	}// sequentialSearch


	// binary search - while loop - Malik Page 531
	public static int binarySearchLoop(int first, int last, int item, int a[]) {
		int mid = -1;
		boolean found = false;
		while (first <= last && !found) {

			mid = (first + last) / 2;

			if (a[mid] == item)
				found = true;
			else if (a[mid] > item)
				last = mid - 1;
			else
				first = mid + 1;
		} // while

		if (found)
			return mid;
		else
			return -1;
	}

	// binary search - recursive
	public static int binarySearch(int first, int last, int item, int a[]) {

		int mid = (first + last) / 2;

		if (item == a[mid])
			return mid;
		else {
			if (first >= last)
				return -1;
			else {
				if (item > a[mid])
					return binarySearch(mid + 1, last, item, a);
				else
					return binarySearch(first, mid - 1, item, a);
			}
		}
	}

	// binary search - if - Jon Bently, Programming Pearls, Page 87
	public static int binarySearchIf(int first, int last, int item, int a[]) {
		int L = 0;

		if (a[524288] < item)
			L = 524288;
		if (a[L + 262144] < item)
			L = L + 262144;
		if (a[L + 131072] < item)
			L = L + 131072;
		if (a[L + 65536] < item)
			L = L + 65536;
		if (a[L + 32768] < item)
			L = L + 32768;
		if (a[L + 16384] < item)
			L = L + 16384;
		if (a[L + 8192] < item)
			L = L + 8192;
		if (a[L + 4096] < item)
			L = L + 4096;
		if (a[L + 2048] < item)
			L = L + 2048;
		if (a[L + 1024] < item)
			L = L + 1024;

		if (a[L + 512] < item)
			L = L + 512;
		if (a[L + 256] < item)
			L = L + 256;
		if (a[L + 128] < item)
			L = L + 128;
		if (a[L + 64] < item)
			L = L + 64;
		if (a[L + 32] < item)
			L = L + 32;
		if (a[L + 16] < item)
			L = L + 16;
		if (a[L + 8] < item)
			L = L + 8;
		if (a[L + 4] < item)
			L = L + 4;
		if (a[L + 2] < item)
			L = L + 2;
		if (a[L + 1] < item)
			L = L + 1;

		// cout << "L = " << L << " ";

		int P;
		if (a[L] == item) // special case for item 0
			P = L;
		else
			P = L + 1;

		if (P > 1048575 || a[P] != item) // not found
			P = -1;

		return P;
	}

	public static void main(String[] args) {
		
		// fill array with even numbers 0,2,4, 6...
		int n = 1048576; //max value for Bently search
		int data[] = new int[n];
		int num = 0;

		for (int x = 0; x < n; x++) {
			data[x] = num;
			num += 2;
		}

		//Note: for 2019, used 200,000,000 to show 16 seconds, 18 seconds, and 10 seconds for binary searches
		//      need to disable sequential search for higher values
		
		//Note: for 2021, used 200,000,000 to show 9 seconds, 11 seconds, 7 seconds for binary searches (i5 10th generation, 8 gb ram)
		//      need to disable sequential search for higher values
		//      for 2021, used 500,000 to show 23 seconds for sequential search
		
		int numSearches =200000000; //*** disable sequential search for this number
		//int numSearches =500000;
		
		
		int numFound = 0;
		int numNotFound = 0;

		// ********** START Time *********
		GregorianCalendar time;
		long start;
		long stop;
		time = new GregorianCalendar();

		String tests[] = { "Sequential Search", "Binary Search Loop", "Binary Search - Recursive",
				"Binary Search - if (Bentley" };

		for (int t = 0; t < tests.length; t++) {

			time = new GregorianCalendar();
			start = time.getTimeInMillis();

			numFound = 0;
			numNotFound = 0;
			int test = 0;
			int s = 0;

			for (int x = 0; x < numSearches; x++) {

				switch (t) {
				case 0:
					//test = sequentialSearch(0, n-1, s, data); //disabled for larger numSearches ie. comment out //
					break;
				case 1:
					test = binarySearchLoop(0, n - 1, s, data);
					break;
				case 2:
					test = binarySearch(0, n - 1, s, data);
					break;
				case 3:
					test = binarySearchIf(0, n - 1, s, data);
					break;
				}

				if (test == -1)
					numNotFound++;
				else
					numFound++;

				s += 1;

				// wrap search values so that 1/2 found, 1/2 not found
				if (s > 2097151) {
					s = 0;
				}
			}

			// ********** STOP Time *********
			time = new GregorianCalendar();
			stop = time.getTimeInMillis();

			System.out.println();
			System.out.println("            Test: " + tests[t]);
			System.out.println("    Number Found: " + numFound);
			System.out.println("Number Not Found: " + numNotFound);
			// stop time
			long diff = (stop - start) / 1000;

			System.out.println();
			System.out.printf("Time: %,d seconds\n", diff);
			System.out.println();
		}
		System.out.println("Tests Complete");
	}// main

}// class
