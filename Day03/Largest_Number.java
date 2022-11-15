//Java Program to print the largest element in an array
package Day03_Array;

public class Largest_Number
{
	public static void main(String[]args)
	{
		int arr[]=new int [5];
		
		int arr1[]={25, 10, 30, 7, 55};
		int max=arr1[0]; //initialize max with 1st eliment of array
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]>max)
			{
				max=arr1[i];
			} 
		}
		System.out.println("Largest number present in arry is = "+ max);
	}
	
}
