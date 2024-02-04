// fig 7.3
// inicializacion de los elementos de un arreglo con un inicializador de arreglo
public class InicArreglo2
{
    public static void main(String[] args)
    {
        // lista de inicializadora especifica el valor para cada elemento
        int [] arreglo = {32,27,64,18,95,14,90,70,60,37};

        // encabezado de columnas
        System.out.printf("%s%8s%n", "indice", "Valor");

        // imprime el valor de cada elemento del arreglo
        for (int contador = 0; contador < arreglo.length; contador++) {
            System.out.printf("%5d%8d%n", contador,arreglo[contador]);
        }
    }
}
