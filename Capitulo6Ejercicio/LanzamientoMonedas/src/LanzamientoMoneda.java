
import java.security.SecureRandom;
import java.util.Scanner;

public class LanzamientoMomenedas {

    public static void main(String[] args) {
        int contadorCara = 0;
        int contadorCruz = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese 1 para lanzar la moneda o 0 para salir");
        int lanzamiento = scanner.nextInt();

        while(lanzamiento != 0) {
            System.out.print("Ingrese 1 para lanzar la moneda o 0 para salir");
            lanzamiento = scanner.nextInt();
            if (lanzamiento == 1) {
                Moneda resultado = tirar();
                System.out.println("Resultado: " + String.valueOf(resultado));
                if (resultado == LanzamientoMomenedas.Moneda.CARA) {
                    ++contadorCara;
                } else {
                    ++contadorCruz;
                }
            }
        }

        System.out.println("\n Resultados Finales");
        System.out.println("Cara: " + contadorCara + " veces");
        System.out.println("Cruz: " + contadorCruz + " veces");
    }

    private static Moneda tirar() {
        SecureRandom numeroAleatorio = new SecureRandom();
        return numeroAleatorio.nextBoolean() ? LanzamientoMomenedas.Moneda.CARA : LanzamientoMomenedas.Moneda.CRUZ;
    }

    private static enum Moneda {
        CARA,
        CRUZ;

        private Moneda() {
        }
    }
}

