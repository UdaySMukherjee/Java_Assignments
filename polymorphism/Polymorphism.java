class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading)
        drawShape(new Shape());
        drawShape(new Circle());
        drawShape(new Square());

        // Runtime polymorphism (method overriding)
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
    }

    // Compile-time polymorphism (method overloading)
    private static void drawShape(Shape shape) {
        shape.draw();
    }
}
