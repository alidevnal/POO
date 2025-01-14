package parte1;

public class Employee {
    protected String name;
    protected int hoursWorked;
    public Employee(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }
    public String getName() {
        return name;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public String displayInformation() {
        return "Nombre: " + name;
    }
}
