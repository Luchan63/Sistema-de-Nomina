//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public static Scanner scan;

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("------Menu Principal ------");
        System.out.println("1- Crear Alumnos");
        System.out.println("2- Listar Alumnos");
        System.out.println("3- Actualizar Alumnos");
        System.out.println("4- Eliminar Alumnos");
        System.out.println("5- Cargar Datos De Ejemplos");
        System.out.println("0- salir");
        System.out.println("Seleccione una opcion");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("hola");
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
        }
    }

    public static void CrearAlumno() {
    }

    static {
        scan = new Scanner(System.in);
    }
}
