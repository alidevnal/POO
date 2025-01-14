package parte2;

class Rhombus extends Figure {
    private double majorDiagonal, minorDiagonal, side;
    public Rhombus(double majorDiagonal, double minorDiagonal, double side) {
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
        this.side = side;
    }
    @Override
    double calculateArea() {
        return (majorDiagonal * minorDiagonal) / 2;
    }
    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
