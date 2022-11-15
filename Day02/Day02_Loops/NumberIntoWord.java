//Read a single Digit Number and write in word
//Every digit of the given number has been converted into its corresponding word

package Day02_Loops;

import java.util.Scanner;

public class NumberIntoWord {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        
        System.out.print("Enter an Digit =");
        char digit = scanner.next().charAt(0);
		
		switch (digit)
	    {
	 
	    // For digit 0
	    case '0':
	        System.out.print("Zero ");
	        break;
	 
	    // For digit 1
	    case '1':
	        System.out.print("One ");
	        break;
	 
	    // For digit 2
	    case '2':
	        System.out.print("Two ");
	        break;
	 
	    // For digit 3
	    case '3':
	        System.out.print("Three ");
	        break;
	 
	    // For digit 4
	    case '4':
	        System.out.print("Four ");
	        break;
	 
	    // For digit 5
	    case '5':
	        System.out.print("Five ");
	        break;
	 
	    // For digit 6
	    case '6':
	        System.out.print("Six ");
	        break;
	 
	    // For digit 7
	    case '7':
	        System.out.print("Seven ");
	        break;
	 
	    // For digit 8
	    case '8':
	        System.out.print("Eight ");
	        break;
	 
	    // For digit 9
	    case '9':
	        System.out.print("Nine ");
	        break;
	        
	    default:
            System.out.printf("You have entered wrong key");
            return;
	    }
        System.out.println();
		
	}
	 
}


