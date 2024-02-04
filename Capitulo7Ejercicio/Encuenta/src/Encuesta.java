import java.util.Scanner;

public class Encuesta {
    public static final int[][] respuesta = new int[5][10];
       public static final String[] temas = {
                "¿Cuanto te preocupa dejar un buen planeta para las próximas generaciones?",
                "¿Cuanto Crees que nuestras acciones del día a día contribuyen al deterioro del planeta",
                "¿Cuanto crees que es de inportancia de saber ubicar la información sobre temas del medio ambiente?",
                "¿Cuanto es tu reacción al encontrar información relacionada al cuidado del medio ambiente en tus redes sociales?",
                "¿Cuanto ha sido tu impresion al ver el medio ambiente a lo largo de los años?\n"
        };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int Personas = 0; Personas < 10; Personas++) {
            System.out.print("Persona " + (Personas + 1) + ": ");

            for (int nombreEncuestas = 0; nombreEncuestas < temas.length; nombreEncuestas++) {
                System.out.println("Ingrese la calificación (de 1 a 10):\n" + temas[nombreEncuestas] );

                respuesta[nombreEncuestas][Personas] = scan.nextInt();
            }
        }

        imprimirEncuesta();
        minimaPuntuacion();
        maximaPuntuacion();
    }

    public static void imprimirEncuesta() {
        System.out.println("La encuesta es:\n");
        System.out.print("              "); // alinea encaabezados de colunnas

        for (int personas = 0; personas < respuesta[0].length; personas++) {
            System.out.printf("Personas %2d ", personas + 1);
        }
        System.out.println(" Promedio");

        // Print data
        for (int encuesta = 0; encuesta < respuesta.length; encuesta++) {
            System.out.printf("Encuesta %d   ", encuesta + 1);

            for (int personas : respuesta[encuesta]) {
                System.out.printf("%11d", personas);
            }
            // llamamos el metodo promedio para realizar el promedio de las encuestas
            double promedio = promedio(respuesta[encuesta]);
            System.out.printf("%20f%n",promedio);
        }
    }

    // metodo para sacar la puntuacion menos
    public static void minimaPuntuacion()
    {
        int minimaPuntacion = Integer.MAX_VALUE;
        String temaMinimaPuntuacion = "";


        for (int minima = 0; minima < respuesta.length; minima++)
        {
            int puntuacionTotal = puntuacionTotal(respuesta[minima]);

            if (puntuacionTotal < minimaPuntacion)
            {
                minimaPuntacion = puntuacionTotal;
                temaMinimaPuntuacion = temas[minima];
            }
        }
        System.out.println("\nTema con menor Puntuacion total:");
        System.out.println("temas: " + temaMinimaPuntuacion);
        System.out.println("puntuacion Total: " + minimaPuntacion);
    }
    // metodo para sacar el maximo valor
    public static void maximaPuntuacion()
    {
        int maximaa = Integer.MIN_VALUE;
        String temaMaximaPuntuaciom = "";

        for (int maxima = 0; maxima < respuesta.length ; maxima++) {
            int puntacionTotal = puntuacionTotal(respuesta[maxima]);

            if (puntacionTotal > maximaa)
            {
                maximaa = puntacionTotal;
                temaMaximaPuntuaciom = temas[maxima];
            }
        }
        System.out.println("\nTema con mayor Puntuacion Total");
        System.out.println("tema: " + temaMaximaPuntuaciom);
        System.out.println("Puntuacion Total: " + maximaa);
    }
    // calculamos el promedio
    public static double promedio(int[] valores)
    {
        int suma = 0;

        for (int valor : valores) {
            suma += valor;
        }
        return (double) suma / valores.length;
    }
    // creamos metodo para sumar todo y sacar el total
    public static int puntuacionTotal(int[] valores)
    {
        int suma = 0; // acumulador

        for (int valor : valores) { // iteramos en el arreglo
            suma += valor; // sumamos
        }
        return suma; // devolvemos el valor total
    }
}
