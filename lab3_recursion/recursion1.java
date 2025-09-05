
//recursion1.java
//dr. lehman
//fall 2021 (modified from 2019, 2017, 2015)
//demonstrates use of recursion

public class recursion1 {

	public static void main(String[] args) {
		
		countDown(5);
		
		countUp(1,5);
		countUp(5,20);
		
		System.out.println( fact(5) );

		
		for (int x=1; x<=25; x++)
			System.out.println( x + " : " + fact(x) );

				
		for (int x=1; x<=25; x++)
			System.out.println( x + " : " + fact2(x) );
				
		
		binary(19);
		System.out.println();
		
		
		base(10, 4);
		System.out.println();
		
		
		backward("Huntington University");
		System.out.println();
		
		
		backward("Thursday");
		System.out.println();
		
		backward2("Windows 11");
		System.out.println();
		backwardHelper("Huntington", 9);
		System.out.println();
		
		System.out.println( backward3("Friday") );
		
		System.out.println( countIf("Mississippi", "i", 0) );
		
		//neverEnd(0);
	}//main


	//count down from x to 1
	public static void countDown(int x)
	{
		//System.out.println( "Start countDown: " + x);
		if (x > 0)  //implied base case x <= 0
		{
			System.out.println( x );
			countDown( x-1 );//recursive call						
		}
		System.out.println( "End countDown: " + x);
		
	}
	
	//count up from start to stop
	public static void countUp(int start, int stop)
	{
		if (start <= stop)  //implied base case of start > stop
		{
			System.out.println( start );
			countUp(start+1, stop); //recursive call
		}
		else
		{
			//base case is "do nothing"
			System.out.println( "done " + start );
		}
		System.out.println("Done start = " + start);
	}
	
	//factorial
	public static int fact(int x)
	{
		if (x == 0 || x == 1)  //base case
			return x;
		else
			return x * fact( x-1 );//recursive call
	}

	//factorial - uses long
	public static long fact2(long x)
	{
		if (x == 0 || x == 1)  //base case
			return x;
		else
			return x * fact2( x-1 );//recursive call
	}
	
	//convert to binary
	public static void binary(int x)
	{
		if (x == 0 || x == 1)  //base case
			System.out.print( x );
		else
			{
				binary( x/2);//recursive call
				System.out.print( x%2 );
			}
	}
	
	//convert to any base
	public static void base(int x, int b)
	{
		if (x<b)  //base case
			System.out.print( x + " ");
		else
			{
				base(x/b, b); //recursive call
				System.out.print( x%b + " " );
			}
	}
	
	//display backward
	public static void backward(String s)
	{
		//System.out.println("Start: " + s);
		if (s.length() > 0)  //base case
		{
			System.out.print( s.charAt(s.length()-1));
			backward( s.substring(0,s.length()-1) ); //recursive call	
		}
	}
	
	//display backward - using helper
	public static void backward2(String s)
	{
		backwardHelper(s, s.length()-1 );
	}
	
	//display backward - recursive helper function
	public static void backwardHelper(String s, int i)
	{
		if (i >= 0)  //base case
		{
			System.out.print( s.charAt(i) );
			backwardHelper( s, i-1 ); //recursive call	
		}
	}
	
	//return backward
	public static String backward3(String s)
	{
		if (s.length() > 0)  
		{
			return s.substring(s.length()-1) + 
			  backward3( s.substring(0,s.length()-1) ); //recursive call	
		}
		else
			return ""; //base case
	}

	//count number of string value v's in s
	public static int countIf(String s, String v, int i) 
	{	
		if (i >= s.length()) //base case
			return 0;
		else			
			if (s.substring(i,  i+1).equals(v))
				return 1 + countIf(s, v, i+1); //recursive call
			else
				return 0 + countIf(s, v, i+1); //recursive call
	}

	//infinite calls - will it end?
	//what happens if use long x rather than int x?
	public static void neverEnd(int x)
	{
		System.out.println(x);
		neverEnd( x + 1);
	}
	
}//recursion1
