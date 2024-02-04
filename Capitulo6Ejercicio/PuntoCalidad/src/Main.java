import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio");
        double promedio = (double)scanner.nextInt();
        System.out.println("La nota es: " + puntoCalidad(promedio));
    }

    public static double puntoCalidad(double promedio) {
        if (promedio >= 90.0 && promedio <= 100.0) {
            return 4.0;
        } else if (promedio >= 80.0 && promedio <= 89.0) {
            return 3.0;
        } else if (promedio >= 70.0 && promedio <= 79.0) {
            return 2.0;
        } else {
            return promedio >= 60.0 && promedio <= 69.0 ? 1.0 : 0.0;
        }
    }
}
