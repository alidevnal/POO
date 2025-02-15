package ejercicio2;

public class RectangularPrism extends GeometricFigure {
    private double length;
    private double width;
    private double height;
    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.setVolume(calculateVolume());
        this.setSurface(calculateSurface());
    }
    public double calculateVolume() {
        return length * width * height;
    }
    public double calculateSurface() {
        return 2 * (length * width + length * height + width * height);
    }
}
