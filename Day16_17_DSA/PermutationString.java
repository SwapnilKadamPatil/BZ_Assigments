package Day16_17_DSA;

public class PermutationString 
{
	
	public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        PermutationString permutation = new PermutationString();
        permutation.permute(str, 0, n - 1);
    }
 
   
    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
 
    
    // Swap Characters at position
    
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

 
	
}

















 /*   
  * Create a function permute() with parameters as input string, starting index of the string, ending index of the string
    1.Call this function with values input string, 0, size of string – 1
    2.In this function, if the value of  L and R is the same then print the same string
    3.Else run a for loop from L to R and swap the current element in the for loop with the inputString[L]
    4.Then again call this same function by increasing the value of L by 1
    5.After that again swap the previously swapped values to initiate backtracking
    
	Link-: https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
*/