import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero 1");
        int num1 = scanner.nextInt();
        System.out.print("ingreso numero 2");
        int num2 = scanner.nextInt();
        System.out.println("El MCD de " + num1 + " / " + num2 + " es: " + calcularMcd(num1, num2));
    }

    public static int calcularMcd(int a, int b) {
        while(b != 0) {
            int b2 = b;
            b = a % b;
            a = b2;
        }

        return Math.abs(a);
    }
}
