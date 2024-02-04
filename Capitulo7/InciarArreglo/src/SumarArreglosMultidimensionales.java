public class SumarArreglosMultidimensionales
{
    public static void main(String[] args)
    {
        int[][] a = {{7,8,5},{10,25,45}};
        int total = 0;
        for (int fila = 0; fila < a.length; fila++)
        {
            for (int columnas = 0; columnas < a[fila].length; columnas++) {
                total += a[fila][columnas];
            }
        }
        System.out.printf("El total es: %d%n",total);
    }
}
