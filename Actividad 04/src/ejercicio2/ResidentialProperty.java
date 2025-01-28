package ejercicio2;

public class ResidentialProperty extends Property {
    protected int numberOfRooms;
    protected int numberOfBathrooms;

    public ResidentialProperty(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(propertyId, area, address);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Number of rooms: " + numberOfRooms);
        System.out.println("Number of bathrooms: " + numberOfBathrooms);
    }
}

