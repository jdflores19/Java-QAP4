// Java QAP 4.1
// Joseph Flores
// July 14, 2024

// Compute the area and perimeter of an equilateral triangle given its side length.
// The equilateral triangle is a subclass of the triangle.

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "EquilateralTriangle";
    }
}
