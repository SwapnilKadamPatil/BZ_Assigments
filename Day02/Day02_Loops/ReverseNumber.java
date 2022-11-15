//Reverse Number
package Day02_Loops;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int rem;
		int result=0;
		
		while(num > 0)
		{
			rem=num%10;               //123 ->3 / 12->2 /1->1 /0
			result=rem + result * 10; //3+0*10=3/ 2+3*10=32 / 1+32*10= 321 
			num=num/10;               //12 /1 /0          
			
		}
		System.out.println(result);

	}

}
