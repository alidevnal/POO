package parte1;

import java.util.Scanner;

public class Parte1 {
    public static void ej18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();
        System.out.print("Ingrese los nombres del empleado: ");
        String nombresEmpleado = scanner.nextLine();
        System.out.print("Ingrese el número de horas trabajadas al mes: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el valor por hora trabajada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de retención en la fuente (en %): ");
        double porcentajeRetencion = scanner.nextDouble();
        double salarioBruto = horasTrabajadas * valorHora;
        double retencionFuente = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencionFuente;
        System.out.println("\n--- Información del empleado ---");
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombres del empleado: " + nombresEmpleado);
        System.out.println("Salario bruto: $" + String.format("%.2f", salarioBruto));
        System.out.println("Salario neto: $" + String.format("%.2f", salarioNeto));
        scanner.close();
    }

    public static void ej19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();
        double perimetro = 3 * lado;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;
        System.out.println("\n--- Propiedades del triángulo equilátero ---");
        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("Altura: " + String.format("%.2f", altura));
        System.out.println("Área: " + String.format("%.2f", area));
        scanner.close();
    }

    public static void ej21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el valor del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el valor del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el valor del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();
        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("\n--- Propiedades del triángulo ---");
        System.out.println("Perímetro: " + String.format("%.2f", perimetro));
        System.out.println("Semiperímetro: " + String.format("%.2f", semiperimetro));
        System.out.println("Área: " + String.format("%.2f", area));
        scanner.close();
    }

    public static void ejRe7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A == B) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
        scanner.close();
    }

    public static void ejRe10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de inscripción: ");
        String numeroInscripcion = scanner.nextLine();
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();
        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = scanner.nextInt();
        double pagoMatricula = 50000;
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numeroInscripcion +
                " Y NOMBRE " + nombres + " DEBE PAGAR: $" + pagoMatricula);
        scanner.close();
    }

    public static void ejRe11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int N1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int N2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int N3 = scanner.nextInt();
        int mayor;
        if (N1 > N2 && N1 > N3) {
            mayor = N1;
        } else if (N2 > N3) {
            mayor = N2;
        } else {
            mayor = N3;
        }
        System.out.println("El valor mayor entre " + N1 + ", " + N2 + " y " + N3 + " es: " + mayor);
        scanner.close();
    }

    public static void ejRe12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el valor por hora normal de trabajo: ");
        int valorHoraNormal = scanner.nextInt();
        int horasExtras = 0;
        int horasExtrasExcedentes = 0;
        int salario;
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            if (horasExtras > 8) {
                horasExtrasExcedentes = horasExtras - 8;
                salario = (40 * valorHoraNormal) + (16 * valorHoraNormal) + (horasExtrasExcedentes * 3 * valorHoraNormal);
            } else {
                salario = (40 * valorHoraNormal) + (horasExtras * 2 * valorHoraNormal);
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }
        System.out.println("El trabajador " + nombre + " devengó: $" + salario);
        scanner.close();
    }

    public static void ejRe13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el color de la bolita: ");
        String colorBolita = scanner.nextLine().toUpperCase();
        int porcentajeDescuento;
        switch (colorBolita) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            default:
                porcentajeDescuento = 100;
                break;
        }
        double valorPagar = valorCompra - (porcentajeDescuento * valorCompra / 100);
        System.out.println("El cliente debe pagar: $" + valorPagar);
        scanner.close();
    }

    public static void ejRe14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las ventas del departamento 1: ");
        double ventasDepto1 = scanner.nextDouble();
        System.out.print("Ingrese las ventas del departamento 2: ");
        double ventasDepto2 = scanner.nextDouble();
        System.out.print("Ingrese las ventas del departamento 3: ");
        double ventasDepto3 = scanner.nextDouble();
        System.out.print("Ingrese el salario de los vendedores: ");
        double salario = scanner.nextDouble();
        double totalVentas = ventasDepto1 + ventasDepto2 + ventasDepto3;
        double porcentajeVentas = totalVentas * 0.33;
        double salarioDepto1 = salario;
        double salarioDepto2 = salario;
        double salarioDepto3 = salario;
        if (ventasDepto1 > porcentajeVentas) {
            salarioDepto1 = salario + (salario * 0.20);
        }
        if (ventasDepto2 > porcentajeVentas) {
            salarioDepto2 = salario + (salario * 0.20);
        }
        if (ventasDepto3 > porcentajeVentas) {
            salarioDepto3 = salario + (salario * 0.20);
        }
        System.out.println("Salario vendedores Departamento 1: " + salarioDepto1);
        System.out.println("Salario vendedores Departamento 2: " + salarioDepto2);
        System.out.println("Salario vendedores Departamento 3: " + salarioDepto3);
        scanner.close();
    }

    public static void ejRe15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        int PESOA = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        int PESOB = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        int PESOC = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera D: ");
        int PESOD = scanner.nextInt();
        if (PESOA == PESOB && PESOA == PESOC) {
            if (PESOD > PESOA) {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
            } else {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
            }
        } else if (PESOA == PESOB && PESOA == PESOD) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (PESOC > PESOA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (PESOA == PESOC && PESOA == PESOD) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (PESOB > PESOD) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (PESOA > PESOB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }
        scanner.close();
    }

    public static void ej22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = scanner.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();
        double salarioMensual = salarioPorHora * horasTrabajadas;
        if (salarioMensual > 450000) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario mensual: $" + salarioMensual);
        } else {
            System.out.println("Nombre: " + nombre);
        }
    }

    public static void ej23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double c = scanner.nextDouble();
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución única es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }

    public static void ej24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso.");
        } else {
            System.out.println("Hay esferas con pesos iguales.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("\n--- Menú de opciones ---");
        System.out.println("1. Ejercicio 18");
        System.out.println("2. Ejercicio 19");
        System.out.println("3. Ejercicio 21");
        System.out.println("4. Ejercicio Re7");
        System.out.println("5. Ejercicio Re10");
        System.out.println("6. Ejercicio Re11");
        System.out.println("7. Ejercicio Re12");
        System.out.println("8. Ejercicio Re13");
        System.out.println("9. Ejercicio Re14");
        System.out.println("10. Ejercicio Re15");
        System.out.println("11. Ejercicio 22");
        System.out.println("12. Ejercicio 23");
        System.out.println("13. Ejercicio 24");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                ej18();
                break;
            case 2:
                ej19();
                break;
            case 3:
                ej21();
                break;
            case 4:
                ejRe7();
                break;
            case 5:
                ejRe10();
                break;
            case 6:
                ejRe11();
                break;
            case 7:
                ejRe12();
                break;
            case 8:
                ejRe13();
                break;
            case 9:
                ejRe14();
                break;
            case 10:
                ejRe15();
                break;
            case 11:
                ej22();
                break;
            case 12:
                ej23();
                break;
            case 13:
                ej24();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
        scanner.close();
    }
}

