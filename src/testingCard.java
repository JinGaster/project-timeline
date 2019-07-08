public class testing{
    public static void main(String[] args){
     //   Card testing = new Card("Clubs", 1);
     //   System.out.println(testing);
     //   testing.setValue(8);
     //   System.out.println(testing);
     //  testing.setSuit("Spades");
      //  System.out.println(testing);
    //}
        System.out.println("U N S H U F F L E D   V E R S I O N");
        Deck testDeck = new Deck();
        for(int x = 0; x<52;x++){
            System.out.println(testDeck.getDeck()[x]);
        }
        System.out.println("S H U F F L E D   V E R S I O N");
        testDeck.shuffle();
        for(int x = 0; x<52;x++){
            System.out.println(testDeck.getDeck()[x]);
        }
    }
}