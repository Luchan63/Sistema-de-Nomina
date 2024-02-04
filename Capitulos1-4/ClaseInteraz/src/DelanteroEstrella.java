//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class DelanteroEstrella extends Jugador implements Delantero {
    private final Scanner scanner;

    public DelanteroEstrella() {
        this.scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador: ");
        super.nombre = this.scanner.nextLine();
        System.out.print("Ingrese la posicion del jugador: ");
        super.posicion = this.scanner.nextLine();
        System.out.print("En que equipo juega: ");
        super.equipo = this.scanner.nextLine();
        System.out.print("Edad del Jugador: ");
        super.edad = this.scanner.nextInt();
        System.out.print("Numero De Camista: ");
        super.numCamiseta = this.scanner.nextInt();
    }

    public void mostrarInformacion() {
        System.out.printf("Nombre del jugador: %s%n", this.nombre);
        System.out.printf("Posicion: %s%n", this.posicion);
        System.out.printf("equipo: %s%n", this.equipo);
        System.out.printf("Edad: %d%n", this.edad);
        System.out.printf("Numero De Camista: %d%n", this.numCamiseta);
    }

    public void elegirOpcion() {
        if (this.posicion.equals("delantero") || this.posicion.equals("Delantero")) {
            System.out.print("Has elegido Delantero\n");
            System.out.println("Elije una opcion:\n1- rematar\n2- Hacaer Regates\n3- Definir Gol\n4- Correr\n5- Pasar Balon\n6- Hacer Gol");
            int opcion2 = this.scanner.nextInt();
            if (opcion2 == 1) {
                this.rematar();
            } else if (opcion2 == 2) {
                this.hacerRegate();
            } else if (opcion2 == 3) {
                this.definirGol();
            } else if (opcion2 == 4) {
                this.correr();
            } else if (opcion2 == 5) {
                this.pasarBalon();
            } else {
                this.hacerGol();
            }
        }

    }

    public void rematar() {
        System.out.printf("El jugador %s %s Remata el balon a porteria %n", this.posicion, this.nombre);
    }

    public void hacerRegate() {
        System.out.printf("El jugador %s  %s hace un regate espectacular %n", this.posicion, this.nombre);
    }

    public void definirGol() {
        System.out.printf("El Jugador %s %s ha definido un gol %n", this.posicion, this.nombre);
    }

    protected void correr() {
        System.out.printf("El Jugador %s %s ha empezado a correr por el balon %n", this.posicion, this.nombre);
    }

    protected void pasarBalon() {
        System.out.printf("El Jugador %s %s ha pasado el balon %n", this.posicion, this.nombre);
    }

    protected void hacerGol() {
        System.out.printf("El Jugador %s %s hace goles %n", this.posicion, this.nombre);
    }
}
