package Day02_Loops;

import java.util.Scanner;

public class Reverse_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		
		//int num=1234;
		int result=0;
		
		for(   ; num > 0;   )
		{
			int rem=num%10;
			result=rem+result*10;
			num=num/10;
		}
		System.out.println(result);

	}

}
