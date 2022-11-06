package Day05_JavaProgram;

import java.util.Scanner;

public class QuotientRemainder 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int divident=sc.nextInt();
		System.out.println("Enter second Number :");
		int divisor=sc.nextInt();
		
		int quotient = divident / divisor ;
		int remainder = divident % divisor ;
		
		System.out.println(" Quotient = " + quotient);
		System.out.println(" Remainder = " + remainder);

	}

}
