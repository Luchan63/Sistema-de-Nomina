
import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();

        int contador;
        for(contador = 1; contador <= 20; ++contador) {
            int cara = 1 + numerosAleatorios.nextInt(6);
            System.out.printf("%d ", cara);
            if (contador % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        contador = 2 + 3 * numerosAleatorios.nextInt(5);
        System.out.printf("el Numero es: %d%n", contador);
    }
}
