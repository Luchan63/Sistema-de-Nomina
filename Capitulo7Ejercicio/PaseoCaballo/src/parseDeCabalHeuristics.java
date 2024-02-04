// ejercicio 7.22 parte C

public class parseDeCabalHeuristics
{

    private static final int TAMANO_TABLERO = 8;
    private static final int[][] TABLERO = new int[TAMANO_TABLERO][TAMANO_TABLERO];
    private static final int[] HORIZONTAL = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] VERTICAL = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        for (int inicioFila = 0; inicioFila < TAMANO_TABLERO; inicioFila++) {
            for (int inicioColumna = 0; inicioColumna < TAMANO_TABLERO; inicioColumna++) {
                // Reiniciar el tablero para cada paseo
                reiniciarTablero();

                int filaActual = inicioFila;
                int columnaActual = inicioColumna;
                int contador = 1;

                TABLERO[filaActual][columnaActual] = contador;

                while (contador < TAMANO_TABLERO * TAMANO_TABLERO) {
                    int siguienteMovimiento = obtenerSiguienteMovimiento(filaActual, columnaActual);
                    if (siguienteMovimiento == -1) {
                        // No hay movimientos válidos, el paseo termina
                        break;
                    }

                    // Realizar el siguiente movimiento
                    filaActual += VERTICAL[siguienteMovimiento];
                    columnaActual += HORIZONTAL[siguienteMovimiento];
                    contador++;
                    TABLERO[filaActual][columnaActual] = contador;
                }
            }
        }

        // Imprimir el tablero del último paseo
        imprimirTablero();
    }

    private static void reiniciarTablero() {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                TABLERO[i][j] = 0;
            }
        }
    }

    private static int obtenerSiguienteMovimiento(int fila, int columna) {
        int siguienteMovimiento = -1;
        int menorAccesibilidad = Integer.MAX_VALUE;

        for (int i = 0; i < 8; i++) {
            int nuevaFila = fila + VERTICAL[i];
            int nuevaColumna = columna + HORIZONTAL[i];

            if (esMovimientoValido(nuevaFila, nuevaColumna) && TABLERO[nuevaFila][nuevaColumna] == 0) {
                int accesibilidad = calcularAccesibilidad(nuevaFila, nuevaColumna);
                if (accesibilidad < menorAccesibilidad) {
                    menorAccesibilidad = accesibilidad;
                    siguienteMovimiento = i;
                }
            }
        }

        return siguienteMovimiento;
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < TAMANO_TABLERO && columna >= 0 && columna < TAMANO_TABLERO;
    }

    private static int calcularAccesibilidad(int fila, int columna) {
        int accesibilidad = 0;

        for (int i = 0; i < 8; i++) {
            int nuevaFila = fila + VERTICAL[i];
            int nuevaColumna = columna + HORIZONTAL[i];

            if (esMovimientoValido(nuevaFila, nuevaColumna) && TABLERO[nuevaFila][nuevaColumna] == 0) {
                accesibilidad++;
            }
        }

        return accesibilidad;
    }

    private static void imprimirTablero() {
        for (int[] fila : TABLERO) {
            for (int valor : fila) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
    }
}

