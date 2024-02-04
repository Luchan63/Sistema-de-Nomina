//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PruebaFrecuenciaCardiaca {

    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        Main frecuencia1 = new Main();
        System.out.print("Nombre: ");
        String nombre = scam.nextLine();
        frecuencia1.setNombre(nombre);
        System.out.print("Apellido: ");
        String apellido = scam.nextLine();
        frecuencia1.setApellido(apellido);
        System.out.println("dia: mes: año: ");
        int dia = scam.nextInt();
        int mes = scam.nextInt();
        int anio = scam.nextInt();
        frecuencia1.setDia(dia);
        frecuencia1.setMes(mes);
        frecuencia1.setAnio(anio);
        System.out.println("Indique su Edad");
        int edad = scam.nextInt();
        frecuencia1.getEdad();
        System.out.println("---------------------------------------------------");
        System.out.println("Nombre de Paciente: " + nombre + " " + apellido);
        System.out.println("Fecha de Nacimoento: " + dia + "/" + mes + "/" + anio);
        frecuencia1.mostrarEdad();
        frecuencia1.mostrarFrecuenciaMaxima();
        frecuencia1.IntervaloDfrecuenciacardiacaEsperada();
    }
}
