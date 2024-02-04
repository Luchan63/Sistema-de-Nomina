// jercicio 7.23 parte c

public class PaseoDelCaballo3 {
    private static final int TAMANO_TABLERO = 8;
    private static final int[][] tablero = new int[TAMANO_TABLERO][TAMANO_TABLERO];
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    private static int filaActual;
    private static int columnaActual;

    public static void main(String[] args) {
        inicializarTablero();
        realizarPaseoHeuristico();
        imprimirTablero();
    }

    private static void inicializarTablero() {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tablero[i][j] = 0;
            }
        }
        filaActual = 0;
        columnaActual = 0;
    }

    private static void realizarPaseoHeuristico() {
        int contador = 1;
        while (contador <= TAMANO_TABLERO * TAMANO_TABLERO) {
            tablero[filaActual][columnaActual] = contador++;
            int siguienteMovimiento = obtenerMejorMovimiento();
            if (siguienteMovimiento == -1) {
                // No hay movimientos válidos, paseo incompleto.
                break;
            } else {
                moverCaballo(siguienteMovimiento);
            }
        }
    }

    private static int obtenerMejorMovimiento() {
        int mejorMovimiento = -1;
        int menorAccesibilidad = Integer.MAX_VALUE;

        for (int i = 0; i < 8; i++) {
            int nuevaFila = filaActual + vertical[i];
            int nuevaColumna = columnaActual + horizontal[i];

            if (esMovimientoValido(nuevaFila, nuevaColumna) && tablero[nuevaFila][nuevaColumna] == 0) {
                int accesibilidad = calcularAccesibilidad(nuevaFila, nuevaColumna);
                if (accesibilidad < menorAccesibilidad) {
                    menorAccesibilidad = accesibilidad;
                    mejorMovimiento = i;
                }
            }
        }
        return mejorMovimiento;
    }

    private static boolean esMovimientoValido(int nuevaFila, int nuevaColumna) {
        return (nuevaFila >= 0 && nuevaFila < TAMANO_TABLERO && nuevaColumna >= 0 && nuevaColumna < TAMANO_TABLERO);
    }

    private static int calcularAccesibilidad(int nuevaFila, int nuevaColumna) {
        int accesibilidad = 0;

        for (int i = 0; i < 8; i++) {
            int filaVecina = nuevaFila + vertical[i];
            int columnaVecina = nuevaColumna + horizontal[i];

            if (esMovimientoValido(filaVecina, columnaVecina) && tablero[filaVecina][columnaVecina] == 0) {
                accesibilidad++;
            }
        }
        return accesibilidad;
    }

    private static void moverCaballo(int numeroMovimeinto) {
        filaActual += vertical[numeroMovimeinto];
        columnaActual += horizontal[numeroMovimeinto];
    }

    private static void imprimirTablero() {
        for (int[] fila : tablero) {
            for (int valor : fila) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
        System.out.println();
    }
}