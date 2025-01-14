package parte1;
import javax.swing.*;

public class Parte1 {
    public static void ej18() {
        String code = JOptionPane.showInputDialog("Ingrese el código del empleado:");
        String name = JOptionPane.showInputDialog("Ingrese los nombres del empleado:");
        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas al mes:"));
        double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor por hora trabajada:"));
        double taxRetention = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de retención en la fuente:"));
        EmployeeWithCodeAndTax employee = new EmployeeWithCodeAndTax(code, name, hoursWorked, hourlyRate, taxRetention);
        JOptionPane.showMessageDialog(null, employee.displayInformation());
    }

    public static void ej19() {
        double side = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado del triángulo equilátero:"));
        EquilateralTriangle triangle = new EquilateralTriangle(side);
        JOptionPane.showMessageDialog(null, triangle.displayInformation());
    }

    public static void ejRe7() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B:"));
        if (a > b) {
            JOptionPane.showMessageDialog(null, "A es mayor que B");
        } else if (a == b) {
            JOptionPane.showMessageDialog(null, "A es igual a B");
        } else {
            JOptionPane.showMessageDialog(null, "A es menor que B");
        }
    }

    public static void ejRe10() {
        String registrationNumber = JOptionPane.showInputDialog("Ingrese el número de inscripción:");
        String name = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        double wealth = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el patrimonio del estudiante:"));
        int socialStratum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato social del estudiante:"));
        Student student = new Student(registrationNumber, name, wealth, socialStratum);
        JOptionPane.showMessageDialog(null, student.displayInformation());
    }

    public static void ej22() {
        String name = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        double hourlySalary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico por hora:"));
        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas en el mes:"));
        EmployeeWithSalary employee = new EmployeeWithSalary(name, hoursWorked, hourlySalary);
        JOptionPane.showMessageDialog(null, employee.displayInformation());
    }

    public static void ej23() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A (coeficiente cuadrático):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B (coeficiente lineal):"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de C (término independiente):"));
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "No es una ecuación cuadrática, ya que A es igual a 0.");
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Las soluciones son reales y diferentes:\n" +
                    "Raíz 1: " + root1 + "\nRaíz 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "La solución es real y única:\n" +
                    "Raíz: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            JOptionPane.showMessageDialog(null, "Las soluciones son complejas y conjugadas:\n" +
                    "Raíz 1: " + realPart + " + " + imaginaryPart + "i\n" +
                    "Raíz 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        String[] options = {
                "Ejercicio 18", "Ejercicio 19", "Ejercicio Re7",
                "Ejercicio Re10", "Ejercicio 22", "Ejercicio 23", "Salir"
        };
        int option;
        do {
            option = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú de Ejercicios",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (option) {
                case 0 -> ej18();
                case 1 -> ej19();
                case 2 -> ejRe7();
                case 3 -> ejRe10();
                case 4 -> ej22();
                case 5 -> ej23();
                case 6 -> JOptionPane.showMessageDialog(null, "Saliendo...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (option != 6);
    }
}