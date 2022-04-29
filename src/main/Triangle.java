import java.awt.Point;

// Sub class triangle of shapes, containing 3 points
public class Triangle extends Shape{

    private Point point1;
    private Point point2;
    private Point point3;

    // Constructor
    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    // Getter to find the center of a triangle
    public Point getCenter(){
        int x = (point1.x + point2.x + point3.x)/3;
        int y = (point1.y + point2.y + point3.y)/3;
        return new Point(x,y);
    }

    // Getter for area of the triangle.
    public double getArea(){
        return Math.abs((point1.x * (point2.y - point3.y) + point2.x * (point3.y - point1.y) + point3.x * (point1.y - point2.y))/2);
    }

    // Getter for circomfrence of triangle
    public double getCircumference(){
        double side1 = getSideLength(point1, point2);
        double side2 = getSideLength(point1, point3);
        double side3 = getSideLength(point2, point3); 
        return side1 + side2 + side3;
    }

    // Method that tests if a point is within the triangle or not
    public boolean inShape(Point point){
        Triangle triangle1 = new Triangle(this.point1, this.point2, point);
        Triangle triangle2 = new Triangle(this.point1, this.point3, point);
        Triangle triangle3 = new Triangle(this.point2, this.point3, point);
        //credits: https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/
        return triangle1.getArea() + triangle2.getArea() + triangle3.getArea() == getArea();
    }

    // Method that returns if another shape is in the triangle 
    public boolean inAnotherShape(Shape shape){
        return shape.inShape(point1) && shape.inShape(point2) && shape.inShape(point3) && shape.inShape(getCenter());
    }

    // Method that moves the shape to a new position
    public void moveShape(int x, int y){
        point1.x += x;
        point2.x += x;
        point3.x += x;
        point1.y += y;
        point2.y += y;
        point3.y += y;
    }

    // Getter that returns the sidelength of triangle
    public double getSideLength(Point point1, Point point2){
        return Math.sqrt(Math.pow(point1.x-point2.x, 2) + Math.pow(point1.y-point2.y,2));
    }
}