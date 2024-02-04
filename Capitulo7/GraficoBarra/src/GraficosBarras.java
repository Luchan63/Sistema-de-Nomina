//fig 7.16
// Programa para imprimir gráficos de barras.

public class GraficosBarras
{
    public static void main(String[] args)
    {
        int[] arreglo = {0,0,0,0,0,0,1,2,4,2,1};

        System.out.println("Distribucion de Calificaciones");

        // para cada elemento del arreglo, imprime una barradel grafico
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            // imprime etiquetas de la barra ("00-09: ",...., "90-99: ", "100: ")
            if (contador == 10)
                System.out.printf("%5d: ",100);
            else
                System.out.printf("%02d-%02d: ",contador * 10, contador * 10 + 9);

            // imprime barra de asteriscoss
            for (int estrellas = 0; estrellas < arreglo[contador]; estrellas++)
                System.out.print("*");

            System.out.println();
        }
    }
}
