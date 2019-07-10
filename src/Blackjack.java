import java.util.Scanner;
import java.util.ArrayList;
public class Blackjack{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Deck cardDeck = new Deck();
        boolean abovePlayer = true;
        int ace = 11;
        int pValue = 0;
        boolean usedAces = false;
        cardDeck.shuffle();
        ArrayList < Card > player = new ArrayList < Card > ();
        ArrayList < Card > dealer = new ArrayList < Card > ();
        ArrayList < Card > table = new ArrayList < Card > ();

        //make a table with all 52, then pass out cards
        
        for(int x=0; x<52; x++){
            table.add(cardDeck.getDeck()[x]);
        }
        for(int y=0; y<2; y++){
            player.add(table.get(0));
            table.remove(0);
        }
        for(int z=0; z<2; z++){
            dealer.add(table.get(0));
            table.remove(0);
        }

        //System.out.println(table);
        //System.out.println(player);
        //System.out.println(dealer);
        //System.out.println(cardDeck);

        System.out.println();
        System.out.print("Welcome to Blackjack. These are your cards: ");
        System.out.println(player);
        System.out.print("And this is one of the dealer's cards: ");
        System.out.println(dealer.get(0));
        while(true){
            pValue = 0;
            pValue = checkPlayer(player, abovePlayer, cardDeck, pValue, ace, usedAces);
            if(pValue > 21){
                if(usedAces == false){
                    ace = 1;
                    usedAces = true;
                    continue;
                }
                else if(usedAces == true){
                    System.out.println("You have gone over 21. It is now the dealer's turn.");
                    System.out.print("These were your cards: ");
                    System.out.println(player);
                    break; //(used to stop program, will delete later)
                }
                else{
                    System.out.println("You have gone over 21. It is now the dealer's turn.");
                    System.out.print("These were your cards: ");
                    System.out.println(player);
                    break; // ^^^
                }
            }
            System.out.println("Your value is "+pValue+".");
            
            System.out.println("Would you like to hit or stay?");
            String pChoice = scan.next();
            if(pChoice.equalsIgnoreCase("hit")){
                player.add(table.get(0));
                table.remove(0);
                System.out.println("You have decided to hit.");
                System.out.println();
                System.out.print("These are your cards: ");
                System.out.println(player);
                continue;
            }
            else if(pChoice.equalsIgnoreCase("stay")){
                System.out.println("You have decided to stay.");
                System.out.println();
                //add up that score (?)
                //remove those cards in your hand
                //get 3 new cards, and go again.
                usedAces = false;
                ace = 11;
                break;
                //continue;
            }
            else{
                System.out.println("That is not a valid input.");
                System.out.println();
                continue;
            }
        }
        scan.close();
    }

    public static int checkPlayer(ArrayList < Card > player, boolean abovePlayer, Deck cardDeck, int pValue, int ace, boolean usedAces){
        for(int a=0; a<player.size(); a++){
            if(player.get(a).getValue() >= 10 && player.get(a).getValue() < 14){ //(method .getValue() is undefined)
                //jacks, queens, kings are all 10, aces are 11.
                pValue += 10;
            }
            else if(player.get(a).getValue() == 14){
                usedAces = true;
                pValue += ace; //if the player goes over 21, if there's an ace, the value goes from 11 to 1.
            }
            else{
                pValue += player.get(a).getValue(); //returns the value of the card. simple.
            }
        }
        return pValue;
    }
}