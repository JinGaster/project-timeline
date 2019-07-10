public class testingPolygon{
    public static void main(String[] args){
        Rectangle testing1 = new Rectangle(4,2);
        Shape testing2 = new Shape(10);
        System.out.println();

        System.out.println("R E C T A N G L E");
        System.out.println(testing1);
        testing1.setLength(5);
        System.out.println(testing1);
        testing1.setWidth(4);
        System.out.println(testing1);
        System.out.println();

        System.out.println("P O L Y G O N");
        System.out.println(testing2);
        testing2.setSides(5);
        System.out.println(testing2);
        testing2.getSides();
    }
}