package ejercicio2;

public class FamilyApartment extends Apartment {
    protected static double areaValue = 2000000;
    protected int administrationFee;

    public FamilyApartment(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms, int administrationFee) {
        super(propertyId, area, address, numberOfRooms, numberOfBathrooms);
        this.administrationFee = administrationFee;
    }

    void print() {
        super.print();
        System.out.println("Administration Fee = $" + administrationFee);
        System.out.println();
    }
}
