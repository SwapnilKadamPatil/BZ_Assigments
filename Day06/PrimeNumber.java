package Day06_LogicalProgram;

public class PrimeNumber 
{
	static void checkPrime(int n)
	{
		int i;
		int m=0;
		int flag=0;
		
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println(n + "is Not prime number");
		}
		else
		{
			for(i=2; i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n + "is Not prime number");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				System.out.println(n + "is Prime Number ");
			}
		}
	} 
	public static void main(String[] args) 
	{
		checkPrime (1);
		checkPrime (12);
		checkPrime (13);
		checkPrime (17);
		checkPrime (10);
		

	}

}
