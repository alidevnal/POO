package parte1;

public class Employee1 {
    private String code;
    private String name;
    private int hoursWorked;
    private double hourlyRate;
    private double taxRetention;
    public Employee1(String code, String name, int hoursWorked, double hourlyRate, double taxRetention) {
        this.code = code;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.taxRetention = taxRetention;
    }
    public double calculateGrossSalary() {
        return hoursWorked * hourlyRate;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() * (1 - taxRetention / 100);
    }
    public String displayInformation() {
        return "Código: " + code +
                "\nNombres: " + name +
                "\nSalario Bruto: $" + calculateGrossSalary() +
                "\nSalario Neto: $" + calculateNetSalary();
    }
}
