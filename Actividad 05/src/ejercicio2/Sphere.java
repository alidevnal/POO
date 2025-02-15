package ejercicio2;

public class Sphere extends GeometricFigure {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
        this.setVolume(calculateVolume());
        this.setSurface(calculateSurface());
    }
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3.0);
    }
    public double calculateSurface() {
        return 4.0 * Math.PI * Math.pow(this.radius, 2.0);
    }
}

