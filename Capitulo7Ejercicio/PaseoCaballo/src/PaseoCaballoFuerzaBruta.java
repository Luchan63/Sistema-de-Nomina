import java.util.Random;

//ejercicio 7.23 a
public class PaseoCaballoFuerzaBruta
{
    private static final int TAMANO_TABLERO = 8;
    private static final int[][] TABLERO = new int[TAMANO_TABLERO][TAMANO_TABLERO];
    private static final int[] HORIZONTAL = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] VERTICAL = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int filaActual;
    private static int columnaActual;
    private static final Random random = new Random();

    public static void main(String[] args)
    {
        iniciarTablero();
        realizarPaseoAleatorio();
        imprimirTablero();
    }

    private static void iniciarTablero() {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                TABLERO[i][j] = 0;
            }
        }
        filaActual = random.nextInt(TAMANO_TABLERO);
        columnaActual = random.nextInt(TAMANO_TABLERO);
    }

    private static void realizarPaseoAleatorio()
    {
        int contador = 1;

        while (contador <= TAMANO_TABLERO * TAMANO_TABLERO)
        {
            TABLERO[filaActual][columnaActual] = contador++;
            int siguienteMovimiento = obtenerSiguienteMovimiento();
            if (esMovimientoValido(siguienteMovimiento))
            {
                moverCaballo(siguienteMovimiento);
            }
        }
    }

    private static int obtenerSiguienteMovimiento()
    {
        return random.nextInt(8);
    }

    private static boolean esMovimientoValido(int numeroMoviento)
    {
        int fila = filaActual + VERTICAL[numeroMoviento];
        int columna = columnaActual + HORIZONTAL[numeroMoviento];
        return (fila >= 0 && fila < TAMANO_TABLERO && columna >= 0 && columna < TAMANO_TABLERO && TABLERO[fila][columna] == 0);
    }

    private static void moverCaballo(int numeroMovimeinto)
    {
        filaActual += VERTICAL[numeroMovimeinto];
        columnaActual += HORIZONTAL[numeroMovimeinto];
    }

    private static void imprimirTablero() {
        for (int[] fila : TABLERO) {
            for (int valor : fila) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
        System.out.println();
    }
}
