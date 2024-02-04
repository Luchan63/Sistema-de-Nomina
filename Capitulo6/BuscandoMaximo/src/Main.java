
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ente = new Scanner(System.in);
        System.out.print("Escriba tres valores de punto flotante, separados por espacios:  ");
        double numero1 = ente.nextDouble();
        double numero2 = ente.nextDouble();
        double numero3 = ente.nextDouble();
        double resultado = maximo(numero1, numero2, numero3);
        System.out.println("El maximo es: " + resultado);
    }

    public static double maximo(double x, double y, double z) {
        double valorMaximo = x;
        if (y > x) {
            valorMaximo = y;
        }

        if (z > valorMaximo) {
            valorMaximo = z;
        }

        return valorMaximo;
    }
}
