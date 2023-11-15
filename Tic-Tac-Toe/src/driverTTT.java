import java.util.Scanner;

/**
 * Copyright 2023 All rights reserved. Do NOT copy my code w/o my permission!
 * 
 * Tic-Tac-Toe
 * This is an implementation of the traditional game of X's and O's
 * 
 * @author Pratham KC
 * @date 11/15/2023
 */
public class driverTTT {
/**
 * Main
 * @param args
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //isDigit().
		int row = 0;
		int col = 0;
		int Player; //player = 1, player = player%2 + 1
		char piece2;
		
		char[][] boxes = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		
		System.out.println("PLayer 1: Do you want O's(1) or X's(2)?");
		char choice = input.next().charAt(0);
		char piece1 = playerChoice(choice);
		char player2 = choicePlayer2(piece1);
		
		System.out.println("PLayer 1 is: " + piece1 + "'s");
		System.out.println("Player 2 is: " + player2 + "'s");
		
		drawBoard(boxes);

		System.out.println("Which row and coloumn do you want to place?");
		row = input.nextInt() - 1;
		col = input.nextInt() - 1;
		boxes[row][col] = piece1;
		
		drawBoard(boxes);
	}
	public static boolean checker(char[][] boxes) {
		if ((boxes[0][0] != 'X' || boxes[0][0] != 'O') && (boxes[0][1] != 'X' || boxes[0][1] != 'O') && (boxes[0][2] != 'X' || boxes[0][2] != 'O'))
		{
			return true;
		}
		if ((boxes[0][0] != 'X' || boxes[0][0] != 'O') && (boxes[0][1] != 'X' || boxes[0][1] != 'O') && (boxes[0][2] != 'X' || boxes[0][2] != 'O'))
		{
			return true;
		}
		if ((boxes[0][0] != 'X' || boxes[0][0] != 'O') && (boxes[0][1] != 'X' || boxes[0][1] != 'O') && (boxes[0][2] != 'X' || boxes[0][2] != 'O'))
		{
			return true;
		}
		if ((boxes[0][0] != 'X' || boxes[0][0] != 'O') && (boxes[0][1] != 'X' || boxes[0][1] != 'O') && (boxes[0][2] != 'X' || boxes[0][2] != 'O'))
		{
			return true;
		}
		
		return false;
	}
	public static char playerChoice(char choice) {
		if(choice == '1')
		{
			choice = 'O';
		}
		
		if (choice == '2')
		{
			choice = 'X';
		}
		
	return choice;
	}
	
	public static char choicePlayer2(char choice) {
		if(choice == 'X')
		{
			choice = 'O';
		}
		
		if (choice == 'O')
		{
			choice = 'X';
		}
		
	return choice;
	}

	public static void drawBoard(char[][] boxes) {
		System.out.println("-------------");
		System.out.println("| " + boxes[0][0] + " | " + boxes[0][1] + " | " + boxes[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + boxes[1][0] + " | " + boxes[1][1] + " | " + boxes[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + boxes[2][0] + " | " + boxes[2][1] + " | " + boxes[2][2] + " |");
		System.out.println("-------------");
	}
}