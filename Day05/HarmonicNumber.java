package Day05_JavaProgram;

import java.util.Scanner;

public class HarmonicNumber
{
	static double result(int num)
	{
		float result = 1;
		
	    for (int i = 2; i <= num; i++)         //i=2    2 < 5 tru      i=3  3<5 tru      4   5<5 false
	    {
	        result = result + (float) 1 / i;   //res= 1 + 1/2 = 1.5    res= 1.5 + 1/3 = 
	    }
	    return result;                         //res=1.5   i++         res=      i++     i++
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number : ");
		int num=sc.nextInt();
		
		System.out.println(result(num));                   //when loop is terminated the print Result. 
	}

}
