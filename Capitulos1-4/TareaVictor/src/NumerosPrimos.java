//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class NumerosPrimos {
    public NumerosPrimos() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrse un numero que sea divisible entre 1 o si mismo");
        int scan = sc.nextInt();

        for(int i = 1; i <= scan; ++i) {
            System.out.println("i; " + i);
            System.out.println(scan);
        }

        if (scan <= 1) {
            System.out.println("no es primo");
        } else {
            System.out.println("Es primo");
        }

    }
}
