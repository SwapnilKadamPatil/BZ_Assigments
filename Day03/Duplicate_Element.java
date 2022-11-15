package Day03_Array;

public class Duplicate_Element 
{

	public static void main(String[] args) 
	{
		int [] arr = new int [] {10, 20, 30, 40, 20, 70, 80, 80, 30, 10, 80};

		System.out.println("Duplicate elements in given array: ");  
		for(int i = 0; i < arr.length; i++)    ////Searches for duplicate element
		{  
			for(int j = i + 1; j < arr.length; j++) 
			{  
				if(arr[i] == arr[j])
				{
					System.out.print(arr[j] + ", ");
				}
			}  
		}  

	}

}
