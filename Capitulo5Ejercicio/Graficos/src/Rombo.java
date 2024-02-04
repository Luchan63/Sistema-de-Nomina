import java.util.Scanner;

public class Rombo {

    public static void main(String[] args) {
        Scanner ente = new Scanner(System.in);
        System.out.println("ingrse un numero impar (1 al 19)");
        int num = ente.nextInt();

        int i;
        int k;
        for(i = 1; i <= num; ++i) {
            for(k = 1; k <= num - i; ++k) {
                System.out.print(' ');
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

        for(i = num - 1; i >= 1; --i) {
            for(k = 1; k <= num - i; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

    }
}