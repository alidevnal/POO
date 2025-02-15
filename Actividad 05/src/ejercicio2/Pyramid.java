package ejercicio2;

public class Pyramid extends GeometricFigure {
    private double base;
    private double height;
    private double apothem;
    public Pyramid(double base, double height, double apothem) {
        this.base = base;
        this.height = height;
        this.apothem = apothem;
        this.setVolume(calculateVolume());
        this.setSurface(calculateSurface());
    }
    public double calculateVolume() {
        return (Math.pow(base, 2.0) * height) / 3.0;
    }
    public double calculateSurface() {
        double baseArea = Math.pow(base, 2.0);
        double lateralArea = 2.0 * base * apothem;
        return baseArea + lateralArea;
    }
}

