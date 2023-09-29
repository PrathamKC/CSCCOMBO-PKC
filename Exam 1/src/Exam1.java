import java.util.Scanner;
public class Exam1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		
		///////////////////////////QUESTION 1/////////////////////////////////////
		question1();
		
		
		///////////////////////////QUESTION 2/////////////////////////////////////
		System.out.println("Enter a number to choose one of three beverages: '1', for water, '2' for coke, '3' for coffee");
		int choice = input.nextInt();
		question2(choice);
		
		
		///////////////////////////QUESTION 3/////////////////////////////////////
		System.out.println("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (makes10(num1,num2)==true)
		{
			System.out.println("These numbers add to 10!");
		}
		
		else {
			System.out.println("These numbers do not add to 10!");
		}
		
		
		///////////////////////////QUESTION 4/////////////////////////////////////
		question4();
		
		
		///////////////////////////QUESTION 5/////////////////////////////////////
		int sum = 0;
		System.out.println("Enter numbers to calculate the sum. Enter 0 when you have all of your numbers.");
		int x = input.nextInt();
		sum += x;
		
		while (x != 0)
		{
			System.out.println("Enter number here or enter 0 to stop and calculate.");
			 x = input.nextInt();
				
			sum += x;
		}
		
		System.out.println("Sum of all entered numbers: " + sum);
	}
	
	public static void question1()
	{
		System.out.println("This is my first programming test.");
	}
	
	public static void question2(int choice)
	{
		if (choice == 1 )
		{
			System.out.println("You chose Water!");
		}
		else if (choice == 2)
		{
			System.out.println("You chose coke!");
		}
		
		else 
		{
			System.out.println("You chose coffee!");
		}
	}

	public static boolean makes10(int a, int b)
	{
		int total = a + b;
		if (total == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void question4()
	{
		for (int i =5; i <=19; i++)
		{
			System.out.println(i);
		}
	}
}