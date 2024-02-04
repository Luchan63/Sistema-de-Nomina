import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        int numero = scanner.nextInt();
        System.out.println(esPrimo(numero));
        System.out.println();

        int numero2;
        for(numero2 = 1; numero2 <= 10000; ++numero2) {
            if (esPrimo(numero2)) {
                System.out.println("Es primo " + numero2);
            }
        }

        System.out.println();

        for(numero2 = 1; numero2 <= 10000; ++numero2) {
            if (esPrimo2(numero2)) {
                System.out.println("Es primo " + numero2);
            }
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        } else {
            for(int i = 2; i <= numero / 2; ++i) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean esPrimo2(int numero) {
        if (numero <= 1) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)numero); ++i) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
