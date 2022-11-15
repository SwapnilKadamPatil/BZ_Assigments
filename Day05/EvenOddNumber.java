package Day05_JavaProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : " );
		int num=sc.nextInt();
		
		if(num % 2 == 0)    // if reminder is 1 -> Odd Number and Reminder is 0 -> Even
		{
			System.out.println("it is Even Number");
			
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
