package Day16_17_DSA;

public class MargeSort_String 
{
	
	 static void selectionSort(String[] arr)
	    {
	        int n = arr.length;
	 
	        // One by one move boundary of
	        // unsorted subarray
	        for (int i = 0; i < n - 1; i++) 
	        {
	       
	            int min_idx = i;
	            for (int j = i + 1; j < n; j++)
	            {
	                if (isAlphabeticallySmaller(arr[j], arr[min_idx]))
	                {
	                    min_idx = j;
	                }
	            
	                String temp = arr[min_idx];
	                arr[min_idx] = arr[i];
	                arr[i] = temp;
	            }
	        }
	    }
	 
	    // Function to compare 2 words
	    static boolean isAlphabeticallySmaller( String str1, String str2 )
	    {
	        str1 = str1.toUpperCase();
	        str2 = str2.toUpperCase();
	        
	        if (str1.compareTo(str2) < 0) 
	        {
	            return true;
	        }
	        return false;
	    }
	 

	    public static void main(String[] args)
	    {
	        String[] Arr = { " Swapnil ", " Omkar ", " Jyoti ", " Neha " };
	        int N = Arr.length;
	        selectionSort(Arr);
	        
	        for (int i = 0; i < N; i++) 
	        {
	            System.out.println(Arr[i]);
	        }
	    }
	
}

