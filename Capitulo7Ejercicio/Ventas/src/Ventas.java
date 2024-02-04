// ejercicio 7.13
public class Ventas
{
    public static void main(String[] args)
    {
        int[][] ventas = new int[3][5];

        for (int fila = 0; fila < ventas.length; fila++)
        {
            for (int col = 0; col < ventas[fila].length; col++)
            {
                ventas[fila][col] = 0;
                System.out.printf("%d " , ventas[fila][col]);
            }
            System.out.println();
        }
    }
}
