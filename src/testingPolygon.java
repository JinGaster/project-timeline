public class testingPolygon{
    public static void main(String[] args){
    	// polygon testing class, i.e rectangles, squares, etc.
        Rectangle testing1 = new Rectangle(4,2);
        Shape testing2 = new Shape(10);
        square testing3 = new square(6);
        System.out.println();

        System.out.println("R E C T A N G L E");
        System.out.println(testing1);
        testing1.setLength(5);
        System.out.println(testing1);
        testing1.setWidth(4);
        System.out.println(testing1);
        System.out.println("This rectangle has " +testing1.getSides()+ " sides.");
        System.out.println("All the interior angles of this rectangle add up to " +testing1.getAngle()+ ".");
        System.out.println();

        System.out.println("P O L Y G O N");
        System.out.println(testing2);
        testing2.setSides(5);
        System.out.println(testing2);
        testing2.getSides();
        System.out.println();

        System.out.println("S Q U A R E");
        System.out.println(testing3);
        testing3.setSide(3);
        System.out.println(testing3);
        testing3.getSide();
        System.out.println();
    }
}