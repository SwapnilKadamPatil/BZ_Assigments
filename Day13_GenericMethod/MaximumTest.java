package Day13_GenericMethod;

public class MaximumTest<T extends Comparable<T>> 
{
	T x;
	T y;
	T z;

	public MaximumTest(T x, T y, T z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() 
	{
		return MaximumTest.maximum(x, y, z);
	}

	// Determine the largest of three comparable variable
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) 
	{
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0) 
		{
			max = y; // y is the largest so far
		}
		if (z.compareTo(max) > 0) 
		{
			max = z; // z is the largest
		}
		printMax(x, y, z, max);
		return max; // returns the largest object

	}

	public static <T> void printMax(T x, T y, T z, T max) 
	{
		System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);

	}

	public static void main(String args[]) 
	{

		String xStr = "pear", yStr = "apple", zStr = "orange";

		Integer xInt = 3, yInt = 4, zInt = 5;

		Float xF1 = 6.6f, yF1 = 8.8f, zF1 = 7.71f;

		MaximumTest.maximum(xStr, yStr, zStr);
		new MaximumTest(xInt, yInt, zInt).maximum();
		new MaximumTest(xF1, yF1, zF1).maximum();
		new MaximumTest(xStr, yStr, zStr).maximum();
	}
}
