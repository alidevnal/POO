package parte2;

public class Rombo extends FiguraGeometrica {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;
    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
