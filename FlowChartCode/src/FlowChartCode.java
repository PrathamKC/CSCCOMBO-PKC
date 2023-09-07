import java.util.Scanner;
public class FlowChartCode 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double creds, totalPrice;
		String choice1;
		
		System.out.println("How many cred hours are you taking?");
		creds = input.nextDouble();
		
		totalPrice = (creds * 580) + 650;
		
		if (creds > 12) 
		{
			totalPrice = totalPrice + 250;
			System.out.println("Your total for the semester is: $" + totalPrice);
			
		}
		
		else 
		{
			System.out.println("Would you like access to the rec center? (y or n)");
			choice1 = input.next();
			
			if (choice1.equals("y"))
				{
				totalPrice = totalPrice + 250;
				System.out.println("Your total for the semester is: $" + totalPrice);}
				
			else 	
			{
				System.out.println("Your total for the semester is: $" + totalPrice);	
			}
				
		}	
	}
}