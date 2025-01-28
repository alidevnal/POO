package ejercicio2;

public class IndependentHouse extends UrbanHouse {
    protected static double areaValue = 3000000;

    public IndependentHouse(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(propertyId, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
    }

    void print() {
        super.print();
        System.out.println();
    }
}

