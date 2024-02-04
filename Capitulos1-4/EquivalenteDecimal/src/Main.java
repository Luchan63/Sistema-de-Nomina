//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingreses un numero binario (0s o 1s)");

        int binario;
        for(binario = sc.nextInt(); binario < 10000; binario = sc.nextInt()) {
            System.out.println("ingreses un numero binario (0s o 1s)");
        }

        int bin1 = binario / 1000000000;
        int bin2 = binario % 1000000000 / 100000000;
        int bin3 = binario % 100000000 / 10000000;
        int bin4 = binario % 10000000 / 1000000;
        int bin5 = binario % 1000000 / 100000;
        int bin6 = binario % 100000 / 10000;
        int bin7 = binario % 10000 / 1000;
        int bin8 = binario % 1000 / 100;
        int bin9 = binario % 100 / 10;
        int bin10 = binario % 10;
        int decimal = bin10 * 1 + bin9 * 2 + bin8 * 4 + bin7 * 8 + bin6 * 16 + bin5 * 32 + bin4 * 64 + bin3 * 128 + bin2 * 256 + bin1 * 512;
        System.out.println("el numero binario es: " + binario + " El cambio a decimal es: " + decimal);
        System.out.print("ingrese un numero decimal");

        int deci;
        for(deci = sc.nextInt(); deci < 100; deci = sc.nextInt()) {
            System.out.print("ingrese un numero decimal");
        }

        int dec1 = binario / 1000000000;
        int dec2 = binario % 1000000000 / 100000000;
        int dec3 = binario % 100000000 / 10000000;
        int dec4 = binario % 10000000 / 1000000;
        int dec5 = binario % 1000000 / 100000;
        int dec6 = binario % 100000 / 10000;
        int dec7 = binario % 10000 / 1000;
        int dec8 = binario % 1000 / 100;
        int dec9 = binario % 100 / 10;
        int dec10 = binario % 10;
        int binari = dec10 * 1 + dec9 * 2 + dec8 * 4 + dec7 * 8 + dec6 * 16 + dec5 * 32 + dec4 * 64 + dec3 * 128 + dec9 * 256 + dec1 * 512;
        System.out.println("el numero decimal es: " + deci + " El cambio a binario es: " + binari);
    }
}
