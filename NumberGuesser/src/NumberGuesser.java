import java.util.Scanner;
public class NumberGuesser 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int realNum = 0, userGuess;
		
		System.out.println("Guess a random number: ");
		userGuess = input.nextInt();
		
		while (userGuess != realNum)
			if (userGuess > realNum) 
				{
					System.out.println("Too high!");
					userGuess = input.nextInt();
				}
			else 
				{
					if (userGuess < realNum) 
						{
							System.out.println("Too low!");
							userGuess = input.nextInt();
						}
				}
		System.out.println("Correct!");
	}
}