import java.util.Random;
import java.util.Scanner;
public class Battle 
{
	static Random random = new Random();
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double damage;
		int choice = 0;
		
		Character hero = new Character("Champion", 8, 100, 0.7);
		hero.setWeapon("Sword", 5);
		
		Character monster = new Character("Owl Bear", 9, 110, 0.4);
		monster.setWeapon("Claws", 8);
		
		Weapon arrow = new RangedWpn("arrow", 3, 20);
		//System.out.println(arrow);
		
		while (!monster.isDead() && !hero.isDead())
			{
				int turn = random.nextInt(1,3);
				System.out.println("Choose between 1-2. If your # is right, you will hit");
				choice = input.nextInt();
				
				if (turn == choice)
					{
						damage = hero.doDamage();
						monster.recieveDamage(damage);
						System.out.println("Warrior did " + damage + " to the Monster!");
					}
				else
					{
						damage = monster.doDamage();
						hero.recieveDamage(damage);
						System.out.println("Owl Bear did " + damage + " to the Warrior!");
					}	
			}
		
		if (hero.isDead())
			{
				System.out.println("\nOur Hero has fallen!");
			}
		else
			{
				System.out.println("\nThe Monster has fallen!");
			}
	}
}