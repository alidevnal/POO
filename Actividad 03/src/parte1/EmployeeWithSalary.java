package parte1;

public class EmployeeWithSalary extends Employee {
    private double hourlySalary;
    public EmployeeWithSalary(String name, int hoursWorked, double hourlySalary) {
        super(name, hoursWorked);
        this.hourlySalary = hourlySalary;
    }
    public double calculateMonthlySalary() {
        return hourlySalary * hoursWorked;
    }
    @Override
    public String displayInformation() {
        double monthlySalary = calculateMonthlySalary();
        return super.displayInformation() + "\nSalario Mensual: $" + monthlySalary;
    }
}
