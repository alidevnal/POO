package ejercicio2;

public class CommercialStore extends CommercialProperty {

    protected static double valuePerArea = 3000000;
    protected String shoppingMall;

    public CommercialStore(int propertyId, int area, String address, Type propertyType, String shoppingMall) {
        super(propertyId, area, address, propertyType);
        this.shoppingMall = shoppingMall;
    }

    void print() {
        super.print();
        System.out.println("Shopping mall = " + shoppingMall);
        System.out.println();
    }
}
