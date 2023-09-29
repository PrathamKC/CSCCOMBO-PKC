import java.util.Scanner;
public class Methods 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		
//		System.out.println("Enter three numbers: ");
//		double num1 = input.nextInt();
//		double num2 = input.nextInt();
//		double num3 = input.nextInt();
//		System.out.println("Smallest value: " + smallestNumber(num1, num2, num3));
//		System.out.println("Average value is: " + avg(num1,num2,num3));
//		
//		System.out.println("Enter a string: ");
//		String strx = input.next();
//		System.out.println("The middle character in the string: " + middle(strx));
//		System.out.println("Number of vowels in the string: " + vowels(strx));
		
//		System.out.print("Multiple words go here: ");
//		String str = input.nextLine();
//		System.out.println("Number of words in the string: " + words(str));
		
		System.out.println("number: ");
		int x = input.nextInt();
		System.out.println(summ(x));
	}
	
	public static double smallestNumber(double a, double b, double c) 
	{
		double total=0;
		if (a < b) 
		{
			if (a < c)
			{
				total = a;
				return total;
			}
		}
		else if (b < a)
		{
			if (b < c)
			{
				total = b;
				return total;
			}
		}
		else if (c < a)
		{
			if (c < b)
			{
				total = c;
				return total;
			}
		}
		else
		{ 
		}
		total = c;
		return total;
	}
	
	public static double avg(double a, double b, double c)
	{
		double total = (a + b + c)/3;
		return total;
	}
	
	public static String middle(String str)
	{
		if (str.length() % 2 == 0)
		{
			return str.substring(str.length()/2-1,str.length()/2+1);
		}
		else
		{
			String s = str.substring(str.length()/2, str.length()/2+1);
			return s;
		}
	}
	
	public static int vowels(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a')
			{
				count++;	
			}
			else if (str.charAt(i) == 'e')
			{
				count++;	
			}
			else if (str.charAt(i) == 'i')
			{
				count++;
			}
			else if (str.charAt(i) == 'o')
			{
				count++;	
			}
			
			else if (str.charAt(i) == 'u')
			{
				count++;
			}
		}
		return count;
	}
	
	public static int words(String str)
	{
		int count=0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ' ')
			{
				count ++;
			}
		}
		return count+1;
	}
	
	public static int summ(int a)
	{
		int total=0,b=0,c=0;
		while (a > 0)
		{
			c = a + b;
			System.out.println(a%10);
			//c = a + b;
		    a = a/10;
		    //c = a + b;
		}
		return c;
	}
}