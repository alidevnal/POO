package ejercicio4;

public class Sprinter extends Cyclist {
    private double averagePower;
    private double averageSpeed;

    public Sprinter(int id, String name, double averagePower, double averageSpeed) {
        super(id, name);
        this.averagePower = averagePower;
        this.averageSpeed = averageSpeed;
    }

    protected double getAveragePower() {
        return averagePower;
    }

    protected void setAveragePower(double averagePower) {
        this.averagePower = averagePower;
    }

    protected double getAverageSpeed() {
        return averageSpeed;
    }

    protected void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    protected void print() {
        super.print();
        System.out.println("Average Power = " + averagePower);
        System.out.println("Average Speed = " + averageSpeed);
    }

    protected String printType() {
        return "Is a sprinter";
    }
}
