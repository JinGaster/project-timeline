import java.util.Scanner;
public class shoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;
		int x = 0;
		while(keepGoing == true) {
			String[] list = new String[x+1];
			System.out.println("Would you like to add, remove or view your shopping list? You may also choose to exit when you are done.");
			String listChoice = scan.next();
			if(listChoice.equalsIgnoreCase("add")) {
				System.out.println("State an item to add to your shopping list.");
				String item = scan.next();				
				list[x] = item;
				x++;
			}
			if(listChoice.equalsIgnoreCase("remove")) {
				System.out.println("Use the number place to state an item to remove from your shopping list.");
				int remove = scan.nextInt();
				list[remove] = null;
				for(int z=remove; z<x; z++) {
					list[z] = list[z-1];
				}
				x--;
			}
			if(listChoice.equalsIgnoreCase("view")) {
				System.out.println("These are the items that you have on your shopping list.");
				for(int y=0; y<x; y++) {
					System.out.println(list[y]);
				}
			}
			if(listChoice.equalsIgnoreCase("exit")) {
				System.out.println("These are the items you will be leaving with. Goodbye.");
				for(int y=0; y<x; y++) {
					System.out.println(list[y]);
				}
				keepGoing = false;
			}
		}
		scan.close();
	}
}
