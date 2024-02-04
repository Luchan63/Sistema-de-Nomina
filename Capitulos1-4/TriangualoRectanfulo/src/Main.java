//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hipotenusa");
        int hipotenusa = sc.nextInt();
        System.out.println("Ingresa la catetoa ");
        int catetoa = sc.nextInt();
        System.out.println("Igrese la catetob ");
        int catetob = sc.nextInt();
        if (catetoa * catetoa + catetob * catetob == hipotenusa * hipotenusa) {
            System.out.println("podria ser un TrianguloRectangulo");
        } else {
            System.out.println("no es un TrianguloRectangular");
        }

    }
}
