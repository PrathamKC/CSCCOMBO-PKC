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
// package driverTT;

//import java.util.Scanner;

public class driverTTT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //isDigit().
		int row = 0;
		int col = 0;
		int player = 1;
		boolean game = true;
		char[][] boxes = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
		
		System.out.println("PLayer 1: Do you want O's(1) or X's(2)?");
		char choice = input.next().charAt(0);
		char piece1 = playerChoice(choice);
		char piece2 = choicePlayer2(choice);
		
		System.out.println("PLayer 1 is: " + piece1 + "'s");
		System.out.println("Player 2 is: " + piece2 + "'s");
		
		while(game == true)
		{
			if (player == 1) 
			{ 
				System.out.println("Player 1, which row and coloumn do you want to place?");
				drawBoard(boxes);
				row = input.nextInt() - 1;
				col = input.nextInt() - 1;
			
				if (boxes[row][col] == 'X' || boxes[row][col] == 'O') 
				{
					System.out.println("Someone has already placed a piece there, try somewhere else!");
				}
				else
				{
					boxes[row][col] = piece1;
					player = 0;
				}
			
				if (checker(boxes) == true)	{
					System.out.println("Tie!");
					game = false;
					player = 1;
				}
				
				if (checkWin(boxes) == true) {
					System.out.println("PLayer 1 wins!!");
					game = false;
					player = 1;
				}
			}
			
			if (player == 0)
			{
				System.out.println("Player 2, which row and coloumn do you want to place?");
				drawBoard(boxes);
				row = input.nextInt() - 1;
				col = input.nextInt() - 1;
			
				if (boxes[row][col] == 'X' || boxes[row][col] == 'O') 
				{
					System.out.println("Someone has already placed a piece there, try somewhere else!");
				}
				else
				{
					boxes[row][col] = piece2;
					player = player%2 + 1;
				}
				
				if (checker(boxes) == true)
				{
					System.out.println("Tie!");
					game = false;
					player = 0;
				}
				
				if (checkWin(boxes) == true)
				{
					System.out.println("PLayer 2 wins!");
					game = false;
					player = 0;
				}
			}
		}
		
	}
	public static boolean checker(char[][] boxes) { 
		for (int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if (boxes[i][j] != 'X' || boxes[i][j] != 'O')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean checkWin(char[][] boxes) {
		for(int i = 0; i < 3; i++)
		{
			if (boxes[i][0] == boxes[i][1] && boxes[i][0] == boxes[i][2])
			{
				return true;
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			if (boxes[0][i] == boxes[1][i] && boxes[0][i] == boxes[2][i])
			{
				return true;
			}
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
		if (choice == '1')
		{
			choice = 'X';
		}
		
		if (choice == '2')
		{
			choice = 'O';
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