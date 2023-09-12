import java.util.Scanner;
public class WhileLoop 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		
		int age = -1, countDown = 3, countUp = 5;
		String name = " ";
		
		while (age < 0)
			{
				System.out.println("Enter name here: ");
				name = input.nextLine();
			
				System.out.println("Enter age: ");
				age = input.nextInt();		
			}
		System.out.println("Name: " + name + "\n" + "Age: " + age);
		
		while (countDown > 0 )
			{
				System.out.println(countDown);
				countDown--;
			}
		System.out.println("BLAST OFF!!!!");
			
			
		while (countUp <= 100)
			{
				System.out.println(countUp);
				countUp +=5;
			}	
//		int currPower = 2;
//		String userChar = "y";
//		
//		while (userChar.equals("y"))
//		{
//			System.out.println(currPower);
//			currPower = currPower * 2;
//			System.out.println("wanna know next Power? y/n");
//			userChar = scnr.nextLine();	
//		}
//		System.out.println("bye.");
		
		
//		int i = 5, num1 = 4, num2 = 1;
//		// int i = 0;
//		// while ( i < 5);
//		// i++:
//		
//		while (i > 0)
//			{
//				num2 = num2 * num1;
//				System.out.println("i: " + i + ", next number: " + num2);
//				i--;
//			}
//		System.out.println("Bye.");
	}
}
