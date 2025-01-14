package parte2;

class Trapezoid extends Figure {
    private double majorBase, minorBase, height, side1, side2;
    public Trapezoid(double majorBase, double minorBase, double height, double side1, double side2) {
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    double calculateArea() {
        return ((majorBase + minorBase) * height) / 2;
    }
    @Override
    double calculatePerimeter() {
        return majorBase + minorBase + side1 + side2;
    }
}
