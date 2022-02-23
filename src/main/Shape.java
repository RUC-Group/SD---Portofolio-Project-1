import java.awt.Point;
import java.util.ArrayList;

public abstract class Shape{

    public abstract Point getCenter();

    public abstract double getArea();

    public abstract double getCircumference();

    public abstract boolean inShape(Point point);

    public double getEuclideanDistance(Shape shape){
        Point center1 = getCenter();
        Point center2 = shape.getCenter();
        return Math.sqrt(Math.abs(center1.x-center2.x)^2+Math.abs(center1.y-center2.y)^2);
    }

    public abstract boolean inAnotherShape(Shape shape);

    public int getOverlapCount(ArrayList<Shape> shapes){
        int overlapCount=0;
        for( int i=0; i<shapes.size();i++){
            if(inAnotherShape(shapes.get(i))){
                overlapCount++;
            }
        }
        return overlapCount;
    }

    public abstract void moveShape(int x, int y);   
}