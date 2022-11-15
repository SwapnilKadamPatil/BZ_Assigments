package Day05_JavaProgram;

import java.util.Scanner;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
		int heads=0;
		int tails=0;
		int count=1;
		double random=0.0;  //double bcoz desimal number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number : ");
		int flip = sc.nextInt();
		
		while(count <= flip)
		{
			random = Math.random();
			System.out.print(count +" " + random); 	
                      
			if(random < 0.5)//If < 0.5 then tails or tails
			{
				heads++;
				System.out.println(" Heads ");
			}
			else
			{
				tails++;
				System.out.println(" Tails ");
			}
			count++;
		}
		System.out.println();
		System.out.println("Number of Heads :" + heads);
		System.out.println("Number of Tails :" + tails);
		
		double headpercent = (double) heads/flip * 100;
		double tailpercent = (double) tails/flip * 100;
		
		System.out.println("percentage of Heads : " + headpercent);
		System.out.println("percentage of Heads : " + tailpercent);
	}

}
