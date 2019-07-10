import java.util.Scanner;
import java.util.ArrayList;
public class Blackjack{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Deck cardDeck = new Deck();
        int aceValue = 11;
        int pdValue = 0;
        boolean usedAces = false;
        cardDeck.shuffle();

        ArrayList < Card > player = new ArrayList < Card > ();
        ArrayList < Card > dealer = new ArrayList < Card > ();
        ArrayList < Card > table = new ArrayList < Card > ();

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
            pdValue = 0;
            pdValue = checkPlayer(player, cardDeck, pdValue, aceValue, usedAces);
            if(pdValue > 21){
                if(usedAces == false){
                    aceValue = 1;
                    usedAces = true;
                    continue;
                }
                else if(usedAces == true){
                    System.out.println("You have gone over 21. It is now the dealer's turn.");
                    System.out.println();
                    usedAces = false;
                    aceValue = 11;
                    break;
                }
                else{
                    System.out.println("You have gone over 21. It is now the dealer's turn.");
                    System.out.println();
                    usedAces = false;
                    aceValue = 11;
                    break;
                }
            }
            System.out.println("Your value is "+pdValue+".");
            
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
                System.out.println("You have decided to stay with a value of "+pdValue+".");
                System.out.println();
                usedAces = false;
                aceValue = 11;
                scan.close();
                System.exit(0);
            }
            else{
                System.out.println("That is not a valid input.");
                System.out.println();
                continue;
            }
        }

        System.out.println("The dealer reveals their other card to be the "+dealer.get(1)+""); //dealers must hit when below 17. They stay when they're at or above 17.

        while(true){
            System.out.println("This is the dealer's hand: ");
            System.out.println(dealer);
            pdValue = checkDealer(dealer, cardDeck, pdValue, aceValue, usedAces);
            System.out.println("Press ENTER to continue.");
            scan.nextLine();
            System.out.println();
            if(pdValue < 17){
                System.out.println("The dealer has a value below 17. This means he must hit.");
                dealer.add(table.get(0));
                table.remove(0);
                System.out.println("Press ENTER to continue.");
                scan.nextLine();
                System.out.println();
                continue;
            }
            else if(pdValue >= 17 && pdValue <= 21){
                System.out.println("The dealer has decided to stay with a value of "+pdValue+".");
                usedAces = false;
                aceValue = 11;
                break;
            }
            else if(pdValue > 21){
                if(usedAces == false){
                    aceValue = 1;
                    usedAces = true;
                    continue;
                }
                else if(usedAces == true){
                    System.out.println("The dealer has gone over 21, which means game over.");
                    System.out.print("These were the dealer's cards: ");
                    System.out.println(dealer);
                    usedAces = false;
                    aceValue = 11;
                    break;
                }
                else{
                    System.out.println("The dealer has gone over 21, which means game over.");
                    System.out.print("These were the dealer's cards: ");
                    System.out.println(dealer);
                    usedAces = false;
                    aceValue = 11;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Thanks for playing.");
        System.out.println();
        scan.close();
    }

    public static int checkPlayer(ArrayList < Card > player, Deck cardDeck, int pdValue, int aceValue, boolean usedAces){
        for(int a=0; a<player.size(); a++){
            if(player.get(a).getValue() >= 10 && player.get(a).getValue() < 14){
                //jacks, queens, kings are all 10, aces are 11.
                pdValue += 10;
            }
            else if(player.get(a).getValue() == 14){
                usedAces = true;
                pdValue += aceValue;
            }
            else{
                pdValue += player.get(a).getValue();
            }
        }
        return pdValue;
    }

    public static int checkDealer(ArrayList < Card > dealer, Deck cardDeck, int pdValue, int aceValue, boolean usedAces){
        pdValue = 0;
        for(int c=0; c<dealer.size(); c++){
            if(dealer.get(c).getValue() >= 10 && dealer.get(c).getValue() < 14){
                pdValue += 10;
            }
            else if(dealer.get(c).getValue() == 14){
                usedAces = true;
                pdValue += aceValue;
            }
            else{
                pdValue += dealer.get(c).getValue();
            }
        }
        return pdValue;
    }
}