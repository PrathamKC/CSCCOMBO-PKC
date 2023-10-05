import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayEx 
{
	public static void main(String[] args) 
	{
		int[] arrOne = {1,2,3,4,5};
		int[] arrTwo = {1,7,8,3,4};
		int[] arrThree = new int [arrOne.length];
		
		//#1
		if (findValue(arrOne, 2))
		{
			System.out.println("Match!");
		}
		else 
		{
			System.out.println("No match!");
		}
		
		
		//#2
		arrayReverse(arrOne);
		for (int i = 0; i < arrOne.length; i++)
		{
			System.out.print(arrOne[i]+", ");
		}
		

		//#3
		arrThree = findCommon(arrOne, arrTwo);
		System.out.println("\n"+ Arrays.toString(arrThree));
		
		
		//#4
		int evens = evenOdd(arrOne);
		avg(arrOne);
		System.out.println("Number of evens: " + evens);
		System.out.println("Number of odds: " + (arrOne.length-evens));
		
		
		//#5
		int sum = avg(arrOne);
		System.out.println("Your average is: " + sum/(arrOne.length-2));	
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
	
	public static int[] findCommon(int[] arrOne, int[] arrTwo)
	{
		int count = 0;
		int [] arr = new int[arrOne.length];
		for (int i = 0; i < arrOne.length; i++) 
		{
			for (int j = 0; j <arrTwo.length; j++)
			{
				if (arrOne[i] == arrTwo[j])
				{
					arr[count] = arrOne[i];
					count++;
				}
			}
		}	
		return arr;
	}
	
	public static int evenOdd(int[] arrOne)
	{
		int even = 0;
		for(int i = 0; i < arrOne.length; i++)
		{
			if (arrOne[i] %2 == 0)
			{
				even++;
			}
		}
		return even;
	}
	
	public static int avg(int[] arrOne)
	{
		int max = arrOne[0], min = arrOne[0], sum = 0;
		for (int i = 0; i < arrOne.length; i++) 
		{
			if (arrOne[i] < min)
			{
				min = arrOne[i];
			}
			if (arrOne[i] > max)
			{
				max = arrOne[i];
			}
			sum += arrOne[i];
		}
		return sum-min-max;
	}
}