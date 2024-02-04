// ejercicio 7.25 parte b
public class OchoReinasMetExahustiva
{
    public static void main(String[] args) {
        resolverOchoReinas();
    }

    public static void resolverOchoReinas() {
        int[] tablero = new int[8];
        int intentos = 0;

        do {
            if (esSolucion(tablero)) {
                mostrarTablero(tablero);
                System.out.println("Se encontró una solución después de " + intentos + " intentos.");
            }

            intentos++;
        } while (siguienteCombinacion(tablero));

        System.out.println("No hay más soluciones posibles.");
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

    public static boolean siguienteCombinacion(int[] tablero) {
        for (int i = 7; i >= 0; i--) {
            if (tablero[i] < 7) {
                tablero[i]++;
                for (int j = i + 1; j < 8; j++) {
                    tablero[j] = 0;
                }
                return true;
            }
        }
        return false;
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
