import java.util.Scanner;
public class quizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		System.out.println("Does a polygon have less than 3 sides?");
		String input = scan.next();
		if(input.equalsIgnoreCase("Yes")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		else if(input.equalsIgnoreCase("No")) {
			System.out.println("Correct.");
			correct++;
		}
		else {
		 	
		}
		System.out.println("Do complementary angles add up to 90 degrees?");
		String input2 = scan.next();
		if(input2.equalsIgnoreCase("Yes")) {
			System.out.println("Correct.");
			correct++;
		}
		else if(input2.equalsIgnoreCase("No")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		System.out.println("Do supplementary angles add up to 270 degrees?");
		String input3 = scan.next();
		if(input3.equalsIgnoreCase("Yes")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		else if(input3.equalsIgnoreCase("No")) {
			System.out.println("Correct.");
			correct++;
		}
		System.out.println("An irrational number times another irrational number will always equal an irrational number, true or false?");
		String input4 = scan.next();
		if(input4.equalsIgnoreCase("True")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		else if(input4.equalsIgnoreCase("False")) {
			System.out.println("Correct.");
			correct++;
		}
		System.out.println("Sine, Cosine, Tangent, Area. Which one is the odd one out?");
		String input5 = scan.next();
		if(input5.equalsIgnoreCase("Sine")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		else if(input5.equalsIgnoreCase("Cosine")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		else if(input5.equalsIgnoreCase("Tangent")) {
			System.out.println("Incorrect.");
			incorrect++;
		}
		else if(input5.equalsIgnoreCase("Area")) {
			System.out.println("Correct.");
			correct++;
		}
		System.out.println("You have "+correct+" correct answers out of 5 questions total, meaning that you have "+incorrect+" incorrect answers.");
	}

}
