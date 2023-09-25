import java.util.Scanner;

public class Doubloon 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a word");
		String str = input.next();
		str = str.toLowerCase();
		
		if (doubloon(str) == true)
			{
				System.out.println("Your word IS a doubloon");
			}
		
		else 
			{
				System.out.println("Your word IS NOT a doubloon");
			}
	}
		
public static boolean doubloon(String str)
{
	for (int i = 0; i < str.length(); i++)
		{
			int count = 0;
				
			for (int j = 0; j < str.length(); j++)
				{
					if (str.charAt(i) == str.charAt(j))
						{
							count++;
						}
				}
			if (count != 2)
				{
					return false;
				}
		}
	return true;
}

}