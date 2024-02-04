//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int contadorkilometraje = 0;
        System.out.print("ingresa los kilometros: ");
        int kilometros = entrada.nextInt();
        System.out.print("ingrese los litro; ");

        for(int litros = entrada.nextInt(); kilometros != -1; litros = entrada.nextInt()) {
            total = kilometros * litros;
            ++contadorkilometraje;
            System.out.print("ingresa los kilometros: ");
            kilometros = entrada.nextInt();
            System.out.print("ingrese los litro; ");
        }

        if (contadorkilometraje != 0) {
            double promerio = (double)total / (double)contadorkilometraje;
            System.out.printf("%nEl total del %d kilometros obtenidos es: %d%n ", total, contadorkilometraje);
            System.out.printf("el promedio del kilometraje recorrido es de: %.2f%n ", promerio);
        } else {
            System.out.println("no se introdujeron calificaciones");
        }

    }
}
