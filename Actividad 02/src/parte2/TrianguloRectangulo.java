package parte2;

public class TrianguloRectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && base == hipotenusa) {
            return "Equilátero";
        } else if (base != altura && base != hipotenusa && altura != hipotenusa) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
}
