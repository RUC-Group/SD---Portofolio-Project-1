import java.awt.*;

public class Main{
    public static void main(String[] args) {
        //initialize shapes
        Rectangle rect;
        Rectangle rect2;
        Triangle triangle;
        Circle circle;
        Circle circle2;

        rect = new Rectangle(new Point(10,10), new Point(50,50));
        rect2 = new Rectangle(new Point(15,30), new Point(20,40));
        triangle = new Triangle(new Point(20,20), new Point(10,40),new Point(30,60));
        circle = new Circle(new Point(50,50),10);
        circle2 = new Circle(new Point(20,40),5);


        //print center coordinates for all shapes
        System.out.println("Center for rect: x = "+rect.getCenter().getX() +", y = "+rect.getCenter().getX());
        System.out.println("Center for rect2: x = "+rect2.getCenter().getX() +", y = "+rect2.getCenter().getX());
        System.out.println("Center for triangle: x = "+triangle.getCenter().getX() +", y = "+triangle.getCenter().getX());
        System.out.println("Center for circle: x = "+circle.getCenter().getX() +", y = "+circle.getCenter().getX());
        System.out.println("Center for circle2: x = "+circle2.getCenter().getX() +", y = "+circle2.getCenter().getX());

        //print Area for rect, triangle and circle
        System.out.println("Area of rect: "+rect.getArea());
        System.out.println("Area of triangle: "+triangle.getArea());
        System.out.println("Area of circle: "+circle.getArea());

    }
}