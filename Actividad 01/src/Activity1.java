import java.util.Scanner;

public class Activity1 {
    public static void exercise4(int ageJuan) {
        double ageAlberto = 2.0 * ageJuan / 3.0;
        double ageAna = 4.0 * ageJuan / 3.0;
        double ageMom = ageJuan + ageAlberto + ageAna;
        System.out.printf("Alberto: %.0f, Juan: %d, Ana: %.0f, Mom: %.0f%n", ageAlberto, ageJuan, ageAna, ageMom);
    }

    public static void exercise5() {
        double sum = 0;
        int x = 20;
        sum += x;
        int y = 40;
        x += y * y;
        sum += (double) x / y;
        System.out.printf("Sum value: %.1f%n", sum);
    }

    public static void exercise12(int hoursWorked, int hourlyRate, double retentionPercentage) {
        int grossSalary = hoursWorked * hourlyRate;
        double retention = grossSalary * retentionPercentage / 100;
        double netSalary = grossSalary - retention;
        System.out.printf("Gross Salary: $%d, Retention: $%.2f, Net Salary: $%.2f%n", grossSalary, retention, netSalary);
    }

    public static void exercise14(int number) {
        int square = number * number;
        int cube = number * number * number;
        System.out.printf("Number: %d, Square: %d, Cube: %d%n", number, square, cube);
    }

    public static void exercise17(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Radius: %.2f, Area: %.2f, Circumference: %.2f%n", radius, area, circumference);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an exercise (1: Calculate Ages, 2: Follow Instructions, 3: Calculate Salary, 4: Square and Cube, 5: Circle Area and Circumference, 0: Exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter Juan's age: ");
                    int ageJuan = scanner.nextInt();
                    exercise4(ageJuan);
                    break;
                case 2:
                    exercise5();
                    break;
                case 3:
                    System.out.print("Enter hours worked: ");
                    int hoursWorked = scanner.nextInt();
                    System.out.print("Enter hourly rate: ");
                    int hourlyRate = scanner.nextInt();
                    System.out.print("Enter retention percentage: ");
                    double retentionPercentage = scanner.nextDouble();
                    exercise12(hoursWorked, hourlyRate, retentionPercentage);
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    exercise14(number);
                    break;
                case 5:
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    exercise17(radius);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
