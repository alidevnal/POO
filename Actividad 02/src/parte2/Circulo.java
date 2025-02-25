package parte2;

public class Circulo extends FiguraGeometrica {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}