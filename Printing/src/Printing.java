import java.util.Scanner;
public class Printing 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		
		//System.out.printf("Four thirds = %.3f", 4.0/3.0);
		//System.out.printf("Four thirds = %10.3f", 4.0/3.0, "answer"); // The 10 will make the # go 10 spaces to the right first.
		//System.out.printf("Four thirds = %10.3f%10s", 4.0/3.0 , "answer"); // %10s will have the next string printed (s stands for string)
		//String formattedStr = String.format("\nGrand Total: %,.2f", 100000.00); //the first comma gives commas on the output
		//System.out.println(formattedStr);
		
//		int i;
//		for (int i=1; i<=100; i++)
//		{
//			System.out.printf("%4d", i);
//			
//			if (i%10 == 0)
//			{
//				System.out.println();
//			}
//			
//		}
		
		for (int i=1; i<=10; i++)
			{
				for (int k=1; k<=10; k++)
					{
						System.out.printf("%4d", i*k);
					}
				System.out.println();
			}
	}
}