//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PorteroSolido extends Jugador implements Portero {
    private static Scanner scanner;

    public PorteroSolido() {
        System.out.print("Ingrese el nombre del jugador: ");
        super.nombre = scanner.nextLine();
        System.out.print("Ingrese la posicion del jugador: ");
        super.posicion = scanner.nextLine();
        System.out.print("En que equipo juega: ");
        super.equipo = scanner.nextLine();
        System.out.print("Edad del Jugador: ");
        super.edad = scanner.nextInt();
        System.out.print("Numero De Camista: ");
        super.numCamiseta = scanner.nextInt();
    }

    public void mostrarInformacion() {
        System.out.printf("Nombre del jugador: %s%n", this.nombre);
        System.out.printf("Posicion: %s%n", this.posicion);
        System.out.printf("equipo: %s%n", this.equipo);
        System.out.printf("Edad: %d%n", this.edad);
        System.out.printf("Numero De Camista: %d%n", this.numCamiseta);
    }

    public void elegirOpcion() {
        if (this.posicion.equals("Portero") || this.posicion.equals("portero")) {
            System.out.print("Has elegido Portero\n");
            System.out.println("Elije una opcion:\n1- Atajar Balon\n2- Despejar Centro\n3- Sacar Porteria\n4- Correr\n5- Pasar Balon\n6- Hacer Gol");
            int opcion2 = scanner.nextInt();
            if (opcion2 == 1) {
                this.atajarBalon();
            } else if (opcion2 == 2) {
                this.despejarCentro();
            } else if (opcion2 == 3) {
                this.sacarPorteria();
            } else if (opcion2 == 4) {
                this.correr();
            } else if (opcion2 == 5) {
                this.pasarBalon();
            } else {
                this.hacerGol();
            }
        }

    }

    public void atajarBalon() {
        System.out.printf("El %s  %s ha atajado el balon%n", this.posicion, this.nombre);
    }

    public void despejarCentro() {
        System.out.printf("El %s  %s ha despejado el balon%n", this.posicion, this.nombre);
    }

    public void sacarPorteria() {
        System.out.printf("El %s  %s ha sacado de la porteria%n", this.posicion, this.nombre);
    }

    protected void correr() {
        System.out.printf("El jugador %s  %s ha empezado a correr por el balon %n", this.posicion, this.nombre);
    }

    protected void pasarBalon() {
        System.out.printf("El jugador %s  %s ha pasado el balon %n", this.posicion, this.nombre);
    }

    protected void hacerGol() {
        System.out.printf("El jugador %s  %s hace goles %n", this.posicion, this.nombre);
    }

    static {
        scanner = new Scanner(System.in);
    }
}
