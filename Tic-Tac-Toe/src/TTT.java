public class TTT {
	private String[][] board;
	public TTT() {
		super();
			this.board = new String[3][3];
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board[row].length; col++) {
					board[row][col] = "|_|";
				}
			}
		}
	
@Override
public String toString() {
	for (int rows = 0; rows < board.length; rows++) {
		for (int col = 0; col < board[rows].length; col++) {
			System.out.print(board[rows][col]);
		}
	System.out.println();
	}
	return "";
	}
}
