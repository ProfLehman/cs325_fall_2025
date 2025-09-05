/*
 * recursion3.java
 * dr. lehman
 * fall 2021
 * demonstrates use of recursion
 *   for String processing
*/

public class recursion3 {
	
	static long count = 0;

	public static void main(String[] args) {

		String s = "Computer";
		s = "MississIppi";

		System.out.println("count: " + countVowelsOne(s));
		System.out.println("count: " + countVowelsTwo(s, 0));

	}// main


	// count vowels
	// uses removal of first letter of string to control when to stop
	private static int countVowelsOne(String s) {

		System.out.println(s);

		if (s.length() == 0)
			return 0;
		else if (isVowel(s.charAt(0)))
			return 1 + countVowelsOne(s.substring(1));
		else
			return 0 + countVowelsOne(s.substring(1));
	}

	// count vowels
	// uses index i to control when to stop
	// looks at the character at position i 
	private static int countVowelsTwo(String s, int i) {

		System.out.println(s + ", " + i);

		if (i >= s.length())
			return 0;
		else if (isVowel(s.charAt(i)))
			return 1 + countVowelsTwo(s, i + 1);
		else
			return 0 + countVowelsTwo(s, i + 1);
	}

	
	//
	// if using countVowelsTwo, we could
	// create a function countVowels to
	// eliminate needing to specify the 0
	//
	// private static int countVowels(String s) {
	// 	countVowelsTwo(s, 0); //calls recursive function
	// }

	
	// helper function for countVowels
	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
			return true;
		else
			return false;
	}

}// recursion3
