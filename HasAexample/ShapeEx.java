package HasAexample;

public class ShapeEx {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.draw();
        
        Circle c2 = new Circle(new Point(150, 150), 500);
        c2.draw();
        
        Triangle t1 = new Triangle();
        t1.draw();
    }
}
