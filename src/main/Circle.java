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
        return Math.PI*Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public boolean inShape(Point point){
        return Math.sqrt(Math.pow(point.x - center.x,2) + Math.pow(point.y - center.y, 2)) <= radius;
    }

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
    
    public void moveShape(int x, int y){
        center.x += x;
        center.y += y;
    }
}