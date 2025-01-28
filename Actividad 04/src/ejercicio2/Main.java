package ejercicio2;

public class Main {
    public static void main(String[] args) {
        FamilyApartment apt1 = new FamilyApartment(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Apartment data:");
        apt1.calculateSalePrice(FamilyApartment.areaValue);
        apt1.print();

        System.out.println("Studio data:");
        StudioApartment aptStudio1 = new StudioApartment(12354, 50, "Avenida Caracas 30-15", 1, 1);
        aptStudio1.calculateSalePrice(StudioApartment.areaValue);
        aptStudio1.print();
    }
}
