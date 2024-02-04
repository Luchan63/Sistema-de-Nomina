
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalVendedor = 0;
        int contadorVendedor = 0;
        System.out.println("ingrese el articulo vendido o 0 para terminar");

        for(int articulo = entrada.nextInt(); articulo != -1; articulo = entrada.nextInt()) {
            totalVendedor += articulo;
            ++contadorVendedor;
            System.out.println("ingrese el articulo vendido o 0 para terminar");
        }

        if (contadorVendedor != 0) {
            double venta = (double)totalVendedor * 0.09 + 200.0;
            System.out.println("el total de articulos es: " + totalVendedor);
            System.out.println("ingreso del vendedor es: " + venta);
        }

    }
}
