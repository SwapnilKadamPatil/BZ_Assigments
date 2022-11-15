package Day05_JavaProgram;

public class SwapTwoNumber 
{

	public static void main(String[] args) 
	{
		int a=10 ;
		int b=20 ;
		int temp ;
		
		System.out.println("Before swap two number : A = " + a +" B =" +b);
		
		temp = a;  // temp=10
		a = b;     // a=20
		b = temp;  // b=10
		
		System.out.println("After Swapping : A =" + a + " B =" + b );
	}

}
