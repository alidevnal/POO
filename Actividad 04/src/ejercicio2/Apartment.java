package ejercicio2;

public class Apartment extends ResidentialProperty {

    public Apartment(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(propertyId, area, address, numberOfRooms, numberOfBathrooms);
    }

    void print() {
        super.printDetails();
    }
}
