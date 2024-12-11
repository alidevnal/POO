package parte2;

public class Parte2 {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = {
                new Circulo(5),
                new Rectangulo(4, 7),
                new Cuadrado(4),
                new TrianguloRectangulo(3, 4),
                new Rombo(10, 8, 6),
                new Trapecio(8, 6, 4, 5, 5)
        };
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            if (figura instanceof TrianguloRectangulo) {
                TrianguloRectangulo triangulo = (TrianguloRectangulo) figura;
                System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
                System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
            }
            System.out.println();
        }
    }
}


