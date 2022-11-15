package Day03_Array;

public class Array_OddPosition 
{

	public static void main(String[] args) 
	{
		 int [] arr = new int [] {111, 20, 133, 143, 50};  
	        System.out.println("Elements of given array present on odd position: ");  
	        for (int i = 0; i < arr.length; i = i+2) {  
	            System.out.println(arr[i]);  
	        }  

	}

}
