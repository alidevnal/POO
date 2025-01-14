package parte2;
import javax.swing.*;

public class Parte2 {
    public static void main(String[] args) {
        String[] options = {"Círculo", "Rectángulo", "Cuadrado", "Triángulo Rectángulo", "Rombo", "Trapecio", "Salir"};
        int choice;
        do {
            choice = JOptionPane.showOptionDialog(null, "Selecciona una figura:", "Figuras Geométricas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0 -> { // Círculo
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio del círculo:"));
                    Circle circle = new Circle(radius);
                    displayResults(circle);
                }
                case 1 -> { // Rectángulo
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del rectángulo:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del rectángulo:"));
                    Rectangle rectangle = new Rectangle(base, height);
                    displayResults(rectangle);
                }
                case 2 -> { // Cuadrado
                    double side = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del cuadrado:"));
                    Square square = new Square(side);
                    displayResults(square);
                }
                case 3 -> { // Triángulo Rectángulo
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base del triángulo:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del triángulo:"));
                    RightTriangle triangle = new RightTriangle(base, height);
                    displayResults(triangle);
                    JOptionPane.showMessageDialog(null, "Tipo de triángulo: " + triangle.determineType());
                }
                case 4 -> { // Rombo
                    double majorDiagonal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la diagonal mayor del rombo:"));
                    double minorDiagonal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la diagonal menor del rombo:"));
                    double side = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el lado del rombo:"));
                    Rhombus rhombus = new Rhombus(majorDiagonal, minorDiagonal, side);
                    displayResults(rhombus);
                }
                case 5 -> { // Trapecio
                    double majorBase = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base mayor del trapecio:"));
                    double minorBase = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base menor del trapecio:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura del trapecio:"));
                    double side1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer lado del trapecio:"));
                    double side2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo lado del trapecio:"));
                    Trapezoid trapezoid = new Trapezoid(majorBase, minorBase, height, side1, side2);
                    displayResults(trapezoid);
                }
                case 6 -> JOptionPane.showMessageDialog(null, "Saliendo del programa.");
            }
        } while (choice != 6);
    }
    private static void displayResults(Figure figure) {
        JOptionPane.showMessageDialog(null, "Área: " + figure.calculateArea() + "\nPerímetro: " + figure.calculatePerimeter());
    }
}
