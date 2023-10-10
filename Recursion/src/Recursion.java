public class Recursion 
{
	public static void main(String[] args) 
	{
			
		//System.out.println(factorial(5));
		counting(5);

	}

	private static int factorial(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		
		int product = n * factorial(n-1);
		System.out.println(product);
		return product;
		
		// both these do the same thing but the bottom is using a 'for loop' while the top is using recursion.
		
//		int product = 1;
//		for (int i  = n; i > 0; i--)
//		{
//			product *= i;
//			//System.out.println(product);
//		}	
//		System.out.println(product);
	}
	
	private static void counting(int n)
	{
		if (n == 0)
		{
			System.out.println(0);
		}
		
		else 
		{
			System.out.println(n); // prints from 5 to 0
			counting(n-1);
			System.out.println(n); // prints 0 to 5
		}
		//System.out.println(n);
	}
}