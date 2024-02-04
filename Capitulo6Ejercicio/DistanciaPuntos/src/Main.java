import java.util.Scanner;

public class DistanciaPunto {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el cateto x1 y y1");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese el cateto y1 y y2");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distancia = distancia(x1, y1, x2, y2);
        System.out.println("La distancia entre dos puntos es: " +distancia);
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
    }
}
