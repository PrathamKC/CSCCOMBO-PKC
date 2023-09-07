import java.util.Scanner;

public class InputCheckSheet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word;
		int intNum;
		float realNum;
		double bigRealNum;
		char letter;
		
		System.out.print("Multiple words go here ");
		word = input.nextLine();
		System.out.println("string: " + word);
		
		System.out.print("ints go here");
		intNum = input.nextInt();
		System.out.println("int: " + intNum);
		
		//realNum = 987654321.987654321f;
		//realNum = realNum + realNum;
		//str.equals("hello");
		//System.out.printf("$%.2f", realNum);
		System.out.print("The floats go here");
		realNum = input.nextFloat();
		System.out.println("float: " + realNum);
		
		
		//bigRealNum = 987654321.987654321f;
		//bigRealNum = bigRealNum + bigRealNum;
		//System.out.printf("$%.2"+ "f", bigRealNum);
		System.out.print("Enter a double here");
		bigRealNum = input.nextDouble();
		System.out.print("double goes here" + bigRealNum);

		//bigRealNum = input.nextDouble();
		//System.out.println("The double goes here " + bigRealNum);
		//System.out.printf("$%.2"+ "f", bigRealNum);
		System.out.println("The char go here");
		letter = input.next().charAt(0);
		System.out.println("The char goes here " + letter);
	}

}
