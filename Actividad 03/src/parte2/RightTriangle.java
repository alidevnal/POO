package parte2;

class RightTriangle extends Figure {
    private double base, height;
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return (base * height) / 2;
    }
    @Override
    double calculatePerimeter() {
        return base + height + calculateHypotenuse();
    }
    double calculateHypotenuse() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    String determineType() {
        double hypotenuse = calculateHypotenuse();
        if (base == height && base == hypotenuse) {
            return "Equilatero";
        } else if (base != height && base != hypotenuse && height != hypotenuse) {
            return "Escaleno";
        } else {
            return "Isosceles";
        }
    }
}
