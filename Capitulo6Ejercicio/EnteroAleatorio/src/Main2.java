import java.security.SecureRandom;

public class Main2
{

    public static void main(String[] args) {
        SecureRandom aleatorio = new SecureRandom();
        int x = 2 + 2 * aleatorio.nextInt(5);
        System.out.printf("x es: %d%n", x);
        System.out.println();
        int x2 = 3 + 2 * aleatorio.nextInt(5);
        System.out.printf("%d%n", x2);
        System.out.println();
        int x3 = 6 + 4 * aleatorio.nextInt(5);
        System.out.printf("%d%n", x3);
    }
}
