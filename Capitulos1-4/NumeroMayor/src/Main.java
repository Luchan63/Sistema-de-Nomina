//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int numeroMayor = Integer.MIN_VALUE;

        while(contador <= 10) {
            System.out.println("ingrese el numero");
            int numero = entrada.nextInt();
            if (numero > numeroMayor) {
                numeroMayor = numero;
            }

            ++contador;
            if (contador == 10) {
                System.out.println("el numero mas reciente es: " + numero);
                System.out.println("el numero mayor es: " + numeroMayor);
            }
        }

    }
}
