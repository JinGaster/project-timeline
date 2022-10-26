import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TicTacToe board using 2D arrays
		Scanner scan = new Scanner(System.in);
		String[][] board = new String[3][3];
		boolean keepGoing = true;
		String letter = "X";
		System.out.println("   |   |   ");
		for(int x=0;x<2;x++) {
			System.out.println("-----------");
			System.out.println("   |   |   ");
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				board[i][j] = " ";
			}
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
			if(board[row][column].equals("X")||board[row][column].equals("O")){
				System.out.println("Spot already taken!");
				continue;
			}
			else{
				board[row][column] = ""+letter+"";
			}
			System.out.println(" "+board[0][0]+" | "+board[1][0]+" | "+board[2][0]+" ");
			System.out.println("-----------");
			System.out.println(" "+board[0][1]+" | "+board[1][1]+" | "+board[2][1]+" ");
			System.out.println("-----------");
			System.out.println(" "+board[0][2]+" | "+board[1][2]+" | "+board[2][2]+" ");
			keepGoing = checkWin(board,keepGoing);
			if(letter.equalsIgnoreCase("X")) {
				letter = "O";
			}
			else {
				letter = "X";
			}
		}
		scan.close();
	}

	public static boolean checkWin(String[][] board, boolean keepGoing) {
		if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")){
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")) {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")) {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")) {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")) {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")) {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")) {
			System.out.println("Game over! Player 2 wins.");
			keepGoing = false;
		}
		if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
			System.out.println("Game over! Player 1 wins.");
			keepGoing = false;
		}
		if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
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
