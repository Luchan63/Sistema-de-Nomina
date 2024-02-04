//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalArticulo = 0;
        int totalCredito = 0;
        int contador = 0;
        System.out.println("inserte nuemro de Cuenta");
        int numeroCuenta = entrada.nextInt();
        System.out.println("Saldo incial");
        int saldoInicial = entrada.nextInt();
        System.out.println("Limite de Credito");
        int limiteCredito = entrada.nextInt();
        System.out.println("numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("limite de Cedito: " + limiteCredito);
        System.out.println("Ingrese articulos de clientes o 0 para terminar");
        int articulo = entrada.nextInt();
        System.out.println("Ingrese los creditos aplicados al cliente o 0 para terminar");

        for(int credito = entrada.nextInt(); articulo + articulo != 0; credito = entrada.nextInt()) {
            totalArticulo += articulo;
            totalCredito += credito;
            ++contador;
            System.out.println("Ingrese articulos de clientes o 0 para terminar");
            articulo = entrada.nextInt();
            System.out.println("Ingrese creditos aplicados al cliente o 0 para terminar");
        }

        if (contador != 0) {
            int saldo = saldoInicial + totalArticulo - totalCredito;
            System.out.printf("%n El total de las %d articulos introducidos por el cliente es %d%n", contador, totalArticulo);
            System.out.printf("%n El total de los %d creditos introducidos por el clente es %d%n", contador, totalCredito);
            System.out.printf("%nEl nuevo saldo del cliente es: %d%n ", saldo);
            if (saldo > limiteCredito) {
                System.out.println("Se excedio el Limite de su Credito ");
            }
        }

    }
}
