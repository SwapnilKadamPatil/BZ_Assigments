package Day03_Array;

public class Smallest_element 
{
	public static void main(String []args)
	{
		int arr[]=new int [5];
		
		int arr1[]={25, 10, 30, 7, 55};
		int min=arr1[0]; //initialize max with 1st eliment of array
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]<min)
			{
				min=arr1[i];
			} 
		}
		System.out.println("Smallest number present in arry is = "+ min);
	}
}
