// fig 7.8
//Programa de analisis de uan encuesta

public class EncuentaEstudiante
{
    public static void main(String[] args)
    {
        // Arreglo de respuestas de estudiantes (lo mas comun es que se introduzcanen tiempo de ejecuciom)
        int[] respuestas = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};

        int[] frecuencia = new int[6]; // arreglo de contadores de frecuencia

        /*para cada respuesta, selecciona el elemento de respuesta y usa ese valor
         como indice de frecuencia para determinar el elemento a incrementar*/
        for (int respuesta = 0; respuesta < respuestas.length ; respuesta++)
        {
                try
                {
                    ++frecuencia[respuestas[respuesta]];
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e); // invoca el metodo toString
                    System.out.printf("   Respuesta[%d] = %d%n%n", respuesta,respuestas[respuesta]);
                }
        }

        System.out.printf("%s%10s%n", "Calificacion", "Frecuencia");// encabezado

        // imprime el valor de cada elemento de arreglo
        for (int calificacion = 1; calificacion < frecuencia.length ; calificacion++)
            System.out.printf("%6d%10d%n", calificacion,frecuencia[calificacion]);
    }
}