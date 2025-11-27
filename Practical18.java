// Create two classes, Shape (superclass) with a method draw(), and Circle (subclass) that overrides draw().
// Create objects of both and call the draw() method.

// Aim:
// To demonstrate method overriding in JAVA using superclass and subclass concept

// Objective:
// - To create a superclass named Shape with a method draw()
// - To create a subclass named Circle that overrides the draw() method to display "Drawing Circle"
// - To create objects of both classes and call their draw() methods, demonstrating runtime polymorphism

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Practical18 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        shape.draw();      // Output: Drawing shape
        circle.draw();     // Output: Drawing Circle

        Shape shape2 = new Circle();
        shape2.draw();     // Output: Drawing Circle (polymorphism)
    }
}
