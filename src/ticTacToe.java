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
				System.out.println("Player 1, state the row that you want to put your X. Rows go from left to right.");
			}
			else {
				System.out.println("Player 2, state the row that you want to put your O. Rows go from left to right.");
			}
			int row = scan.nextInt();
			System.out.println("Now, state the column. Columns go from up-down.");
			int column = scan.nextInt();
			board[row][column] = ""+letter+"";
			System.out.println(" "+board[0][0]+" | "+board[1][0]+" | "+board[2][0]+" ");
			System.out.println("-----------");
			System.out.println(" "+board[0][1]+" | "+board[1][1]+" | "+board[2][1]+" ");
			System.out.println("-----------");
			System.out.println(" "+board[0][2]+" | "+board[1][2]+" | "+board[2][2]+" ");
			checkWin(board,keepGoing);
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

	public static boolean checkWin(String[][] board, boolean keepGoing) {
		if(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X") {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O") {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		return keepGoing;
	}
	
	public static boolean checkTie(String[][] board, boolean keepGoing) {
		for(int y=0;y<3;y++) {
			if(board[y][y] != null) {
				System.out.println("Game over! It's a tie.");
				keepGoing = false;
			}
		}
		return keepGoing;
	}
}
