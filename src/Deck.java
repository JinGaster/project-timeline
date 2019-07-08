import java.util.Random;
public class Deck{
    private Card[] deck;
    public Deck(){
        deck = new Card[52];
        int count=0;
        for(int x=2; x<=14; x++){
            deck[count] = new Card("Clubs", x);
            count++;
            deck[count] = new Card("Spades", x);
            count++;
            deck[count] = new Card("Diamonds", x);
            count++;
            deck[count] = new Card("Hearts", x);
            count++;
        }
    }
    public Card[] getDeck(){
        return deck;
    }
    public void shuffle(){
        Random rand = new Random();
        for(int y=0;y<52;y++){
            int r = rand.nextInt(52-y)+y;
            Card temp = deck[r];
            deck[r] = deck[y];
            deck[y] = temp;
        }
    }
}