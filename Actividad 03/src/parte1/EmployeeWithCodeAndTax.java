package parte1;

public class EmployeeWithCodeAndTax extends Employee {
    private String code;
    private double hourlyRate;
    private double taxRetention;
    public EmployeeWithCodeAndTax(String code, String name, int hoursWorked, double hourlyRate, double taxRetention) {
        super(name, hoursWorked);
        this.code = code;
        this.hourlyRate = hourlyRate;
        this.taxRetention = taxRetention;
    }
    public double calculateGrossSalary() {
        return hoursWorked * hourlyRate;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() * (1 - taxRetention / 100);
    }
    @Override
    public String displayInformation() {
        return "Código: " + code +
                "\nNombres: " + name +
                "\nSalario Bruto: $" + calculateGrossSalary() +
                "\nSalario Neto: $" + calculateNetSalary();
    }
}
