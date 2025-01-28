package ejercicio2;

public class Property {
    protected int propertyId;
    protected int area;
    protected String address;
    protected double salePrice;

    Property(int propertyId, int area, String address) {
        this.propertyId = propertyId;
        this.area = area;
        this.address = address;
    }

    double calculateSalePrice(double areaValue) {
        salePrice = area * areaValue;
        return salePrice;
    }

    void printDetails() {
        System.out.println("Property ID: " + propertyId);
        System.out.println("Area: " + area);
        System.out.println("Address: " + address);
        System.out.println("Sale Price: $" + salePrice);
    }
}