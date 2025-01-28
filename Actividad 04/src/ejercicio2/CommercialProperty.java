package ejercicio2;

public class CommercialProperty extends Property {
    enum Type {INTERNAL, STREET};
    protected Type propertyType;

    public CommercialProperty(int propertyId, int area, String address, Type propertyType) {
        super(propertyId, area, address);
        this.propertyType = propertyType;
    }

    void print() {
        super.printDetails();
        System.out.println("Type of property = " + propertyType);
    }
}
