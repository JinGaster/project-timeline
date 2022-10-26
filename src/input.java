import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner basics
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Your name is "+name+".");
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("Your age is "+age+".");
		System.out.println("Year born is "+(2019-age)+".");
		scan.close();
	}
}
