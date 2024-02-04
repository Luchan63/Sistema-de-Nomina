import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione La Conversion");
        System.out.println("1 Fahrenheit a centigrado");
        System.out.println("2 centigrado a Fahrenheit");
        int opcion = scanner.nextInt();
        double temperaturaCentigrados;
        if (opcion == 1) {
            System.out.print("Ingrese la temperatura Fahrenheit");
            temperaturaCentigrados = scanner.nextDouble();
            System.out.println("" + temperaturaCentigrados + " grados fahrenheit son: " + calcularCentigrado(temperaturaCentigrados) + "Cenigrados");
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Centigrados");
            temperaturaCentigrados = scanner.nextDouble();
            System.out.println("" + temperaturaCentigrados + " grados centigrados son " + fahrenheit(temperaturaCentigrados) + "  Fahrenheit");
        } else {
            System.out.print("opcion no valida");
        }

    }

    public static double calcularCentigrado(double fahrenheit) {
        return 0.5555555555555556 * (fahrenheit - 32.0);
    }

    public static double fahrenheit(double centigrados) {
        return 1.8 * centigrados + 32.0;
    }
}
