//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PromedioClase2 {
    public PromedioClase2() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        int contadorCalificaciones = 0;
        System.out.print("Escribe la calificacio o -1 para terminar: ");

        for(int calificacion = entrada.nextInt(); calificacion != -1; calificacion = entrada.nextInt()) {
            total += calificacion;
            ++contadorCalificaciones;
            System.out.print("Escribe la calificacio o -1 para terminar: ");
        }

        if (contadorCalificaciones != 0) {
            double promedio = (double)total / (double)contadorCalificaciones;
            System.out.printf("%n El total de las %d calificaciones introducidad es %d%n", contadorCalificaciones, total);
            System.out.printf("%nEl promedio de la clase es %.2f%n", promedio);
        } else {
            System.out.println("No se introdujeron calificaciones");
        }

    }
}
