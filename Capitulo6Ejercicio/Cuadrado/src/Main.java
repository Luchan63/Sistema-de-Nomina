import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero");
        int lado = scanner.nextInt();
        cuadradoDeAsteriscos(lado);
    }

    public static void cuadradoDeAsteriscos(int lado) {
        for(int i = 0; i < lado; ++i) {
            for(int j = 0; j < lado; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
