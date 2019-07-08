import java.util.ArrayList;
import java.util.Scanner;
public class shoppingList2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList < String > list = new ArrayList < String > ();
        System.out.println("Welcome to the MORE Store [MK II].");
        while(true){
            System.out.println("State if you want to add, remove, or view items from your shopping list. You may also exit when you're done.");
            String choice = scan.nextLine();
            if(choice.equalsIgnoreCase("add")){
                System.out.println("State an item that you would like to add.");
                String addChoice = scan.nextLine();
                System.out.println("You have successfully added "+addChoice+" to your shopping list.");
                list.add(addChoice);
                continue;
            }
            else if(choice.equalsIgnoreCase("remove")){
                System.out.println("State an item that you would like to remove. You may use the item name (must be case sensitive).");
                String removeChoice = scan.nextLine();
                System.out.println("You are now removing "+removeChoice+", assuming that you had that in your shopping list.");
                list.remove(removeChoice);
                continue;
            }
            else if(choice.equalsIgnoreCase("view")){
                System.out.println("These are the items on your shopping list.");
                System.out.println(list);
                continue;
            }
            else if(choice.equalsIgnoreCase("exit")){
                System.out.println("Goodbye. You will be leaving with these items.");
                System.out.println(list);
                break;
            }
            else{
                System.out.println("That is not a valid command.");
                continue;
            }
        }
        //list.add("Food");
        //list.add("Soda Drink");
        //System.out.println(list);
        //list.remove("Food");
        //System.out.println("R E M O V I N G   F O O D");
        //System.out.println(list);
    }
}