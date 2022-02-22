import java.awt.Point;

public class Circle extends Shape{
    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }

    public double getArea(){
        return Math.PI*(radius^2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public boolean inShape(Point point){
        if(Math.sqrt(Math.abs(point.x-center.x)^2+Math.abs(point.y-center.y)^2)<=radius){
            return true;
        }
        else return false;
    }

    public void moveShape(int x, int y){
        center.x += x;
        center.y += y;
    }
}