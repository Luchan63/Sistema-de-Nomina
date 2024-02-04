// ejercicio 7.28
import java.util.Random;

public class TortugaYLiebre {
    public static void main(String[] args) {
        int posicionTortuga = 1;
        int posicionLiebre = 1;
        Random random = new Random();

        System.out.println("PUM!!! Y ARRANCA !!!!");

        while (posicionTortuga < 70 && posicionLiebre < 70) {
            int movimientoTortuga = moverTortuga(random.nextInt(10)+1) ;
            int movimientoLiebre = moverLiebre(random.nextInt(11)+1);

            // actualizar posiciones
            posicionTortuga = actualizarPosicion(posicionTortuga,movimientoTortuga);
            posicionLiebre = actualizarPosicion(posicionLiebre,movimientoLiebre);

            // imprimir linea de carrera
            imprimirCarrera(posicionTortuga,posicionLiebre);

            // comprobar si es empate y mostrar resultado
            if (posicionLiebre == posicionTortuga){
                System.out.println("OUCH!! en la posicion " + posicionTortuga);
            }

            // comprobar ganador
            if (posicionTortuga >= 70 || posicionLiebre >= 70)
            {
                if (posicionTortuga >= 70 && posicionLiebre >= 70)
                {
                System.out.println("Es un Empate.");
                } else if (posicionTortuga >= 70)
                {
                    System.out.println("LA TORTUGA GANA!!! HURRRA");
                } else
                {
                    System.out.println("LA LIEBRE GANA. QUE MAL!");
                }
                break;
            }
        }
    }

    public static int moverTortuga(int i) {
        if (i <= 5) {
            return 3; // Paso Pesado Rapido
        } else if (i <= 7) {
            return-6; // Resbalon
        } else
        {
            return 1; // Paso Pesado Lento.
        }
    }

    public static int moverLiebre(int i) {
        if (i == 0) {
            return 0; // Dormir
        } else if (i <= 10) {
            return 9; //Gran Salto
        } else if (i <= 12) {
            return -12; // Gran Resbalon
        } else if (i <= 13) {
            return 1; // Pequeño Salto
        } else {
            return -2; // pequeñp Resbalon
        }
    }

    public static int actualizarPosicion(int posicion, int movimiento)
    {
        int nuevaPosicion = posicion+movimiento;

        return nuevaPosicion > 0 ? nuevaPosicion : 1;
    }

    public static void imprimirCarrera(int posicionTortuga, int PosicionLiebre)
    {
        for (int i = 1; i <= 70; i++) {
            if (i == posicionTortuga)
            {
                System.out.print("T");
            } else if (i == PosicionLiebre)
            {
                System.out.print("H");
            } else {
                System.out.println(" ");
            }
        }
        System.out.println();
    }
}