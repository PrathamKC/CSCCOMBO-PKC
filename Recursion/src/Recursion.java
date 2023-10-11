public class Recursion 
{
	static long [] fibArray;
	public static void main(String[] args) 
	{
			
		//System.out.println(factorial(5));
		//counting(5);
		int term = 6;
		fibArray = new long [term + 1];
		System.out.println(fib(term)); //wtv # is at the placment given, it will give the # in the fibonnachi sequence. 
		
		for (int i = 0; i < 2; i++)
		{
			fibArray[i] = i;
		}
		
		for (long i = 0; i < fibArray.length; i ++)
		{
			if (i%7 == 0) System.out.println();
			System.out.print(fibArray[(int)i] + ", ");
		}
	}

	private static long fib(int n)
	{
		if (n == 0 || n == 1)
		{
			return n;
		}
		
		if (fibArray[n] != 0)
		{
			return fibArray[n];
		}
		
		long nthFibNum = fib(n-1) + fib(n-2);
		fibArray[n] = nthFibNum;
		
		return nthFibNum;
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