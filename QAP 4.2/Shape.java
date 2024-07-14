// Java QAP 4.2
// Joseph Flores
// July 14, 2024

import java.text.DecimalFormat;

public abstract class Shape implements Scalable {
    protected String name;
    private static final DecimalFormat df = new DecimalFormat("#.###");

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return name + "\nArea: " + df.format(getArea()) + " /// Perimeter: " + df.format(getPerimeter()) + "\n";
    }
}
