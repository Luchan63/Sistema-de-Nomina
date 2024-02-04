import java.util.Scanner;
// ejercicio 8.17
public class TresEnRaya
{
    public enum Casilla {X,O,V}
    private Casilla[][] tablero;

    public TresEnRaya()
    {
        tablero = new Casilla[3][3];
        inicializarTablero();
    }
    public void inicializarTablero()
    {

        for (int i = 0; i < tablero.length; i++)
        {
            for (int j = 0; j < tablero[0].length; j++)
            {
                tablero[i][j] = Casilla.V;

            }
        }
    }

    public boolean esVerificado(int fila, int columna)
    {
        return fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[0].length && tablero[fila][columna] == Casilla.V;
    }

    // metodo para realizar la jugada
    public void realizarJugada(int fila, int columna,Casilla jugador)
    {
        esVerificado(fila,columna);

        if (tablero[fila][columna] == Casilla.V)
        {
            tablero[fila][columna] = jugador;
        } else {
        throw new IllegalArgumentException("Posición no válida o ya ocupada. Inténtalo de nuevo.");

        }

    }

    //verificar ganador

    public boolean hayGanador()
    {
        // verificamos las filas
        for (int i = 0; i < 3; i++)
        {
            if (tablero[i][0] != Casilla.V && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2])
            {
                return true; // hay un ganador en la fila
            }
        }

        // verificamos columnas
        for (int j = 0; j < 3; j++)
        {
            if (tablero[0][j] != Casilla.V && tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j])
            {
                return true; // hay un ganador en la columna
            }
        }

        // verificamos linea diagonal

            if (tablero[0][0] != Casilla.V && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2])
            {
                return true;
            }

            if (tablero[0][2] != Casilla.V && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0])
            {
                return true;
            }

        return false;
    }

    // metodo para verificar si hay empate
    public boolean hayEmpate()
    {
        for (Casilla[] casillas : tablero) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (casillas[j] == Casilla.V) {
                    return false;
                }
            }
        }
        return true;
    }

    // metodo jugar
    public void jugar()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego Tres en Raya!");
        System.out.println("El jugador 1 es X y el jugador 2 es 0");

        boolean turnoJugador1 = true;

        while (true)
        {
            imprimirTablero();
            int fila, columna;

            do {
                System.out.println("Jugador" + (turnoJugador1 ? "1 (X)" : "2 (O)") + ", ingresa tu jugada (fila y columna)");
                System.out.println("Ingrese la fila: 0 1 2 ");
                fila = scanner.nextInt();
                System.out.println("Ingrese la columna: 0 1 2 ");
                columna = scanner.nextInt();
            } while(!esVerificado(fila,columna));

            realizarJugada(fila,columna, turnoJugador1 ? Casilla.X : Casilla.O);

            if (hayGanador()) {
                imprimirTablero();
                System.out.println("¡Jugador " + (turnoJugador1 ? "1 (X)" : "2 (O)") + " ha ganado!");
                break;
            }

            if (hayEmpate()) {
                imprimirTablero();
                System.out.println("¡El juego ha terminado en empate!");
                break;
            }

            turnoJugador1 = !turnoJugador1;
        }

        scanner.close();
    }


    //imprimir tablero
    public void imprimirTablero()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
    }
}
