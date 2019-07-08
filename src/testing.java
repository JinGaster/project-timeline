public class testing{
    public static void main(String[] args){
        Card testing = new Card("Clubs", 1);
        System.out.println(testing);
        testing.setValue(8);
        System.out.println(testing);
        testing.setSuit("Spades");
        System.out.println(testing);
    }
}