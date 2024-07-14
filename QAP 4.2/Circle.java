// Java QAP 4.2
// Joseph Flores
// July 14, 2024

public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius);
        name = "Circle";
    }

    @Override
    public void scale(double factor) {
        // This will scale both a and b equally as they are the same in Circle
        super.scale(factor); 
    }
}
