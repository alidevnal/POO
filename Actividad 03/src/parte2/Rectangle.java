package parte2;

class Rectangle extends Figure {
    private double base, height;
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return base * height;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (base + height);
    }
}
