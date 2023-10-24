public class LogicKnowledge {

	public static void main(String[] args) 
	{
		System.out.println(pickNumber(1,1,2));
		System.out.println(equiDistance(4,6,8));
	}

	public static int pickNumber(int a, int b, int c)
	{
		int sum = 0;
		
		if (a == b && a == c)
		{
			return a;
		}
		
		if(a!= b && a != c && b!= c)
		{
			sum = a + b + c;
			return sum;
		}
		
		if(a == b && a != c)
		{
			return c;
		}
		
		if (a == c && a !=c)
		{
			return b;
		}
		
		if (b ==c && b != a)
		{
			return a;
		}
		return 0;
	}
	
	public static boolean equiDistance(int a, int b, int c)
	{
		int smallest = 0;
		int largest = 0;
		int mid = 0;
		
		
		if (a < b && a < c)
		{
			smallest = a;
			
			if (b > a && b > c)
			{
				largest = b;
				mid = c;
			}
			if (c > a && c >b)
			{
				largest = c;
				mid = b;
			}
				
		}
		if (b < a && b < c)
		{
			smallest = b;
			
			if (a > b && a > c)
			{
				largest = a;
				mid = c;
			}
			if (c > a && c > b)
				largest = c;
				mid = a;
		}
		if (c < b && c < a)
		{
			smallest = c;
			
			if (b > a && b > c)
			{
				largest = b;
				mid = a;
			}
			if (a > b && a > c)
			{
				largest = a;
				mid = b;
			}		
		}
		
		int num = largest + smallest;
		
		if (mid*2 == num)
		{
			return true;
		}
		
		return false;
		
	}
	
}
