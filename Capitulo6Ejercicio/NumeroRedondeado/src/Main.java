import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        double numero = entre.nextDouble();
        System.out.printf("El numero original es: %.2f%n", numero);
        System.out.printf("El numero redondeado a Interger es: %d%n", redondearAInteger(numero));
        System.out.println();
        System.out.printf("El numero original es: %.2f%n", numero);
        System.out.printf("El numero redondeado a Decimas es: %.1f%n", redondearADecimas(numero));
        System.out.println();
        System.out.printf("El numero original es: %.2f%n", numero);
        System.out.printf("El numero redondeado Centesima es: %.2f%n", redondearACentesima(numero));
        System.out.println();
        System.out.printf("El numero original es: %.2f%n", numero);
        System.out.printf("El numero redondeado Milesima es: %.3f%n", redondearAMilesimas(numero));
    }

    public static int redondearAInteger(double numero) {
        return (int)Math.floor(numero + 0.5);
    }

    public static double redondearADecimas(double numero) {
        return Math.floor(numero * 10.0 + 0.5) / 10.0;
    }

    public static double redondearACentesima(double numero) {
        return Math.floor(numero * 100.0 + 0.5) / 100.0;
    }

    public static double redondearAMilesimas(double numero) {
        return Math.floor(numero * 1000.0 + 0.5) / 1000.0;
    }
}
