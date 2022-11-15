//Sum of Natural Number using FOR loop

package Day02_Loops;
import java.util.Scanner;
public class Sum_NaturalNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		for(i=1; i<=num ; i++)
		{
			sum= i+sum;
		}
		System.out.println("Natural Number of "+num+ " is = "+sum);
		
		

	}

}
