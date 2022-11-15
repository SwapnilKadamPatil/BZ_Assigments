package Day02_Loops;

import java.util.Scanner;

public class UnitProblem {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int n, u, t, h;
		System.out.println("Enter 3 digit Number");
		n=sc.nextInt();
		
		u=n%10;
		t=n%100/10;
		h=n%1000/100;
		
		System.out.println("The Number in the Units is : " +u);
		System.out.println("The Number in the Tens is : " +t);
		System.out.println("The Number in the Hundreds is : " +h);
				
				

	}

}
