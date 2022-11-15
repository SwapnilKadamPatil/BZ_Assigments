package Day05_JavaProgram;

import java.util.Scanner;

public class TwoD_Array 
{

	public static void main(String[] args) 
	{
		int arr[][] = new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array");
		
		for(int i=0 ; i < arr.length ; i++) 
		{
			// System.out.println(arr.length);
			for(int j= 0; j < arr.length ; j ++ )
			{
				arr [i][j] = sc.nextInt();
			}
			System.out.println();
		}
	
		for(int i = 0 ; i < arr.length ; i++)   //i=0              i=1
		{
			for(int j = 0; j < arr.length; j++ ) //j=0  0<2   j++  j=1  1<2  j++  2<2 false  j=0 0<2
			{
				System.out.print(arr[i][j] + " "); //i=0 j=0   i=0 j=1          i=1  j=0  j++  j=1  i=1 j=1 j++
			}
			System.out.println();
		}

	}

}
