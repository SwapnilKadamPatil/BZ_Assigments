// Write a Program for the sum of n natural numbers
package Day02_Loops;

import java.util.Scanner;

public class SumOfNaturalNum 
{
	public static void main(String[] args) 
	{
		int i=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number =");
		int x=sc.nextInt();
		while(i<=x)
		{
			sum=i+sum;
			i++;
		}
		System.out.println("Sum of "+x+" is ="+sum);

	}

}
