import java.util.Scanner;
import java.util.ArrayList;
public class Blackjack{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Deck cardDeck = new Deck();
        boolean abovePlayer = true;
        cardDeck.shuffle();
        ArrayList < Card > player = new ArrayList < Card > ();
        ArrayList < Card > dealer = new ArrayList < Card > ();
        ArrayList < Card > table = new ArrayList < Card > ();

        //make a table with all 52, then pass out cards
        
        for(int x=0; x<47; x++){
            table.add(cardDeck.getDeck()[x]);
        }
        for(int y=0; y<3; y++){
            player.add(cardDeck.getDeck()[47+y]);
        }
        for(int z=0; z<2; z++){
            dealer.add(cardDeck.getDeck()[50+z]);
        }

        //System.out.println(table);
        //System.out.println(player);
        //System.out.println(dealer);
        //System.out.println(cardDeck);

        System.out.print("Welcome to Blackjack. These are your cards: ");
        System.out.println(player);
        System.out.print("And this is one of the dealer's cards: ");
        System.out.println(dealer.get(0));
        while(true){
            //System.out.println("Your value is "+{VALUE}+".");
            System.out.println("Would you like to hit or stay?");
            String pChoice = scan.next();
            if(pChoice.equalsIgnoreCase("hit")){
                //draw a card, if above 21, you looooose
                //abovePlayer = checkPlayer(player, abovePlayer);
            }
            else if(pChoice.equalsIgnoreCase("stay")){
                //stays at that score, and goes to new 3 cards
            }
            else{
                System.out.println("That is not a valid input.");
                continue;
            }
        }
    }

    public static void checkPlayer(ArrayList player, boolean abovePlayer, Deck cardDeck){
        for(int a=0; a<player.size(); a++){
            if(player.get(a).getValue() > 10){
                //jacks, queens, kings are all 10, aces are 11.
            }
        }
    }
}