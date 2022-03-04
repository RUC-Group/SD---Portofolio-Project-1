import java.awt.Point;

public abstract class Shape{

    public abstract Point getCenter(); //returns the Center of a Shape.

    public abstract double getArea(); //returns the surface area value of a Shape.

    public abstract double getCircumference(); //returns the circumference value of a Shape.

    public abstract boolean inShape(Point point); //Checks if the given point is within a Shape.

    public double getEuclideanDistance(Shape shape){
        Point center1 = getCenter();
        Point center2 = shape.getCenter();
        return Math.sqrt(Math.pow(center1.x-center2.x,2)+Math.pow(center1.y-center2.y,2)); //returns the euclidean distance between the centers of two Shapes.
    }

    public abstract boolean inAnotherShape(Shape shape); //Checks if a Shape lies within another Shape, by using inShape() for every point and the center of a Shape.

    public abstract void moveShape(int x, int y); //Changes a Shape´s coordinates.
}