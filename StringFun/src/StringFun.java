import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String day = "Tuesday", month = "September", answer;
		int date = 5, year = 2023;
		
		// "sysout" *ctrl + space* for shortcut
		// /n means new line, /t gives an indent
		
		System.out.println(day + " " + month + " " + date + ", " + year);
		
		
		/************************************** 
		two "\\" required to print out one "\"
		System.out.println(" \"friends\" \\");
		**************************************/
		
		
		System.out.print(day + " ");
		System.out.print(date + " ");
		System.out.print(month + ", ");
		System.out.print(year + " " +"\n \n");
		
		System.out.println("Do you know how to get input?");
		answer = input.nextLine();
		System.out.println(answer);
	}

}
