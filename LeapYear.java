package Day05_JavaProgram;

import java.util.*;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year here : ");
		int year=sc.nextInt();
		
	/*	if(year > 1000)
		{
			System.out.println("invalid year" + year);
		}
	*/
		if(year % 400 == 0) //if reminder is 1 then not leap year
        {
			System.out.println("This is a Leap Year : "+year);
        }
        else if (year % 100 == 0)
        {
			System.out.println("This is Not a Leap Year : "+year);
        }
        else if(year % 4 == 0)
        {
			System.out.println("This is a Leap Year : "+year);
        }
        else
        {
			System.out.println("This is a Not Leap Year : "+year);
        }

	}

}
