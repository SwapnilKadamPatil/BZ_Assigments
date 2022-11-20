package Day16_17_DSA;

import java.util.Arrays;

public class InsertionSort 
{
	static void sortString(String str) 
	{
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
 

	public static void main(String[] args) 
	{
        String s = "I LOVE COADING";  //Sorting Char -> A C D E G I I L N O O V
        String s1= "ACBEDJKLFIHGMN";
        sortString(s);
        System.out.println();
        sortString(s1);
    }
	
}
