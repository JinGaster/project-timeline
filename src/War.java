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
        //Shuffled Cards ^^^
        ArrayList < Card > p1 = new ArrayList < Card > ();
        ArrayList < Card > p2 = new ArrayList < Card > ();
        ArrayList < Card > table = new ArrayList < Card > ();
        for(int x=0; x<26; x++){
            p1.add(cardDeck.getDeck()[x]);
            p2.add(cardDeck.getDeck()[26+x]);
        }
        //System.out.println(p1);
        //System.out.println(p2);
        //Deck split in half to both players ^^^
        int turn = 0;
        System.out.println("26 cards have been dealt to both people. Press ENTER to start the round.");
        //scan.nextLine();
        while(true){
            turn++;
            System.out.println("TURN "+turn+":");
            System.out.println("3, 2, 1, War!");
            table.add(p1.get(0));
            table.add(p2.get(0));
            //System.out.println(p1);
            //System.out.println(p2);
            //Deck split in half to both players ^^^
            System.out.println("P1 put down the "+p1.get(0)+", while P2 put down the "+p2.get(0)+".");
            if(p1.get(0).getValue() == p2.get(0).getValue()){
                p1.remove(0);
                p2.remove(0);
                System.out.println("Both card values are the same, this means war!");
                if(p1.size() > 3){
                    for(int b=0;b<3;b++){
                        table.add(p1.get(0));
                        p1.remove(0);
                    }
                    System.out.println("P1 has put 3 cards on the table, face down.");
                }
                else{
                    for(int c=0;c<(p1.size()-1);c++){
                        table.add(p1.get(0));
                        p1.remove(0);
                    }
                    System.out.println("P1 has put "+(p1.size()-1)+" cards on the table, face down.");
                }
                if(p2.size() > 3){
                    for(int d=0;d<3;d++){
                        table.add(p2.get(0));
                        p2.remove(0);
                    }
                    System.out.println("P2 has put 3 cards on the table, face down. Press ENTER to start next round.");
                    //scan.nextLine();
                    continue;
                }
                else{
                    for(int e=0;e<(p2.size()-1);e++){
                        table.add(p2.get(0));
                        p2.remove(0);
                    }
                    System.out.println("P2 has put "+(p2.size()-1)+" cards on the table, face down. Press ENTER to start next round.");
                    //scan.nextLine();
                    continue;
                }
            }
            else if(p1.get(0).getValue() > p2.get(0).getValue()){
                System.out.println("P1's card value is greater, they get the cards!");
                p1.addAll(table);
                table.clear();
                p2.remove(0);
                p1.remove(0);
                if(p2.size() <= 0){
                    System.out.println("Game over! P1 wins.");
                    break;
                }
            }
            else if(p1.get(0).getValue() < p2.get(0).getValue()){
                System.out.println("P2's card value is greater, they get the cards!");
                p2.addAll(table);
                table.clear();
                p1.remove(0);
                p2.remove(0);
                if(p1.size() <= 0){
                    System.out.println("Game over! P2 wins.");
                    break;
                }
            }
            System.out.println("P1 has "+p1.size()+" cards left, while P2 has "+p2.size()+" cards left. There are also "+table.size()+" cards on the table.");
            //System.out.println(p1);
            //System.out.println(p2);
            //System.out.println(table);
            if(p1.size() <= 0 || p2.size() <= 0){
                break;
            }
            else{
                System.out.println("Round complete. Press ENTER to move on.");
                //scan.nextLine();
                continue;
            }
        }
        scan.close();
    }
}