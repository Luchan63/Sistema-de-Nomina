import java.util.Scanner;

public class Redondeo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal que se puede redondear");
        double x = sc.nextDouble();
        double y = Math.floor(x + 0.5);
        System.out.printf("El Numero de x es: %f%n", x);
        System.out.printf("El numero redondeado es: %f%n", y);
        System.out.println();
        double y2 = Math.floor(x * 10.0 + 0.5) / 10.0;
        System.out.printf("El numero decima y2 es: %f%n", y2);
        System.out.println();
        double y3 = Math.floor(x * 1000.0 + 0.5) / 100.0;
        System.out.printf("El numero centesima de y3 es: %f%n", y3);
        System.out.println();
        double y4 = Math.floor(x * 100000.0 + 0.5) / 1000.0;
        System.out.printf("El numero milesima de y4 es: %f%n", y4);
    }
}
