import java.util.ArrayList;
import java.util.Scanner;
public class War{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Deck cardDeck = new Deck();
        cardDeck.shuffle();
        //for(int x=0;x<52;x++){
        //    System.out.println(cardDeck.getDeck()[x]);
        //}
        ArrayList < Card > p1 = new ArrayList < Card > ();
        ArrayList < Card > p2 = new ArrayList < Card > ();
        ArrayList < Card > table = new ArrayList < Card > ();
        for(int x=0; x<26; x++){
            p1.add(cardDeck.getDeck()[x]);
            p2.add(cardDeck.getDeck()[26+x]);
        }
        //System.out.println(p1);
        //System.out.println(p2);
        System.out.println("The cards have been dealt to both people. Press ENTER to start the round.");
        scan.nextLine();
        System.out.println("3, 2, 1, War!");
        table.add(p1.get(0));
        table.add(p2.get(0));
        //System.out.println(p1);
        //System.out.println(p2);
        System.out.println("p1 put down the "+p1.get(0)+", while p2 put down the "+p2.get(0)+".");
        if(p1.getValue() == p2.getValue()){
            System.out.println("w   a   r.");
        }
        else if()
        p1.remove(0);
        p2.remove(0);


        //if(p1 value card == p2 value card){
        //  WAR part goes here
        //}
        //else if(p1 has higher value){
        //  p1 gets the cards
        //}
        //else if(p2 has higher value){
        //  p2 gets the cards
        //}
        
    }
}