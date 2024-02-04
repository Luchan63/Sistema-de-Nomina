//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int contador = 1;
        int factorial = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribe un numero no negativo");

        int numero;
        for(numero = entrada.nextInt(); contador <= numero; ++contador) {
            factorial *= contador;
        }

        System.out.println("el n! " + numero + " es: " + factorial);
    }
}
