package ejercicio2;

public class StudioApartment extends Apartment {
    protected static double areaValue = 1500000;

    public StudioApartment(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(propertyId, area, address, 1, 1);
    }

    void print() {
        super.print();
        System.out.println();
    }
}
