import java.util.Random;

//ejercicio 7.23 parte b
public class PaseoCaballoFuerzaBruta2
{
    private static final int TAMANO_TABLERO = 8;
    private static final int NUM_INTENTOS = 1000;

    private static int[][] tablero = new int[TAMANO_TABLERO][TAMANO_TABLERO];
    private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        int mejorResultado = 0;

        for (int intento = 1; intento <= NUM_INTENTOS; intento++) {
            inicializarTablero();
            int resultado = realizarPaseoAleatorio();
            if (resultado > mejorResultado) {
                mejorResultado = resultado;
            }
            System.out.printf("Intento %d: Longitud del paseo: %d%n", intento, resultado);
        }

        System.out.printf("Mejor resultado: %d%n", mejorResultado);
    }

    private static void inicializarTablero() {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    private static int realizarPaseoAleatorio() {
        Random random = new Random();
        int filaActual = random.nextInt(TAMANO_TABLERO);
        int columnaActual = random.nextInt(TAMANO_TABLERO);
        int contador = 1;

        while (contador <= TAMANO_TABLERO * TAMANO_TABLERO) {
            tablero[filaActual][columnaActual] = contador++;
            int siguienteMovimiento = random.nextInt(8);
            int nuevaFila = filaActual + vertical[siguienteMovimiento];
            int nuevaColumna = columnaActual + horizontal[siguienteMovimiento];

            if (esMovimientoValido(nuevaFila, nuevaColumna)) {
                filaActual = nuevaFila;
                columnaActual = nuevaColumna;
            }
        }

        return contador - 1;
    }

    private static boolean esMovimientoValido(int nuevaFila, int nuevaColumna) {
        return (nuevaFila >= 0 && nuevaFila < TAMANO_TABLERO
                && nuevaColumna >= 0 && nuevaColumna < TAMANO_TABLERO
                && tablero[nuevaFila][nuevaColumna] == 0);
    }
}
