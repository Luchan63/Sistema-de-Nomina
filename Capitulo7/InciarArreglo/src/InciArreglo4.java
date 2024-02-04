// Fig. 7.17: InicArreglo.java
// Inicialización de arreglos bidimensionales.

public class InciArreglo4
{
    //crea e imprime arreglos bidimensionales
    public static void main(String[] args)
    {
        int[][] arreglo1 = {{1,2,3},{4,5,6}};
        int[][] arreglo2 = {{1,2},{3},{4,5,6}};

        System.out.println("Los  valores en arreglo 1 por filas son");
        imprimirArreglo(arreglo1); // muestra arreflo1 Por filas

        System.out.printf("%nLos  valores en arreglo 2 por filas son%n");
        imprimirArreglo(arreglo2); // muestra arreflo2 Por filas
    }

    // imprime filas y columnas de arreglo bidimensional
    public static void imprimirArreglo(int[][] arreglo)
    {
        //itera a traves de las filas del arreglo
        for (int fila = 0; fila < arreglo.length; fila++)
        {
            //itera atravez de la columnas de la fila
            for (int columnas = 0; columnas < arreglo[fila].length; columnas++)
            {
                System.out.printf("%d ",arreglo[fila][columnas]);
            }
            System.out.println();
        }
    }
}
