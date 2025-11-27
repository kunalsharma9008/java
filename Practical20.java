import shapes.Circle;
import shapes.Rectangle;

public class Practical20 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(5, 10);

        c.displayShape();
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());

        r.displayShape();
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}
