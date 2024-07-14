// Java QAP 4.1
// Joseph Flores
// July 14, 2024

// Test the Shape hierarchy by creating an array of Shape objects and printing their areas and perimeters.

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(7, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
