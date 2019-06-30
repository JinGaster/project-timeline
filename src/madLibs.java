import java.util.Scanner;
public class madLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a noun: ");
		String noun = scan.nextLine();
		System.out.print("Enter a verb: ");
		String verb = scan.nextLine();
		System.out.print("Enter an adjective: ");
		String adjective = scan.nextLine();
		System.out.print("Enter a noun: ");
		String noun2 = scan.nextLine();
		System.out.print("Enter a past-tense verb: ");
		String verb2 = scan.nextLine();
		System.out.print("Enter an adjective: ");
		String adjective2 = scan.nextLine();
		System.out.print("Enter a noun: ");
		String noun3 = scan.nextLine();
		System.out.print("Enter a verb: ");
		String verb3 = scan.nextLine();
		System.out.print("Enter an adjective: ");
		String adjective3 = scan.nextLine();
		System.out.print("Enter a noun: ");
		String noun4 = scan.nextLine();
		System.out.print("Enter a verb: ");
		String verb4 = scan.nextLine();
		System.out.print("Enter an adjective: ");
		String adjective4 = scan.nextLine();
		System.out.println("The quick "+noun+" wanted to "+verb+" over the "+adjective+" dog.");
		System.out.println("However, the quicker "+noun2+" "+verb2+" the "+noun+" before it could jump over the now-"+adjective2+" dog.");
		System.out.println("Afterwards, the "+noun3+" came out of nowhere and wanted to "+verb3+" the "+adjective3+" plapp.");
		System.out.println("Finally, the story ends after people try to slot "+noun4+" into vending machines to "+verb4+" and the "+adjective4+" monster iudfsdrfhuidf.");
		scan.close();
	}

}
