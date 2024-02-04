
import java.util.Scanner;

public class EncuentraElminimo {
    public EncuentraElminimo() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa 3 numero");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int minimo = minimo3(num1, num2, num3);
        System.out.println("Elminimo de los 3 es: " + minimo);
    }

    public static int minimo3(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}
