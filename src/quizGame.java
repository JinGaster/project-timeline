import java.util.Scanner;
public class quizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generic quiz, testing out scanner
		Scanner scan = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		boolean question1 = true;
		while(question1 == true) {
			System.out.println("Does a polygon have less than 3 sides?");
			String input = scan.next();
			if(input.equalsIgnoreCase("Yes")) {
				System.out.println("Incorrect.");
				incorrect++;
				question1 = false;
			}
			else if(input.equalsIgnoreCase("No")) {
				System.out.println("Correct.");
				correct++;
				question1 = false;
			}
			else {
				System.out.println("Answer is not valid.");
				continue;
			}
		}
		boolean question2 = true;
		while(question2 == true) {
			System.out.println("Do complementary angles add up to 90 degrees?");
			String input2 = scan.next();
			if(input2.equalsIgnoreCase("Yes")) {
				System.out.println("Correct.");
				correct++;
				question2 = false;
			}
			else if(input2.equalsIgnoreCase("No")) {
				System.out.println("Incorrect.");
				incorrect++;
				question2 = false;
			}
			else {
				System.out.println("Answer is not valid.");
				continue;
			}
		}
		boolean question3 = true;
		while(question3 == true) {
			System.out.println("Do supplementary angles add up to 270 degrees?");
			String input3 = scan.next();
			if(input3.equalsIgnoreCase("Yes")) {
				System.out.println("Incorrect.");
				incorrect++;
				question3 = false;
			}
			else if(input3.equalsIgnoreCase("No")) {
				System.out.println("Correct.");
				correct++;
				question3 = false;
			}
			else {
				System.out.println("Answer is not valid");
				continue;
			}
		}
		boolean question4 = true;
		while(question4 == true) {
			System.out.println("An irrational number times another irrational number will always equal an irrational number, true or false?");
			String input4 = scan.next();
			if(input4.equalsIgnoreCase("True")) {
				System.out.println("Incorrect.");
				incorrect++;
				question4 = false;
			}
			else if(input4.equalsIgnoreCase("False")) {
				System.out.println("Correct.");
				correct++;
				question4 = false;
			}
			else {
				System.out.println("Answer is not valid.");
				continue;
			}
		}
		boolean question5 = true;
		while(question5 == true) {
			System.out.println("Sine, Cosine, Tangent, Area. Which one is the odd one out?");
			String input5 = scan.next();
			if(input5.equalsIgnoreCase("Sine")) {
				System.out.println("Incorrect.");
				incorrect++;
				question5 = false;
			}
			else if(input5.equalsIgnoreCase("Cosine")) {
				System.out.println("Incorrect.");
				incorrect++;
				question5 = false;
			}
			else if(input5.equalsIgnoreCase("Tangent")) {
				System.out.println("Incorrect.");
				incorrect++;
				question5 = false;
			}
			else if(input5.equalsIgnoreCase("Area")) {
				System.out.println("Correct.");
				correct++;
				question5 = false;
			}
			else {
				System.out.println("Answer is not valid.");
				continue;
			}
		}
		System.out.println("You have "+correct+" correct answers out of 5 questions total, meaning that you have "+incorrect+" incorrect answers.");
		scan.close();
	}

}
