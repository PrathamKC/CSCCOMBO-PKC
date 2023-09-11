import java.util.Scanner;
import java.util.Random;
public class NumberGuesser 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random realNum = new Random();
		int random = realNum.nextInt(10), userGuess;
		
		
		System.out.println("Guess a random number: ");
		userGuess = input.nextInt();
		
		while (userGuess != random)
			if (userGuess > random) 
				{
					System.out.println("Too high!");
					userGuess = input.nextInt();
				}
			else 
				{
					if (userGuess < random) 
						{
							System.out.println("Too low!");
							userGuess = input.nextInt();
						}
				}
		System.out.println("Correct!");
	}
}