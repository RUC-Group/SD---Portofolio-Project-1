import java.awt.Point;

// subclass of shapes: circle, contains a radius and a center point
public class Circle extends Shape{
    private Point center;
    private int radius;

    //Constructor
    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    // Getter for center
    public Point getCenter(){
        return center;
    }

    // Getter for area of the circle
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    // Getter for circumference of circle
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    // Method that returns if point is in shape
    public boolean inShape(Point point){
        return Math.sqrt(Math.pow(point.x - center.x,2) + Math.pow(point.y - center.y, 2)) <= radius;
    }

    // Method that returns if a shape is inside the circle
    public boolean inAnotherShape(Shape shape){
        if (!shape.inShape(center)) return false;
        for(double i = 0; i<=8;i++){
            Point point = new Point(center.x + (int)Math.cos((Math.PI/4)*i)*radius,center.y + (int)Math.sin((Math.PI/4)*i)*radius);
            if(!shape.inShape(point)){
                return false;
            }
        }
        return true;
    }
    
    // Method to move the circle
    public void moveShape(int x, int y){
        center.x += x;
        center.y += y;
    }
}