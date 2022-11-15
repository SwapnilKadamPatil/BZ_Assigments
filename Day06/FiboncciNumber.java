package Day06_LogicalProgram;

import java.util.Scanner;

public class FiboncciNumber
{
	public static void main(String []args)
	
	{
		 int n1=0;
		 int n2=1;
		 int n3;
		 int i;
		 int count=10;
		 
		 System.out.print("Fiboncci Number= "+ n1 +" "+ n2); //printing 0 and 1    
		    
		 for(i=2 ; i<count ; i++) //loop starts from 2 because 0 and 1 are already printed    
		 {                            //i=2, 2<c     //i++ 3<c  //i++ i=4   //i++  i=5
			 
		  n3=n1+n2;                   // n3=0+1=1 ,   1+1=2     //1+2=3     //
		  System.out.print(" "+n3);   //n3 = 1   ,    n3= 2     //n3=3      //
		  n1=n2;                      // n1=1    ,    n1=1      //n1=2      //
		  n2=n3;                      // n2=1    ,    n2=2      //n2=3      //
		  
		 }    
		
		
	}
}
 