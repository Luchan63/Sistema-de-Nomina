// ejercicio 7.21
import java.util.Arrays;
import java.util.Scanner;

public class TortugaGrafica
{
    private static final int[][] piso = new int[20][20];
   private static int x = 0, y = 0; // posicion actual de la tortuga
    private static boolean boligrafoAbajo = false;
    private static int direccion = 0;
    private  static final int[] comandos = new int[9];
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int comando = 0;
        do {
            Arrays.fill(comandos,comando);
            mostrarMenu();
            comando = scan.nextInt();

            switch (comando)
            {
                case 1:
                    boligrafoAbajo = false;
                    break;
                case 2:
                    boligrafoAbajo = true;
                    break;
                case 3:
                  // Girar a la derecha
                    girarDerecha();
                  break;
                case 4:
                    //Girar a la izquierda
                    girarIzquierda();
                    break;
                case 5:
                    //Avanzar
                    System.out.print("Ingrese el numero de espacios para avanzar");
                    int pasos = scan.nextInt();
                    avanzar(pasos);
                    break;
                case 6:
                    // mostrar en pantalla
                    mostrarPiso();
                    break;
                case 9:
                    // fin de los datos
                    break;
                default:
                    System.out.println("comando no valido");
            }

        } while (comando != 9);
        scan.close();
    }
    private static void avanzar(int pasos) {
        for (int i = 0; i < pasos ; i++) {

            switch (direccion) {
                case 0: // Derecha
                    x = Math.min(x + 1, 19);  // Asegura que x no exceda los límites
                    break;
                case 1: // Abajo
                    y = Math.min(y + 1, 19);  // Asegura que y no exceda los límites
                    break;
                case 2: // Izquierda
                    x = Math.max(x - 1, 0);   // Asegura que x no sea menor que 0
                    break;
                case 3: // Arriba
                    y = Math.max(y - 1, 0);   // Asegura que y no sea menor que 0
                    break;
            }

            if (boligrafoAbajo) {
                piso[y][x] = 1;  // Marca el piso si el bolígrafo está abajo
            }
        }
    }

    private static void girarDerecha() {
        // Actualizar la dirección para girar a la derecha
        direccion = (direccion + 1) % 4;
    }

    private static void girarIzquierda() {
        // Actualizar la dirección para girar a la izquierda
        direccion = (direccion - 1 + 4) % 4;
    }
    private static void mostrarPiso() {
        for (int[] fila : TortugaGrafica.piso) {
            for (int valor : fila) {
                System.out.print((valor == 1) ? "*"  : " ");
            }
            System.out.println();
        }
    }
    private static void mostrarMenu() {
        System.out.println("1. Bolígrafo arriba\n2. Bolígrafo abajo\n3. Girar a la derecha\n4. Girar a la izquierda\n5. Avanzar\n6. Mostrar en pantalla\n9. Fin de los datos\nIngrese un comando (1-9): ");

    }
}
