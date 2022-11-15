//Write a Program to find Palindrome Number
package Day06_LogicalProgram;

import java.util.Scanner;

public class PalindromeNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		int rem;
		int sum=num;
		int rev=0;
		
		while ( sum > 0 )
		{
			rem=sum%10;      
			rev=rev*10+rem;
			sum=sum/10;
		}
		System.out.println(rev); //First reverse then check
		if(num==rev)
		{
			System.out.println(num + " is Palindrome Number");
		}
		else
		{
			System.out.println("this is Not a Palindrome Number");
		}
	}

}
