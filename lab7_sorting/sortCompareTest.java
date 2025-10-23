import java.util.Random;
import java.util.GregorianCalendar;

/**
 * sortDemo.java j.l. lehman
 *
 * @author (Jeff Lehman)
 * @version (October 1, 2019)
 */

public class sortCompareTest {

	// main test program - uses command line arguments to create and run instance of
	// sortDemo
	public static void main(String args[]) {

		// get size
		int size = 1000;
		char op = 'c';

		if (args.length == 2) {
			size = Integer.parseInt(args[0]);
			op = args[1].charAt(0);
		}

		if (op == 'c')
			System.out.printf("%,d comparisons\n", size);
		else
			System.out.printf("%,d swaps\n", size);

		// setup array
		int data[] = new int[size];
		Random rn = new Random();

		for (int x = 0; x < size; x++)
			data[x] = rn.nextInt(size);

		// start clock
		GregorianCalendar time = new GregorianCalendar();
		long start = time.getTimeInMillis();

		// compare test
		for (int x = 0; x < size; x++) {
			int xPos = rn.nextInt(size); // random position in array
			int yPos = rn.nextInt(size); // random position in array

			switch (op) {

			case 'c':
				// compare
				int large = -1;
				if (data[xPos] >= data[yPos])
					large = xPos;
				else
					large = yPos;
				break;

			case 's':
				// swap
				int temp = data[xPos];
				data[xPos] = data[yPos];
				data[yPos] = temp;
				break;

			default:
				System.out.println("Invalid operation use 'c' or 's'");
			}
		} // for

		// stop clock
		time = new GregorianCalendar();
		long stop = time.getTimeInMillis();

		long diff = (stop - start) / 1000;

		System.out.println();
		System.out.printf("Time: %,d seconds\n", diff);
		System.out.println();
	}// main

}// class
