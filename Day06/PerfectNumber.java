package Day06_LogicalProgram;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		
		for ( int i=1; i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(" This Number is perfect Number ");
		}
		else
		{
			System.out.println("this is not a perfect number ");
		}

	}

}
