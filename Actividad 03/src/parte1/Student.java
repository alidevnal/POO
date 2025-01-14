package parte1;

public class Student {
    private String registrationNumber;
    private String name;
    private double wealth;
    private int socialStratum;

    public Student(String registrationNumber, String name, double wealth, int socialStratum) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.wealth = wealth;
        this.socialStratum = socialStratum;
    }
    public double calculateTuition() {
        double baseFee = 50000;
        if (wealth > 2000000 && socialStratum > 3) {
            baseFee += 0.03 * wealth;
        }
        return baseFee;
    }
    public String displayInformation() {
        return "EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + registrationNumber +
                "\nY NOMBRE " + name +
                "\nDEBE PAGAR: $" + calculateTuition();
    }
}
