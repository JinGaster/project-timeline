import java.util.Scanner;
public class shoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean keepGoing = true;		
		String[] list = new String[1];
		int x = 0;
		while(keepGoing == true) {
			System.out.println("Would you like to add, remove or view your shopping list? You may also choose to exit when you are done.");
			String listChoice = scan.next();
			if(listChoice.equalsIgnoreCase("add")) {
				int var = x;
				System.out.println("State an item to add to your shopping list.");
				String item = scan.next();
				String head = "";
				String var2 = head;
				String var3 = list[var-1];
				list = new String[var+1];				
				x++;											
				list[var] = item;
				//for(int a = 1; a < var; a++) {
				//	list[a] = list[a-1];
				//}
				if(var == 1) {
					var3 = head;
				}
				else if(var > 1) {
					var3 = item;
				}
				else {
					
				}
			}
			else if(listChoice.equalsIgnoreCase("remove")) {
				System.out.println("Use the number place to state an item to remove from your shopping list.");
				int remove = scan.nextInt();
				list[remove] = null;
				for(int z=remove; z<x; z++) {
					list[z] = list[z-1];
				}
				x--;
			}
			else if(listChoice.equalsIgnoreCase("view")) {
				System.out.println("These are the items that you have on your shopping list.");
				for(int y=0; y<list.length; y++) {
					System.out.println(list[y]);
				}
			}
			else if(listChoice.equalsIgnoreCase("exit")) {
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
