package ejercicio2;

public class Office extends CommercialProperty {

    protected static double valuePerArea = 3500000;
    protected boolean isGovernment;

    public Office(int propertyId, int area, String address, Type propertyType, boolean isGovernment) {
        super(propertyId, area, address, propertyType);
        this.isGovernment = isGovernment;
    }

    void print() {
        super.print();
        System.out.println("Is government office = " + isGovernment);
        System.out.println();
    }
}

