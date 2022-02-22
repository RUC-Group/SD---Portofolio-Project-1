import java.awt.Point;

public class Triangle extends Shape{

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getCenter(){
        int x = (point1.x + point2.x + point3.x)/3;
        int y = (point1.y + point2.y + point3.y)/3;
        Point center = new Point(x,y);
        return center;
    }

    public double getArea(){
        double side1 = getSideLength(point1, point2);
        double side2 = getSideLength(point1, point3);
        double side3 = getSideLength(point2, point3); 
        double s = getCircumference()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); // Heron´s formula
    }

    public double getCircumference(){
        double side1 = getSideLength(point1, point2);
        double side2 = getSideLength(point1, point3);
        double side3 = getSideLength(point2, point3); 
        return side1 + side2 + side3;
    }

    public boolean inShape(Point point){
        Triangle triangle1 = new Triangle(this.point1, this.point2, point);
        Triangle triangle2 = new Triangle(this.point1, this.point3, point);
        Triangle triangle3 = new Triangle(this.point2, this.point3, point);
        if(triangle1.getArea()+triangle2.getArea()+triangle3.getArea()==getArea()){ //credits: https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/
            return true;
        }
        else return false;
    }

    public boolean inAnotherShape(Shape shape){
        if(shape.inShape(point1)&&shape.inShape(point2)&&shape.inShape(point3)){
            return true;
        }else return false;
    }
    public void moveShape(int x, int y){
        point1.x += x;
        point2.x += x;
        point3.x += x;
        point1.y += y;
        point2.y += y;
        point3.y += y;
    }

    public double getSideLength(Point point1, Point point2){
        return Math.sqrt(Math.abs(point1.x-point2.x)^2+Math.abs(point1.y-point2.y)^2);
    }
}