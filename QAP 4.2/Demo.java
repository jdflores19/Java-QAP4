// Java QAP 4.2
// Joseph Flores
// July 14, 2024

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(7, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        // Print the shapes before scaling
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("\nTO DEMONSTRATE SCALING ALL SHAPES (by factor 3):\n");
        // Scale all shapes by a factor of 3
        scaleShapes(shapes, 3);

        // Print the shapes after scaling
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // This method will scale all shapes in the array by the given factor
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
