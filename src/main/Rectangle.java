import java.awt.Point;

public class Rectangle extends Shape{

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Rectangle(Point point1, Point point4){ //user chooses top-left corner and bottom-right corner
        this.point1 = point1;
        this.point2 = new Point(point4.x,point1.y);
        this.point3 = new Point(point1.x,point4.y);
        this.point4 = point4;

    }

    public Point getCenter(){
        int x = (point1.x + point4.x)/2;
        int y = (point1.y + point4.y)/2;
        return new Point(x,y);
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
        return point.x >= point1.x && point.x <= point2.x && point.y >= point1.y && point.y <= point3.y;
    }

    public boolean inAnotherShape(Shape shape){
        return shape.inShape(point1) && shape.inShape(point2) && shape.inShape(point3) && shape.inShape(point4) && shape.inShape(getCenter());
    }
 
    public void moveShape(int x, int y){
        point1.x += x;
        point2.x += x;
        point3.x += x;
        point4.x += x;
        point1.y += y;
        point2.y += y;
        point3.y += y;
        point4.y += y;
    }
}