public class Card{
    private String suit;
    // club, spade, diamond, heart
    // private means no access
    private int value;
    // 2-10, Jack, Queen, King, Ace
    public Card(String s, int v){
        this.suit = s;
        this.value = v;
    }
    //this makes the card suit and value
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }
    //tells the card

    public void setValue(int v){
        value = v;
    }
    public void setSuit(String s){
        suit = s;
    }
    
    public String toString(){
        if(this.value == 11){
            return "Jack of "+ this.suit;
        }
        else if(this.value == 12){
            return "Queen of "+ this.suit;
        }
        else if(this.value == 13){
            return "King of "+ this.suit;
        }
        else if(this.value == 14 || this.value == 1){
            return "Ace of "+ this.suit;
        }
        return this.value +" of "+ this.suit;
    }

}