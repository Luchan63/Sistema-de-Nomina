//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class PruebaMain {
    public PruebaMain() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("elige una posicion\n1- delantero\n2- Centro Campista\n3- Defensa\n4- Portero");
        int elegir = scan.nextInt();
        switch (elegir) {
            case 1:
                DelanteroEstrella delantero = new DelanteroEstrella();
                System.out.println("------------------------------------");
                delantero.mostrarInformacion();
                System.out.println("------------------------------------");
                delantero.elegirOpcion();
                break;
            case 2:
                CentroCampistaCreativo centroCampista = new CentroCampistaCreativo();
                centroCampista.mostrarInformacion();
                System.out.println("------------------------------------");
                centroCampista.elegirOpcion();
                break;
            case 3:
                DefensorSolido defensor = new DefensorSolido();
                defensor.mostrarInformacion();
                System.out.println("------------------------------------");
                defensor.elegirOpcion();
                break;
            case 4:
                PorteroSolido portero = new PorteroSolido();
                portero.mostrarInformacion();
                System.out.println("------------------------------------");
                portero.elegirOpcion();
                break;
            default:
                System.out.println("elija una opcion correcta");
        }

    }
}
