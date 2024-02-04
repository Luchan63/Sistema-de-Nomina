import java.util.Scanner;

public class VentasTotales2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo bidimensional para las ventas
        double[][] ventas = new double[5][4]; // 5 productos, 4 vendedores

        // Entrada de datos
        System.out.println("Ingrese las ventas del último mes (formato: vendedor producto valor):");
        System.out.println("Ingrese -1 para finalizar la entrada de datos.");

        while (true) {
            int vendedor = scanner.nextInt();
            if (vendedor == -1) {
                break; // Salir del bucle si se ingresa -1
            }

            int producto = scanner.nextInt();
            double valor = scanner.nextDouble();

            // Sumar el valor al total correspondiente en el arreglo
            ventas[producto - 1][vendedor - 1] += valor;
        }

        // Mostrar resultados en formato tabular
        System.out.println("\nVentas totales por producto y vendedor:");

        // Encabezado de columnas (vendedores)
        System.out.print("     ");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Vendedor %d  ", i);
        }
        System.out.println("Total");

        // Datos de ventas y totales por producto
        for (int i = 0; i < 5; i++) {
            System.out.printf("P%d | ", i + 1);
            double totalPorProducto = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("$%.2f   ", ventas[i][j]);
                totalPorProducto += ventas[i][j];
            }
            System.out.printf("| $%.2f%n", totalPorProducto);
        }

        // Totales por vendedor
        System.out.print("Total | ");
        for (int j = 0; j < 4; j++) {
            double totalPorVendedor = 0;
            for (int i = 0; i < 5; i++) {
                totalPorVendedor += ventas[i][j];
            }
            System.out.printf("$7%.2f   ", totalPorVendedor);
        }

        // Total general
        double totalGeneral = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalGeneral += ventas[i][j];
            }
        }
        System.out.printf("| $%6.2f%n", totalGeneral);
    }
}