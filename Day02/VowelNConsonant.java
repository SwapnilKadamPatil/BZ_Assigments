package Day05_JavaProgram;

import java.util.Scanner;

public class VowelNConsonant 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charactor :");
		char num=sc.next().charAt(0);
		
		switch(num)
        {
            case 'a':
            case 'A':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'e':
            case 'E':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'i':
            case 'I':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'o':
            case 'O':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            case 'u':
            case 'U':
            System.out.println("The given character "+num+" is vowel");
            break;
 
            default:
            System.out.println("The character "+num+" is Not a Vowel");
            break;
        }

	}

}
