//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("marca del coche: ");
        String marca = entrada.next();
        System.out.print("Modelo: ");
        String modelo = entrada.next();
        System.out.print("año del coche: ");
        int anio = entrada.nextInt();
        System.out.print("Precio: ");
        double precios = entrada.nextDouble();
        System.out.print("numero de puertas: ");
        int numeroPuertas = entrada.nextInt();
        Coche coche = new Coche(marca, modelo, anio, precios, numeroPuertas);
        coche.arrancar();
        coche.mostrarInformacion();
        coche.abrirMaletero();
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.print("marca de la Moto: ");
        String marca2 = scan.nextLine();
        System.out.print("Modelo: ");
        String modelo2 = scan.next();
        System.out.print("año del coche: ");
        int anio2 = entrada.nextInt();
        System.out.print("Precio: ");
        double precios2 = scan.nextDouble();
        System.out.print("Cascos Requeridos: ");
        boolean cascoRequerido = scan.nextBoolean();
        Moto moto = new Moto(marca2, modelo2, anio2, precios2, cascoRequerido);
        moto.ponerCasco();
    }
}
