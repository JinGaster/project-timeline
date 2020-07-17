public class square extends Rectangle{
    public square(double side){
        super(side, side);
    }
    public double getSide(){
        return this.getLength();
    }
    public void setSide(double side){
        this.setLength(side);
        this.setWidth(side);
    }
    public String toString(){
        return "This square has a side length of " +this.getSide()+ " and so the perimeter is " +getPerimeter()+ " and an area of " +getArea()+ ".";
    }
}