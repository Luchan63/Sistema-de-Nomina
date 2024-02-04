// ejercicio 7.25 a
import java.util.Random;

public class OchoReinasNum_Aleatorio {

    public static void main(String[] args) {
        resolverOchoReinas();
    }

    public static void resolverOchoReinas() {
        int[] tablero = new int[8];
        Random random = new Random();
        int intentos = 0;

        while (!esSolucion(tablero)) {
            for (int i = 0; i < 8; i++) {
                tablero[i] = random.nextInt(8);
            }
            intentos++;
        }

        mostrarTablero(tablero);
        System.out.println("Se encontró una solución después de " + intentos + " intentos.");
    }

    public static boolean esSolucion(int[] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (tablero[i] == tablero[j] || Math.abs(tablero[i] - tablero[j]) == Math.abs(i - j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrarTablero(int[] tablero) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i] == j) {
                    System.out.print("|*");
                } else {
                    System.out.print("|_");
                }
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
