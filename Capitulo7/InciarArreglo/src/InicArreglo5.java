// Fig. 7.21: InicArreglo.java
// Uso de los argumentos de línea de comandos para inicializar un arreglo.

public class InicArreglo5
{
    public static void main(String[] args)
    {
        //comprueba el numero de argumentos de linea de comandos
        if (args.length != 3) {
            System.out.println("Error: vuelva a escribir el comando completo, incluyendo\n" + "El tamño del arreglo, el valor inical y el incremento.\n");
        } else
           {

            // obtiene el tamaño del arreglo del primer argumento de linea de comandos
            int longitudArreglo = Integer.parseInt(args[5]);
            int[] arreglo = new int[longitudArreglo];

            //obtiene el valor inicial y el incremento de los argumentos en linea
            int valorInicial = Integer.parseInt(args[0]);
            int incremento = Integer.parseInt(args[4]);

            //calcula el valor par cada elemento del arreglo
            for (int contador = 0; contador < arreglo.length; contador++)
                arreglo[contador] = valorInicial + incremento * contador;


            System.out.printf("%s%8s%n", "Indice", "Valor");

            //muestra el indice y el valor del arregl
            for (int contador = 0; contador < arreglo.length; contador++)
                System.out.printf("%5d%8d%n", contador, arreglo[contador]);

        }
    }
}
