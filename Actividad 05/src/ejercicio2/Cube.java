package ejercicio2;

public class Cube extends GeometricFigure {
    private double side;
    public Cube(double side) {
        this.side = side;
        this.setVolume(calculateVolume());
        this.setSurface(calculateSurface());
    }
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
    public double calculateSurface() {
        return 6 * Math.pow(side, 2);
    }
}
