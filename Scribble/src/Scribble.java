import java.util.Scanner;

public class Scribble 
	{
		public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);

			String tiles = "leoapbsaxbts";
			String word = "abbza";
			
			if (canMake(tiles,word) == true)
				{
					System.out.println("You can make the word");
				}
			
			else 
				{
					System.out.println("You can't make the word");
				}
		}
			
	public static boolean canMake(String tiles, String word)
	{
		for (int i = 0; i < word.length(); i++)
			{
				int count = 0;
				
				for (int j = 0; j < word.length(); j++) //this will look thru its self so count will be the number of chars in the string. so it would be 2
					{
						if (word.charAt(i) == word.charAt(j))
							{
								count++;
							}
					}
				
				for (int k = 0; k < tiles.length(); k++) // now it will check with Tiles and make sure all chars from Word will match the same so itll count down until 0.
				{
					if (word.charAt(i) == tiles.charAt(k))
						{
							count--;
						}
				}
		
				
				if (count > 0)
					{
						return false;
					}
			}
		return true;
	}

	}