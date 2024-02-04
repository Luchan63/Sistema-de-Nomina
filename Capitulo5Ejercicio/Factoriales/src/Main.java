import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long factorial = 1L;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el n! que desea comprobal del 1 al 20");
        long numero = entrada.nextLong();
        if (numero > 0L) {
            for(int i = 1; (long)i <= numero; ++i) {
                factorial *= (long)i;
                System.out.println("el n! " + i + " es: " + factorial);
            }
        }

    }
}