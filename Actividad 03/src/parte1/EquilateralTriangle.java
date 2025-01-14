package parte1;

public class EquilateralTriangle {
    private double side;
    public EquilateralTriangle(double side) {
        this.side = side;
    }
    public double calculatePerimeter() {
        return 3 * side;
    }
    public double calculateHeight() {
        return Math.sqrt(3) / 2 * side;
    }
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }
    public String displayInformation() {
        return "Lado: " + side +
                "\nPerímetro: " + calculatePerimeter() +
                "\nAltura: " + calculateHeight() +
                "\nÁrea: " + calculateArea();
    }
}
