import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead extends FileWrite {

	public static void main(String[] args) throws FileNotFoundException {
		File myFile = new File ("test.txt");
		Scanner input = new Scanner(myFile);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		
		//File dir = new File("")
	}	
}