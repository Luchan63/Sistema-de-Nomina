//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PromedioClase {
    public PromedioClase() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;

        int promedio;
        for(int contadorCalificaciones = 1; contadorCalificaciones <= 10; ++contadorCalificaciones) {
            System.out.print("Escriba la Calificacion: ");
            promedio = entrada.nextInt();
            total += promedio;
        }

        promedio = total / 10;
        System.out.printf("%n El total de las Calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}
