package Day03_Array;

public class Array_EvenPosition
{

	public static void main(String[] args) 
	{
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		  
        System.out.println("Elements of given array present on even position: ");  
        for (int i = 1; i < arr.length; i = i+2) 
        {  
            System.out.println(arr[i]);  
        }  

	}

}

/*
  for (int i = 1; i < arr.length; i = i+2)
 Loop through the array by incrementing value of i by 2  
 i will start from 1 as first even positioned element is present at position 1.  
 */
