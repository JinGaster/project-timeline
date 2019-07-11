public class Shape{
    private int sides;
    public Shape(int s){
        this.sides = s;
    }
    public int getSides(){
        return sides;
    }
    public int getAngle(){
        return 180*(sides-2);
    }
    public void setSides(int s){
        sides = s;
    }

    public String toString(){
        return "This polygon has " +this.sides+ " sides, and so, the interior angles of this shape add up to " +getAngle()+ ".";
    }
}