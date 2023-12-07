import java.util.Scanner;
public class DiceGame {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int sides = 0, playerNum = 0;
			String playerName = "";
					
			System.out.println("Number of sides for the dice?");
			sides = input.nextInt();
			
			System.out.println("Number of players?");
			playerNum = input.nextInt();
			
			Die die = new Die(sides);
			Player[] players = new Player[playerNum];
	
			for (int i = 0; i < players.length; i++) {
				System.out.println("Player " + (1+i) + ", please enter your name: ");
				playerName = input.next();
				players[i] = new Player(playerName, die);
			}
			
			for(int i = 0; i < players.length; i++) {
				players[i].getDie().roll();
				System.out.println("Player " + players[i].getName() + " rolled a " + die.getValue() 
				+" on a " + die.getNumSides() + " sided die");
			}
			
			int x = decideWinner(players);
			
			if(decideWinner(players) >= 0) {
				System.out.println(players[x].getName() + " has won!");
			}
			
						
	}
	
	public static int decideWinner(Player[] player) {
		for (int i = 0; i < player.length-1; i++) {
			
			if (player[i].getDie().getValue() > player[i+1].getDie().getValue()) {
				return i;
			}
			
			
		}
		return -1;
	}
}
