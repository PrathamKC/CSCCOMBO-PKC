import java.util.Arrays;
import java.util.Scanner;
public class ArraysPrac
{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many strings are there?");
		int numStrings = input.nextInt();

		//creating 2 arrays with their name here
		int[] strLen = new int[numStrings]; 
		String[] str = new String[numStrings];
		
		// this will fill in for each box in the Array 'str'
		for (int i = 0; i <= numStrings-1;i++) 
		{
				System.out.println("Enter your word here: ");
				str[i] = input.next();
		}
		
		
		//output full array vertically Arrays.tostring()
//		for (int i = 0; i <= str.length-1;i++) 
//		{
//			System.out.println(str[i]);
//		}
		
		// this will print out the full Array 'str'
		System.out.println(Arrays.toString(str));
		
		
		// this will fill in the Array 'x' for the length of each box in the 'str' Array
		for (int i = 0; i <= numStrings-1; i++) 
		{
			 strLen[i] = str[i].length();
		}
		System.out.println(Arrays.toString(strLen));	
	}
}
