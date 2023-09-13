import java.util.Scanner;
public class project1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		
		double num = 1, average = 0, total=0;
		int even =0, odd = 0;
		String choice ="y";
		
		while (choice.equals("y"))
		{ 
			System.out.println("Enter a number: ");
			num = input.nextDouble();

			if (num %2 == 0) 
				{
					System.out.println("This is even.");
					even = even + 1;
					average = average + num;
				}
			else 
				{
					System.out.println("this is odd.");
					odd = odd + 1;
					average = average + num;
				}
//			System.out.println("Enter another number: ");
//			num = input.nextInt();
			
			System.out.println("Any more #'s to enter? y/n");
			choice = scnr.nextLine();		
		}
		
		System.out.println("Number of Even numbers: " + even + "\n" + "Number of odd numbers: " + odd);
		total =even + odd;
		System.out.println("Average is: " + average/total);
		
	}
}