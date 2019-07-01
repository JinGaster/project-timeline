import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random number = new Random();
		boolean bool = true;
		while(bool == true) {
			System.out.println("Choose either rock, paper, or scissors.");
			String choice = scan.next();
			int computer = number.nextInt(3);
			String comChoice = null;
			if(computer == 0) {
				comChoice = "rock";
			}
			else if(computer == 1) {
				comChoice = "paper";
			}
			else if(computer == 2) {
				comChoice = "scissors";
			}
			if(choice.equalsIgnoreCase("rock") && comChoice.equals("rock")) {
				System.out.println("It's a tie!");
			}
			else if(choice.equalsIgnoreCase("rock") && comChoice.equals("paper")) {
				System.out.println("Paper beats rock, you lose!");
				bool = false;
			}
		}

	}

}
