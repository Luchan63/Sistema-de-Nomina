//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud1");
        int lado = sc.nextInt();
        System.out.println("Ingresa la longitud2 ");
        int lado2 = sc.nextInt();
        System.out.println("Igrese la longitud3");
        int lado3 = sc.nextInt();
        if (lado == lado2 && lado == lado3) {
            System.out.println("Es un triangulo equilatero");
        }

        if (lado == lado2 || lado == lado3 || lado2 == lado3) {
            System.out.println("Es un triángulo Isósceles");
        }

        if (lado != lado2 && lado != lado3 && lado2 != lado3) {
            System.out.println("Es un triángulo Escaleno");
        }

    }
}
