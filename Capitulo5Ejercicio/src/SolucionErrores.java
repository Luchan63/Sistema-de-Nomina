import java.util.Scanner;

public class SolucionErrores {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("----------------------------------");

        for(int k = 1; k != 10; ++k) {
            System.out.println((double)k / 10.0);
        }

        System.out.println();
        System.out.println("------------------------------------");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingres un numero 1 o 2");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            default:
                System.out.println("El numero no es ni 1 ni 2");
        }

        System.out.println();
        System.out.println("-----------------------------------------");
        int k = 1;

        while(k <= 10) {
            System.out.println(k++);
        }

        System.out.println();
        System.out.println("-----------------------------------------");

        for(int m = 100; m >= 1; --m) {
            System.out.println(m);
        }

        System.out.println();
        System.out.println("--------------------------------------------");
        int valor = 7;
        switch (valor % 2) {
            case 0:
                System.out.println("El numero es par");
                break;
            case 1:
                System.out.println("el numero es impar");
                break;
            default:
                System.out.println("no es ni par ni impar");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        int contador;
        for(contador = 19; contador >= 1; contador -= 2) {
            System.out.println(contador);
        }

        System.out.println();
        System.out.println("-----------------------------------------------");
        contador = 2;

        do {
            System.out.println(contador);
            contador += 2;
        } while(contador <= 100);

        System.out.println();
        System.out.println("-----------------------------------------------");

        for(int d = 1; d <= 10; ++d) {
            for(int j = 1; j <= 5; ++j) {
                System.out.print('@');
            }

            System.out.println();
        }

    }
}
