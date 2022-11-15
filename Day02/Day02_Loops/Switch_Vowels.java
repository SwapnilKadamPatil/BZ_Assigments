package Day02_Loops;

import java.util.Scanner;

public class Switch_Vowels 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charactor :");
		char num=sc.next().charAt(0);
		
		switch(num)
        {
            case 'a':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'e':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'i':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'o':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'u':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            default:
            System.out.println("The character "+num+" is Not a Vowel");
            break;
        }

	}

}
