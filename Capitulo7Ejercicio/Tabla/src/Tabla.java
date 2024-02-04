//ejercicio7.4
public class Tabla
{
    public static final int TEMANIO_ARREGLO = 3;
    public static void main(String[] args)
    {
        int[][] tabla = new int[TEMANIO_ARREGLO][TEMANIO_ARREGLO];

        for (int contador = 0; contador < tabla.length; contador++) {

        }
//         System.out.printf("%d ", tabla.length * tabla[0].length);""
        for (int x = 0; x < tabla.length; x++) {

            for (int y = 0; y < tabla[x].length; y++) {

            tabla[x][y] = x+y;
                System.out.print(tabla[x][y]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
