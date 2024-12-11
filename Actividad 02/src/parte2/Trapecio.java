package parte2;

public class Trapecio extends FiguraGeometrica {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
