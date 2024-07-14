// Java QAP 4.2
// Joseph Flores
// July 14, 2024

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - ((a - b) * (a - b)) / 2);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    // This will scale both a and b
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
