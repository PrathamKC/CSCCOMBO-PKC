import java.util.Arrays;
public class Driver {
	public static void main(String[] args) {
		
//		int [] [] manArr = {
//					{0,1,2,3},
//					{4,5,6},
//					{7,8,9,10} };
//		}\
		
		
//		char[][] arr = new char[3][4]; //3 rows, 4 columns
//		
//		int count = 0;
//		char letter = 'a';
//		
//		for (int row = 0; row < arr.length; row++) {
//			for (int col = 0; col < arr[row].length; col++) {
//				arr[row][col] = letter;
//				letter++;
//			}
//		}
//		
//		for (int rows = 0; rows < arr.length; rows++) {
//			for (int col = 0; col < arr[rows].length; col++) {
//				System.out.print(arr[rows][col]+ " ");
//			}
//		System.out.println();
//		}
		

		TimesTable timesTable = new TimesTable();
		int [][] tt = TimesTable.createTimesTable(5, 7);
		
		System.out.println((timesTable));
		System.out.println(TimesTable.printTimesTable(tt));
		

	}	
}