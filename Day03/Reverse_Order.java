package Day03_Array;

public class Reverse_Order 
{

	public static void main(String[] args) 
	{
		int [] arr = new int [] {103, 201, 25, 676, 112};  
		
        System.out.println("Before Reverse array: ");  
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");
        
        System.out.println("Array after reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) 
        {  
            System.out.print(arr[i] + " ");  
        }  

	}

}
