package ejercicio2;

public class GatedCommunityHouse extends UrbanHouse {
    protected static double areaValue = 2500000;
    protected int adminFee;
    protected boolean hasPool;
    protected boolean hasSportsFields;

    public GatedCommunityHouse(int propertyId, int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors, int adminFee, boolean hasPool, boolean hasSportsFields) {
        super(propertyId, area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
        this.adminFee = adminFee;
        this.hasPool = hasPool;
        this.hasSportsFields = hasSportsFields;
    }

    void print() {
        super.print();
        System.out.println("Admin Fee = $" + adminFee);
        System.out.println("Has Pool? = " + hasPool);
        System.out.println("Has Sports Fields? = " + hasSportsFields);
        System.out.println();
    }
}
