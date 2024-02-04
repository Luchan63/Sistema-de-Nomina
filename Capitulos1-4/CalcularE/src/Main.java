//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe un numero no negativo");
        int numero = sc.nextInt();
        int counter = 1;

        double e;
        for(e = 1.0; numero > counter; ++counter) {
            e += 1.0 / (double)factorial(counter);
        }

        System.out.println("e: " + e);
        System.out.println("ingrese el siguiente numero");
        double num = sc.nextDouble();
        double e2 = 1.0;

        for(counter = 1; num >= (double)counter; ++counter) {
            e2 += Math.pow(num, (double)counter) / (double)factorial(counter);
        }

        System.out.println("e2: " + e2);
    }

    public static int factorial(int num) {
        int contador = 1;

        int factorial;
        for(factorial = 1; contador <= num; ++contador) {
            factorial *= contador;
        }

        return factorial;
    }
}
