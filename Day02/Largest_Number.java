package Day05_JavaProgram;

import java.util.Scanner;

public class Largest_Number 
{

	public static void main(String[] args)
	{
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
         int x = sc.nextInt();
         
        System.out.print("Enter the second number:");
        int y = sc.nextInt();
        
        System.out.print("Enter the third number:");
        int z = sc.nextInt();
        
        if(x > y && x > z)                             // false && true = false ... T && T = true
        {
            System.out.println("Largest number is:"+x);
        }
        
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}
