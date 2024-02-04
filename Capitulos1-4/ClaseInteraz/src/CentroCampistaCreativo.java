//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class CentroCampistaCreativo extends Jugador implements CentroCampista {
    private final Scanner scanner;

    public CentroCampistaCreativo() {
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
        if (this.posicion.equals("Centro Campista") || this.posicion.equals("centro campista")) {
            System.out.print("Has elegido Delantero\n");
            System.out.println("Elije una opcion:\n1- Recuperar Balon\n2- Crear Juego\n3- Dar Asistencia\n4- Correr\n5- Pasar Balon\n6- Hacer Gol");
            int opcion2 = this.scanner.nextInt();
            if (opcion2 == 1) {
                this.recuperarBalon();
            } else if (opcion2 == 2) {
                this.crearJuego();
            } else if (opcion2 == 3) {
                this.darAsistencia();
            } else if (opcion2 == 4) {
                this.correr();
            } else if (opcion2 == 5) {
                this.pasarBalon();
            } else {
                this.hacerGol();
            }
        }

    }

    public void recuperarBalon() {
        System.out.printf("El jugador %s  %s ha recuperado el balon de manera espectacular %n", this.posicion, this.nombre);
    }

    public void crearJuego() {
        System.out.printf("El jugador %s  %s Crea un juego de manera Facinante %n", this.posicion, this.nombre);
    }

    public void darAsistencia() {
        System.out.printf("El jugador %s  %s Dio una asistencia q proboco elgol de la victoria %n", this.posicion, this.nombre);
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
}
