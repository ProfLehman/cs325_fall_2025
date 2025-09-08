
/*
 * fibonacci.java
 * fall 2025
 * dr. lehman
 * demonstrates algorithm analysis for recursive fibonacci number function
 * see spreadsheet analysis 
 */
import java.util.GregorianCalendar;

public class fibonacci {

	static long count = 0; // global class variable

	public static void main(String[] args) {

		// System.out.println(fib(6));

		for (int x = 0; x < 100; x++) {

			count = 0;

			// start time
			GregorianCalendar startTime = new GregorianCalendar();
			long start = startTime.getTimeInMillis();

			// call function
			long answer = fib(x);

			// stop time
			GregorianCalendar stopTime = new GregorianCalendar();
			long stop = stopTime.getTimeInMillis();

			// calculate total time
			long diff = stop - start;
			double totalSeconds = (double) diff / (double) 1000;

			// function calls per second
			double cps = (double) count / totalSeconds;

			System.out.printf("x %,d - fib %,d - calls %,d - seconds %,.0f - cps %,.0f\n", x, answer, count,
					totalSeconds,
					cps);
		}

	}// main

	// returns the nth Fibonacci number
	private static long fib(long n) {
		count++;
		if (n == 0 || n == 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}// fib

}// class