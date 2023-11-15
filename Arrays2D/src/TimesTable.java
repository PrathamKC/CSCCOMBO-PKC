import java.util.Arrays;
public class TimesTable {
	private int[][] timesTable;

	public TimesTable() {
	super();
		this.timesTable = new int[10][10];
		for (int row = 0; row < timesTable.length; row++) {
			for (int col = 0; col < timesTable[row].length; col++) {
				timesTable[row][col] = (row+1) * (col+1);
			}
		}
	}	

	public static int[][] createTimesTable(int rows, int cols) {
		int[][] timesTable =  new int[rows][cols];
		for (int row = 0; row < timesTable.length; row++) {
			for (int col = 0; col < timesTable[row].length; col++) {
				timesTable[row][col] = (row+1) * (col+1);
			}
		}
		return timesTable;
	}
	
	public static String printTimesTable(int[][] timesTableArr) {
		String x = "";
		for (int row = 0; row < timesTableArr.length; row++) {
			for (int col = 0; col < timesTableArr[row].length; col++) {
				x += String.format("%4d", timesTableArr[row][col]);
			}
			x += "\n";
		} 
		return x;
	}
	
	@Override
	public String toString() {
		String x = "";
		for (int rows = 0; rows < timesTable.length; rows++) {
			for (int col = 0; col < timesTable[rows].length; col++) {
				x += String.format("%4d", timesTable[rows][col]);
			}
			x += "\n";
		}
	return x;
	}
}