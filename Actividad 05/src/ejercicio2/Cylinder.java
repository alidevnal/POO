package ejercicio2;

public class Cylinder extends GeometricFigure {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.setVolume(calculateVolume());
        this.setSurface(calculateSurface());
    }
    public double calculateVolume() {
        return Math.PI * height * Math.pow(radius, 2.0);
    }
    public double calculateSurface() {
        double lateralArea = 2.0 * Math.PI * radius * height;
        double baseArea = 2.0 * Math.PI * Math.pow(radius, 2.0);
        return lateralArea + baseArea;
    }
}

