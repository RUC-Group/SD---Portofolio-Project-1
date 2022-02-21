import java.awt.Point;

public abstract class Shape{
    /*private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private Point center;
    private int radius;

    public Shape(Point point1, Point point2, Point point3, Point point4){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Shape(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Shape(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }*/

    public abstract Point getCenter();

    public abstract double getArea();

    public abstract double getCircumference();

    public abstract boolean inShape(Point point);

    public double getEuclideanDistance(Shape shape){
        Point center1 = getCenter();
        Point center2 = shape.getCenter();
        return Math.sqrt(Math.abs(center1.x-center2.x)^2+Math.abs(center1.y-center2.y)^2);
    }

    //public abstract boolean inAnotherShape(Shape shape);

    //public abstract int getOverlapCount();

    //public abstract void moveShape();

    
}