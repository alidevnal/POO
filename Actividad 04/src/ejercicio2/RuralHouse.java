package ejercicio2;

public class RuralHouse extends House {

    protected static double areaValue = 1500000;
    protected int distanceToMunicipalityCenter;
    protected int altitude;

    public RuralHouse(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors, int distanceToMunicipalityCenter, int altitude) {
        super(propertyId, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
        this.distanceToMunicipalityCenter = distanceToMunicipalityCenter;
        this.altitude = altitude;
    }

    void print() {
        super.print();
        System.out.println("Distance to the municipality center = " + distanceToMunicipalityCenter + " km.");
        System.out.println("Altitude above sea level = " + altitude + " meters.");
        System.out.println();
    }
}
