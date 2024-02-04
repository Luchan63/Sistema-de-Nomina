//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero de cinco digitos o 6 para terminar");

        int numero;
        for(numero = entrada.nextInt(); numero < 10000; numero = entrada.nextInt()) {
            System.out.print("Ingresa un numero de cinco digitos o 6 para terminar");
        }

        int num1 = numero / 10000;
        int num2 = numero % 10000 / 1000;
        int num3 = numero % 1000 / 100;
        int num4 = numero % 100 / 10;
        int num5 = numero % 10;
        int numeroAlrevez = num5 * 10000 + num4 * 1000 + num3 * 100 + num2 * 10 + num1;
        if (numeroAlrevez == numero) {
            System.out.println(" es un palindromo");
        } else {
            System.out.println("no Es un Palindromo");
        }

    }
}
