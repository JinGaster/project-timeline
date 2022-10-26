import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rps game using scanner
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
			System.out.println("The computer chose "+comChoice+".");
			if(choice.equalsIgnoreCase("rock") && comChoice.equals("rock")) {
				System.out.println("It's a tie!");
			}
			else if(choice.equalsIgnoreCase("rock") && comChoice.equals("paper")) {
				System.out.println("Paper beats rock, you lose!");
				bool = false;
			}
			else if(choice.equalsIgnoreCase("rock") && comChoice.equals("scissors")) {
				System.out.println("Rock beats scissors, you win!");
				bool = false;
			}
			else if(choice.equalsIgnoreCase("paper") && comChoice.equals("rock")) {
				System.out.println("Paper beats rock, you win!");
				bool = false;
			}
			else if(choice.equalsIgnoreCase("paper") && comChoice.equals("paper")) {
				System.out.println("It's a tie!");
			}
			else if(choice.equalsIgnoreCase("paper") && comChoice.equals("scissors")) {
				System.out.println("Scissors beats paper, you lose!");
				bool = false;
			}
			else if(choice.equalsIgnoreCase("scissors") && comChoice.equals("rock")) {
				System.out.println("Rock beats scissors, you lose!");
				bool = false;
			}
			else if(choice.equalsIgnoreCase("scissors") && comChoice.equals("paper")) {
				System.out.println("Scissors beats paper, you win!");
				bool = false;
			}
			else if(choice.equalsIgnoreCase("scissors") && comChoice.equals("scissors")) {
				System.out.println("It's a tie!");
			}
		}
		scan.close();
	}

}
