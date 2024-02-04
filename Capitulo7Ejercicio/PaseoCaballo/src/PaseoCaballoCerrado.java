import java.util.Arrays;
public class PaseoCaballoCerrado
{
    private static int[][] tablero = new int[8][8];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        // Inicializar el tablero
        for (int i = 0; i < 8; i++) {
            Arrays.fill(tablero[i], 0);
        }

        // Posición inicial del caballo
        int filaInicial = 0;
        int columnaInicial = 0;

        // Realizar el paseo
        boolean paseoCompleto = realizarPaseo(tablero, filaInicial, columnaInicial, 1);

        // Verificar si el paseo fue completo y cerrado
        if (paseoCompleto && esCerrado(filaInicial, columnaInicial)) {
            System.out.println("¡Paseo completo y cerrado!");
        } else {
            System.out.println("El paseo no fue completo y/o cerrado.");
        }
    }

    private static boolean realizarPaseo(int[][] tablero, int filaActual, int columnaActual, int contador) {
        // Marcar la posición actual
        tablero[filaActual][columnaActual] = contador;

        // Verificar si el paseo es completo
        if (contador == 64) {
            return true;
        }

        // Intentar los movimientos en L
        for (int i = 0; i < 8; i++) {
            int nuevaFila = filaActual + vertical[i];
            int nuevaColumna = columnaActual + horizontal[i];

            // Verificar si el movimiento es válido y la posición no ha sido visitada
            if (esMovimientoValido(nuevaFila, nuevaColumna) && tablero[nuevaFila][nuevaColumna] == 0) {
                if (realizarPaseo(tablero, nuevaFila, nuevaColumna, contador + 1)) {
                    return true;
                }
            }
        }

        // Desmarcar la posición actual si el paseo no es exitoso
        tablero[filaActual][columnaActual] = 0;

        return false;
    }

    private static boolean esCerrado(int filaInicial, int columnaInicial) {
        int filaFinal = filaInicial + vertical[0];
        int columnaFinal = columnaInicial + horizontal[0];

        return esMovimientoValido(filaInicial, columnaInicial);
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
    }
}
