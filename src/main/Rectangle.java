import java.awt.Point;

public class Rectangle extends Shape{

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Rectangle(Point point1, Point point4){
        this.point1 = point1;
        this.point2 = new Point(point4.x,point1.y);
        this.point3 = new Point(point1.x,point4.y);
        this.point4 = point4;
    }

    public Point getCenter(){
        int x = (point1.x + point4.x)/2;
        int y = (point1.y + point4.y)/2;
        Point center = new Point(x,y);
        return center;
    }

    public double getArea(){
        int side1 = Math.abs(point1.x - point2.x);
        int side2 = Math.abs(point1.y - point3.y);
        return side1*side2;
    }

    public double getCircumference(){
        int side1 = Math.abs(point1.x - point2.x);
        int side2 = Math.abs(point1.y - point3.y);
        return (2*side1)+(2*side2);
    }

    public boolean inShape(Point point){
        if(point.x>point1.x && point.x < point2.x && point.y>point1.y && point.y<point3.y){
            return true;
        }
        else return false;
    }
}