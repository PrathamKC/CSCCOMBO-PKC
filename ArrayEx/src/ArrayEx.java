import java.lang.reflect.Array;

public class ArrayEx 
{
	public static void main(String[] args) 
	{
		int[] arrOne = {1,2,3,4,5};
		
		if (findValue(arrOne, 6))
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
		
		arrayReverse(arrOne);
		for (int i =0; i < arrOne.length; i++)
		{
			System.out.print(arrOne[i]+", ");
		}
		
	}
	
	public static boolean findValue(int[] arrOne, int a)
	{
		for (int i = 0; i < arrOne.length; i++)
		{
			if (arrOne[i] == a)
			{
				return true;
			}
			
		}
		return false;
	}
	
	public static int[] arrayReverse(int []arrOne)
	{
		int tempVal;
		
		for (int i = 0; i<arrOne.length/2;i++)
		{
			tempVal = arrOne[i];
			arrOne[i] = arrOne[arrOne.length - 1 - i];
			arrOne[arrOne.length-1-i] = tempVal;
		}
		return arrOne;
	}
	
//	public static int[] findCommon(int[] arrOne, int[] arrTwo)
//	{
//		
//	}
}