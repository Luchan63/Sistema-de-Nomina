//ejercicio 7.22

public class PaseDeCaballo1 {
    private static final int TAMANO_TABLERO = 8;
    private static final int[][] tablero = new int[TAMANO_TABLERO][TAMANO_TABLERO];
    private static final int MOVIMIENTOS_TOTALES = TAMANO_TABLERO * TAMANO_TABLERO;
    private static final int[] HORIZONTAL = {2, 1, -1, -2, -2, -1, 1, 2}; // horizontal a la izquierda son los numero negativos
    private static final int[] VERTICAL = {-1, -2, -2, -1, 1, 2, 2, 1}; // verticar hacia arriba son los numeros negativos
    private static int contador = 1;

    public static void main(String[] args) {
        int filaActual = 0;
        int columnaActual = 0;

        tablero[filaActual][columnaActual] = contador;

        while (contador < MOVIMIENTOS_TOTALES)
        {
            int siguienteMovimiento = siguienteNumero(filaActual, columnaActual);

            if (siguienteMovimiento == -1) {
                //no hay movimiento validos, el paseo termina
                break;
            }

            //realizar el siguiente movimiento
            filaActual += VERTICAL[siguienteMovimiento];
            columnaActual += HORIZONTAL[siguienteMovimiento];
            contador++;
            tablero[filaActual][columnaActual] = contador;
        }
        for (int[] fila : tablero) {
            for (int valor : fila) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
        System.out.println("Numero Total de Movimientos: " + contador);
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
    }

    //Metodo para el siguiente numero
    public static int siguienteNumero(int fila, int columna) {
        for (int i = 0; i < 8; i++) {
            //actualiza la posicion del caballo
            int nuevaFila = fila + VERTICAL[i];
            int nuevaColumna = columna + HORIZONTAL[i];

            // verificamos si la posicion esta dentro del tablero y no ha sido vertical
            if (esMovimientoValido(nuevaFila, nuevaColumna) && tablero[nuevaFila][nuevaColumna] == 0) {

                return i;
            }
        }
        return -1; // no hay movimientos validos
    }
}
