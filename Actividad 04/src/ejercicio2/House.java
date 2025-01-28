package ejercicio2;

public class House extends ResidentialProperty {
    protected int numberOfFloors;

    public House(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(propertyId, area, address, numberOfRooms, numberOfBathrooms);
        this.numberOfFloors = numberOfFloors;
    }

    void print() {
        super.printDetails();
        System.out.println("Number of floors = " + numberOfFloors);
    }
}
