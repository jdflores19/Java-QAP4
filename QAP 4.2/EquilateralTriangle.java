// Java QAP 4.2
// Joseph Flores
// July 14, 2024

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "EquilateralTriangle";
    }

    @Override
    public void scale(double factor) {
        // This will scale all sides equally as they are the same in EquilateralTriangle
        super.scale(factor); 
    }
}
