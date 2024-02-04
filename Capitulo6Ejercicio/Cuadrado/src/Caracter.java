import java.util.Scanner;

public class Caracter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero entero");
        int lado = scanner.nextInt();
        System.out.print("ingrese un caracter");
        char carater = scanner.next().charAt(0);
        cuadradoDeAsteriscos(lado, carater);
    }

    public static void cuadradoDeAsteriscos(int lado, char caracter) {
        for(int i = 0; i < lado; ++i) {
            for(int j = 0; j < lado; ++j) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
