import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero entero");
        int num1 = scanner.nextInt();
        System.out.printf("El nuemero %d es par %b", num1, esPar(num1));
    }

    public static boolean esPar(int num1) {
        return num1 % 2 == 0;
    }
}
