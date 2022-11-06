package Day05_JavaProgram;

import java.util.Scanner;

public class StopWatch 
{
	static double start = 0, stop = 0;

	static void startTime()            //Function to put start time and print it
	{                 
		start = System.currentTimeMillis();
		System.out.println("started at " + start);
	}

	
	static void stopTime()           //function to put stop time and print it
	{                 
		stop = System.currentTimeMillis();
		System.out.println("stopped at " + stop);
	}

	
	static void elapsedTime()      ////function to calculate elapsed time and print it
	{              
		System.out.println("elapsed time is " + (stop - start) / 1000);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 to start");
		s.next();
		startTime();
		System.out.println("enter to stop");
		s.next();
		stopTime();
		elapsedTime();
	}
}
