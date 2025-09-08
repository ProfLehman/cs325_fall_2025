# Lab #3 Part C - Towers of Hanoi
- CS325 Data Structures  
- 10 points
- Due **Monday**, September 15th at 5:00 pm

---

## Purpose

The Towers of Hanoi is a classic mathematical puzzle that involves three rods and a set of disks of different sizes
that can slide onto any rod. The objective is to move the entire stack of disks from a starting rod to a target rod, 
following three simple rules: only one disk can be moved at a time, each move consists of taking the top disk from 
one rod and placing it on another rod, and no disk may be placed on top of a smaller disk.

The Towers of Hanoi problem is a classic puzzle that can be “solved” using **recursion**. A recursive solution
which determines the total number of moves is included below `towers.java`.


---

## Requirements
1. Using a spreadsheet, show the number of moves for 3 to 64 disks.
2. As part of your analysis determine and show the number of **moves per second** your computer can process. 
You can find this number by averaging the time it takes to process a specific number of moves that takes 
20 to 60 seconds such as 33 disks (The time will vary depending on the computer you are using, perform the 
calculation several times to get an average). 
3. Use the moves per second for your computer to calculate the **time (seconds, minutes, hours, days, years, etc... )** 
it would take your computer to process the moves for 3 to 64 disks. 
Note: leave the move messages “commented out” as they greatly
increase the processing time. 


## Towers Code

```java
// towers.java
// j.l. lehman
// fall 2025
// towers of Hanoi
//
// run in shell using
//    java towers 20
//    java towers 21

import java.util.GregorianCalendar;

public class towers {

	//global count for moves
	public static long count;
	
	public static void main(String[] args) {
	
			int d = 7; //number of disks defaults to 7
			
			//use command line argument for number of disks if given ie. java towers 10
			if (args.length > 0)
				d = Integer.parseInt( args[0] );
				
			//count moves
			count = 0;
			
			//start time
			GregorianCalendar startTime = new GregorianCalendar();
			long start = startTime.getTimeInMillis();
		    
			
			//call recursive towers function
			TOH(d, "A", "B", "Temp");
	
			
			//stop time
			GregorianCalendar stopTime = new GregorianCalendar();
			long stop = stopTime.getTimeInMillis();
			
			//calculate total seconds
			long diff = stop - start;
			double totalSeconds = (double) diff / (double) 1000;
			
			//calculate moves per second
			double mps = count / totalSeconds;
			
			System.out.println();
			System.out.println( count + " moves" );
			System.out.println("numbr of disks = " + d + ", time = " + totalSeconds + " seconds");
			System.out.printf( "%.0f moves per second", mps );
			System.out.println();	
			
	}
	
	private static void TOH(int n, String start, String goal, String temp) {
		
		if (n > 0)
		{
			TOH( n-1, start, temp, goal);
			
			//note: comment out print for analysis
			//System.out.println( "Move disk from " + start + " to " + goal);
			
			count++; //global count
			
			TOH( n-1, temp, goal, start);						
		}
		
	}//towers

}//class
```

---
## Submitting your assignment

Place your analysis in an Excel (or LibreOffice) spreadsheet and upload to Moodle

-- end --
