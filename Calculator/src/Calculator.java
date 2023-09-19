import java.util.Scanner;

public class Calculator {
public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("What would you likt to do? +, -, *, or /");
		String operation = input.next();
		if(operation.equals("+")) {
			System.out.println("Added: " + addTwo(num1, num2));
		}
		if(operation.equals("-")) {
			System.out.println("Subtracted smallest from the biggest: " + subTwo(num1, num2));
		}
		if(operation.equals("*")) {
			System.out.println("Multiplied: " + multiplyTwo(num1, num2));
		}
		if(operation.equals("/")) {
			System.out.println("Divided largest by smallest(int division): " + divTwo(num1, num2));
		}
		
	}

	public static int addTwo(int a, int b) {
		int total;
		total = a + b;
		return total;
	}

	public static int subTwo(int a, int b) {
		int total;
		if (a > b) {
			total = a - b;
		} else if (a < b) {
			total = b - a;
		} else {
			total = 0;
		}
		return total;
	}

	public static double divTwo(int a, int b) {
		double total;
		if (a < b) {
			if ( a == 0) {
				System.out.println("error");
				return 0;
			}
			else {
				total = b / a;
			}
		}
		else if (b < a) { 
			if ( b == 0) {
				System.out.println("error");
				return 0;
			}
			else {
				total = a / b;
			}
		}
		else {
			total = 1;
		}
		return total;
	}
	public static int multiplyTwo(int a, int b) {
		return a*b;
	}
}
