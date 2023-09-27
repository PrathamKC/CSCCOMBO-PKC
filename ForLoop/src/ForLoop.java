import java.util.Scanner;
public class ForLoop
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Scanner scnr = new Scanner(System.in);
		int i = 1, sum = 0;
		int j;
		int num1, x=0;
		
		System.out.println("enter number:");
		num1 = input.nextInt();
		
		for (i=num1;i<=100;i+=num1)
		{
			System.out.println(i);
		}
		

			
//		
//		while (i <= 10) 
//			{
//				i++;
//				sum = sum + i;
//				System.out.println(i + " Your sum is: " + sum);
//				i++;
//			}
//		
//		System.out.print("\n");
//		sum = 0;
//
//		for (i=1; i<=10; i++) 
//			{
//			
//			sum = sum + i;
//			System.out.println(i + " Your sum is: " + sum);
//			}
//		
//		for (j = 0; j<=5; j++) 
//		{
//			System.out.println("1 1 1 1 1");
//		}
			
	}
}