import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		File myFile = createFile("test.txt"); // File myFile = new File ("test.txt");
		File myFile2 = createFile("test2.txt");
		double strength = 14.8;
		
		PrintWriter printer = new PrintWriter(new FileOutputStream(myFile, true)); // the 'true' is to append the file. meaning the file will
																				   // not be erased and overwritten with the new content.
		printer.println("The moon is full tonight.");
		printer.println("This is great!");
		printer.flush(); // this will let u add to the file after its been worked on, unlike .close()
		printer.close();
		
		printer = new PrintWriter(new FileOutputStream(myFile2, true));
		printer.println("After the Flush");
		printer.close();
	}
	
	public static File createFile(String name) throws IOException {
		File myFile = new File(name);
		
		if (!myFile.exists()) {
			if (myFile.createNewFile()) {
				System.out.println("File created successfully.");
			}
		}	
		
		else {
			System.out.println("File exists.");
		}

		return myFile;
	}
}