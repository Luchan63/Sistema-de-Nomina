import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);
        int cantidadVendida1 = 0;
        int cantidadVendida2 = 0;
        int cantidadVendida3 = 0;
        int cantidadVendida4 = 0;
        int cantidadVendida5 = 0;
        double producto1 = 2.98;
        double producto2 = 4.5;
        double producto3 = 9.98;
        double producto4 = 4.49;
        double producto5 = 6.87;

        while(true) {
            System.out.println("Ingrese numero del Producto o -1 para terminar");
            int numeroDelProducto = entre.nextInt();
            if (numeroDelProducto == -1) {
                double totalVenta = producto1 * (double)cantidadVendida1 + producto2 * (double)cantidadVendida2 + producto3 * (double)cantidadVendida3 + producto4 * (double)cantidadVendida4 + producto5 * (double)cantidadVendida5;
                System.out.printf("El valor Total de Ventas es: %.2f%n ", totalVenta);
                return;
            }

            switch (numeroDelProducto) {
                case 1:
                    System.out.println("Ingrese la cantidad vendida del Producto1 o -1 para terminar");
                    numeroDelProducto = entre.nextInt();
                    cantidadVendida1 += numeroDelProducto;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad vendida del Producto2 o -1 para terminar");
                    numeroDelProducto = entre.nextInt();
                    cantidadVendida2 += numeroDelProducto;
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad vendida del Producto3 o -1 para terminar");
                    numeroDelProducto = entre.nextInt();
                    cantidadVendida3 += numeroDelProducto;
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad vendida del Producto4 o -1 para terminar");
                    numeroDelProducto = entre.nextInt();
                    cantidadVendida4 += numeroDelProducto;
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad vendida del Producto5s o -1 para terminar");
                    numeroDelProducto = entre.nextInt();
                    cantidadVendida5 += numeroDelProducto;
                    break;
                default:
                    System.out.println("numero Erroneo");
            }
        }
    }
}