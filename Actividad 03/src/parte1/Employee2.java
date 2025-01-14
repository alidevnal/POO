package parte1;

public class Employee2 {
    private String name;
    private double hourlySalary;
    private int hoursWorked;

    public Employee2(String name, double hourlySalary, int hoursWorked) {
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }
    public double calculateMonthlySalary() {
        return hourlySalary * hoursWorked;
    }
    public String displayInformation() {
        double monthlySalary = calculateMonthlySalary();
        if (monthlySalary > 450000) {
            return "Nombre: " + name +
                    "\nSalario Mensual: $" + monthlySalary;
        } else {
            return "Nombre: " + name;
        }
    }
}
