package Day02_Loops;

import java.util.Scanner;

public class Operator_MaxMin 
{

	public static void main(String[] args) 
	{
		{
			int max, min, result;
			int a=10;
			int b=5;
			int c=20;
				
			result=a+b*c;
			System.out.println(result);
		
			result=c+a/b;
			System.out.println(result);
		
			result=a%b+c;
			System.out.println(result);
		
			result=a*b+c;
			System.out.println(result);
		}
		System.out.println("=======================================");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int min=num1 > num2 ? num2 : num1;
		int max=num1 > num2 ? num1 : num2;
		
		System.out.println("Min Number is = "+ min + " Max number is = "+ max);
		
	}

}
