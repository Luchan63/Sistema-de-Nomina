//jercicio 7.19
import java.util.Scanner;
public class Reservaciones
{
    public static void main(String[] args)
    {
        int  capacidadAsientos = 10;
        boolean[] asignarAsiento = new boolean[capacidadAsientos];
        Scanner scan = new Scanner(System.in); // permitimos que el usuario nos de opciones

        // imprimimos un mensaje de bienvenida
        System.out.println("Bienvenido a la Aerolinea Conviasa");
        System.out.println("desea Realizar la Reserva? 1 si 2 no");
        int opcion  = scan.nextInt();

        while (true) {
            if (opcion == 2) break;
            // preguntamos al usuario que opcion desea realizar
            System.out.println("desea Realizar la Reserva en 1 Primera Clase 2 Clase economica o 3 para salir?");
            int opcion2 = scan.nextInt();

            if (opcion2 == 1) {
                // creamos la variable asiento asignado para porder utilizarla luego dentro del main
                int asientoAsignado = asignarAsientos(asignarAsiento, 1, 5);
                // condicion para asignar el asiento
                if (asientoAsignado != -1) {
                    System.out.println("Gracia por reservar con nostros");
                    imprimirPaseDeAbordar(asientoAsignado, opcion2);
                } else {
                    // si la primera clase esta llena le asignamos una nueva en la clase economica
                    System.out.println("La Primera clase esta llena, Desea reservar en Clase Economica (1 si 2 no)");
                    int seleccion = scan.nextInt();
                    if (seleccion == 1) {
                        if (asignarAsientos(asignarAsiento, 1, 5) != -1) {
                            imprimirPaseDeAbordar(asignarAsientos(asignarAsiento, 6, 10), 2);
                        } else {
                            System.out.println("no tenemos asientos disponible, en tres horas regrese ");
                            break;
                        }
                    }
                }
            } else if (opcion2 == 2) {
                int asientoAsignado = asignarAsientos(asignarAsiento, 6, 10);
                if (asientoAsignado != -1) {
                    System.out.println("Gracia por reservar con nostros");
                    imprimirPaseDeAbordar(asientoAsignado, opcion2);
                } else {
                    System.out.println("La clase Economica esta llena, Desea reservar en Primera Clase (1 si 2 no)");
                    int seleccion1 = scan.nextInt();
                    if (seleccion1 == 1) {

                        if (asignarAsientos(asignarAsiento, 1, 5) != -1) {
                            imprimirPaseDeAbordar(asignarAsientos(asignarAsiento, 1, 5), 1);
                        } else {
                            System.out.println("no tenemos asientos disponible, en tres horas regrese ");
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Saliendo del Area de Reservas. ¡Hasta Luego!");
                break;
            }
        }

    }
        //metodo para asignar los asiento
    public static int asignarAsientos(boolean[] asientos, int inicio, int fin){
        for (int i = inicio - 1; i < fin; i++) {
           if (!asientos[i]){
               asientos[i] = true;
                return i + 1;
           }
        }
        return -1;
    }
    // Método para imprimir el pase de abordar
    public static void imprimirPaseDeAbordar(int numeroAsiento, int seccion) {
        System.out.println("------ PASE DE ABORDAR ------");
        System.out.println("Asiento: " + numeroAsiento);
        System.out.println("Sección: " + ((seccion == 1) ? "Primera Clase" : "Económico"));
        System.out.println("----------------------------");
    }
}
