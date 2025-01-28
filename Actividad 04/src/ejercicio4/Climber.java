package ejercicio4;

public class Climber extends Cyclist {
    private double averageAcceleration;
    private double rampGrade;

    public Climber(int id, String name, double averageAcceleration, double rampGrade) {
        super(id, name);
        this.averageAcceleration = averageAcceleration;
        this.rampGrade = rampGrade;
    }

    protected double getAverageAcceleration() {
        return averageAcceleration;
    }

    protected void setAverageAcceleration(double averageAcceleration) {
        this.averageAcceleration = averageAcceleration;
    }

    protected double getRampGrade() {
        return rampGrade;
    }

    protected void setRampGrade(double rampGrade) {
        this.rampGrade = rampGrade;
    }

    protected void print() {
        super.print();
        System.out.println("Average Acceleration = " + averageAcceleration);
        System.out.println("Ramp Grade = " + rampGrade);
    }

    protected String printType() {
        return "Is a climber";
    }
}
