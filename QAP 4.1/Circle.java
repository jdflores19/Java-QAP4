// Java QAP 4.1
// Joseph Flores
// July 14, 2024

// Compute the area and perimeter of a circle given its radius.
// The circle is a subclass of the ellipse.

public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius);
        name = "Circle";
    }
}