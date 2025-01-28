package ejercicio4;

public class TimeTrialist extends Cyclist {
    private double maximumSpeed;

    public TimeTrialist(int id, String name, double maximumSpeed) {
        super(id, name);
        this.maximumSpeed = maximumSpeed;
    }

    protected double getMaximumSpeed() {
        return maximumSpeed;
    }

    protected void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    protected void print() {
        super.print();
        System.out.println("Maximum Speed = " + maximumSpeed);
    }

    protected String printType() {
        return "Is a time trialist";
    }
}
