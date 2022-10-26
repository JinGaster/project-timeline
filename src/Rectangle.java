public class Rectangle extends Shape{
	// a rectangle is a shape
    private double length;
    private double width;
    public Rectangle(double l, double w){
        super(4);
        length = l;
        width = w;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double l){
        length = l;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getPerimeter(){
        return 2*(width + length);
    }
    public double getArea(){
        return (width * length);
    }
    
    public String toString(){
        return "This rectangle has a length of " +length+ " and a width of " +width+ ", which means that it has a perimeter of " +getPerimeter()+ " and an area of " +getArea()+ " .";
    }
}