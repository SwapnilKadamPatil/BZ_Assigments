package Day03_Array;

public class Ascending_Order 
{

	public static void main(String[] args) 
	{
		 int [] arr = new int [] {50, 120, 80, 70, 110};     
	        int temp = 0; 
	        
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            for (int j = i+1; j < arr.length; j++) 
	            {     
	               if(arr[i] > arr[j]) 
	               {    
	                   temp = arr[i];    // Swapping and check 
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }
	            }
	        }             
	          
	        System.out.println("Elements of array Print in ascending order: ");    
	        for (int i = 0; i < arr.length; i++)
	        {     
	            System.out.print(arr[i] + " ");    
	        }    

	}

}
