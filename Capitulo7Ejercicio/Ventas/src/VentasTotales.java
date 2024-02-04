//Ejercio7.20
public class VentasTotales
{
    public static void main(String[] args)
    {
        int numVendedores = 4;
        int numProductos  = 5;

        int[][] notas =
        {
                {1,2,70}, // vendedor,producto,ptrcio
                {2,4,45},
                {3,1,23},
                {4,1,20},
                {2,1,25}
        };
        // arrerglo bidimensional para las ventas totales
        double[][] ventas = new double[numProductos][numVendedores+1]; // +1 para almacenar totales de productos

        for (int[] nota : notas) {
            int vendedor = nota[0] - 1;
            int producto = nota[1] - 1;
            double total = nota[2];

            ventas[producto][vendedor] += total; // actualizamos Las ventas del vendedor
            ventas[producto][numVendedores] += total; // actualiza el total del producto
            ventas[numProductos - 1][vendedor] += total; //actualiza el total del vendedor
            ventas[numProductos - 1][numVendedores] += total; // actualiza el gran total
        }

        System.out.println("\nventas por productos y vendedor");

        System.out.print("  "); // acomodamos el encabezado de las columnas
        for (int i = 1; i <= numVendedores; i++) {
            System.out.printf("vendedor %d  ", i);
        }
        System.out.println("total");
        // mostramos el total del producto
        for (int i = 0; i < 5; i++) {
                System.out.printf("P%d | ",i + 1);
                double totalProducto = 0;
            for (int j = 0; j < numVendedores; j++) {
                System.out.printf("%7.2f$   ",ventas[i][j]);
                totalProducto+= ventas[i][j];
            }
            System.out.printf("| $%.2f%n",totalProducto);
        }
        System.out.print("total| ");
        // mostramos el total de vendedores
        for (int j = 0; j < numVendedores; j++) {
            double totalVendedor = 0;
            for (int i = 0; i < numProductos; i++) {
                totalVendedor+=ventas[i][j];
            }
            System.out.printf("%5.2f$    ", totalVendedor);
        }
        // mostramos el total en general
        double totalgeneral = 0;
        for (int i = 0; i < numProductos; i++) {
            for (int j = 0; j < numVendedores; j++) {
                totalgeneral += ventas[i][j];
            }
        }
        System.out.printf("| $%7.2f%n",totalgeneral);
    }
}
