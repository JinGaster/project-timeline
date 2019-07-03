import java.util.Scanner;
public class ticTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[][] board = new String[3][3];
		boolean keepGoing = true;
		String letter = "X";
		System.out.println("   |   |   ");
		for(int x=0;x<2;x++) {
			System.out.println("-----------");
			System.out.println("   |   |   ");
		}
		while(keepGoing == true) {
			if(letter.equalsIgnoreCase("X")) {
				System.out.println("Player 1, state the row that you want to put your X. Rows go left to right.");
			}
			else {
				System.out.println("Player 2, state the row that you want to put your O. Rows go left to right.");
			}
			int row = scan.nextInt();
			System.out.println("Now, state the column. Columns go up to down.");
			int column = scan.nextInt();
			board[row][column] = ""+letter+"";
			System.out.println(" "+board[0][0]+" | "+board[1][0]+" | "+board[2][0]+" ");
			System.out.println("-----------");
			System.out.println(" "+board[0][1]+" | "+board[1][1]+" | "+board[2][1]+" ");
			System.out.println("-----------");
			System.out.println(" "+board[0][2]+" | "+board[1][2]+" | "+board[2][2]+" ");
			if(letter.equalsIgnoreCase("X")) {
				letter = "O";
				continue;
			}
			else {
				letter = "X";
			}
		}
		scan.close();
	}
	public static void checkWin(String[][] board, boolean keepGoing) {
		if()
		keepGoing = false;
	}
}
