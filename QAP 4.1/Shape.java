// Java QAP 4.1
// Joseph Flores
// July 14, 2024

// The superclass Shape is an abstract class that has two abstract methods getPerimeter and getArea.

import java.text.DecimalFormat;

public abstract class Shape {
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

