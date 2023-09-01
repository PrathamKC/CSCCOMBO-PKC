/***********************************************************************
 * This is a HelloWorld program, it writes HelloWorld to the console
 * written by Pratham KC
 * Date: 9/1/2023
 **********************************************************************/
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.out.println();
		
		int num1 = 66;
		int num2 = 12;
		
		int feet = (num1 /num2);
		int inches = num1 % num2; //% gives the remainder. p = p%2+1 to switch players 
		
		System.out.println("The sum of the two numbers is " + feet + "ft and " + inches + "in."); 
	}

}
