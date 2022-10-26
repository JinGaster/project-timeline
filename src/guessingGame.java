import java.util.Scanner;
import java.util.Random;
public class guessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random number = new Random();
		boolean bool = true;
		int guesses = 0;
		System.out.println("Try and guess my number! You have 10 guesses.");
		int number1 = number.nextInt(100);
		while(bool == true) {		
				if (guesses > 0) {
					System.out.println("Try again! You have "+(10-guesses)+" guesses left!");
				}
				int first = scan.nextInt();
				if(first == number1) {
					System.out.println("Correct!");
					bool = false;
				}
				else if(first > number1) {
					System.out.println("Incorrect. Think lower.");
				}
				else if(first < number1) {
					System.out.println("Incorrect. Think higher.");
				}
				guesses++;
			if(guesses == 10) {
				System.out.println("Sorry! You lose. The number was "+number1+".");
				bool = false;
			}
		}
		scan.close();
	}

}
