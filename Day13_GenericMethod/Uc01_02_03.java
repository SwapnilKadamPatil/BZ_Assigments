package Day13_GenericMethod;

public class Uc01_02_03 
{
	public static < E extends Comparable <E> >
	E max(E... elements) 
	{
		E max = elements[0];
		for (E element : elements) 
		{
			if (element.compareTo(max) > 0) 
			{
				max = element;
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		Integer [] intValue = { 32, 22, 54, 65,35};
		Double [] doubleValue = {425.2, 8258.4,928.4};
		Float [] floatValue = {1.2f, 2.5f, 6.1f, 10.3f};
		String []  str= {"NehaBhat", "Apple", "John"};
		
		System.out.println("Integer Max : " + max(intValue));
		
		System.out.println("Double Max : " + max(doubleValue));
		
		System.out.println("Float Max : " + max(floatValue));
		
		System.out.println("String Max: " + max(str));
		
		System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Pomegranate"));
	}
	
}
