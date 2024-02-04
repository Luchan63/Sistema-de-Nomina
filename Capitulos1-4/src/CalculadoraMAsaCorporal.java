
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CalculadoraMAsaCorporal {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        double altura = entrada.nextDouble();
        System.out.println("ingrese el peso");
        double peso = entrada.nextDouble();
        double bim = altura * 2.0 / peso;
        if (bim < 18.55) {
            System.out.println("bajo peso");
        } else if (bim > 18.5 && bim < 24.9) {
            System.out.println("peso normal ");
        } else if (bim == 29.9) {
            System.out.println("sobrepeso");
        } else if (bim >= 30.0) {
            System.out.println("obeso");
        }

    }
}
