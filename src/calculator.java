import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean calc = true;
		while(calc == true) {
			System.out.println("Insert your first number, the operation, then the second number.");
			double first = scan.nextDouble();
			String operation = scan.next();			
			double second = scan.nextDouble();
			if(operation.equals("exit")) {
				calc = false;
			}
			else if(operation.equals("+") || operation.equalsIgnoreCase("add")) {
				System.out.println(first+second);
			}
			else if(operation.equals("-") || operation.equalsIgnoreCase("subtract")) {
				System.out.println(first-second);
			}
			else if(operation.equals("*") || operation.equalsIgnoreCase("multiply")) {
				System.out.println(first*second);
			}
			else if(operation.equals("/") || operation.equalsIgnoreCase("divide")) {
				System.out.println(first/second);
			}
			else {
				System.out.println("Operation is not valid.");
			}
		}
		scan.close();
	}
}
