import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio");
        double radio = scanner.nextDouble();
        System.out.printf("El area De Un Circulo Es: %.2f", circuloArea(radio));
    }

    public static double circuloArea(double radio) {
        return Math.PI * radio * radio;
    }
}
