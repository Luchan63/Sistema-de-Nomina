import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa el lado1");
        double lado1 = sc.nextDouble();
        System.out.print("Ingresa el lado2");
        double lado2 = sc.nextDouble();
        System.out.println("" + lado1 + " lado2 " + lado2 + " hipotenusa " + hipotenusa(lado1, lado2));
    }

    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(lado1 * lado1 + lado2 * lado2);
    }
}
