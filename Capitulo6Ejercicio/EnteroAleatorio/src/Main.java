import java.security.SecureRandom;

public class Main
{
    public static void main(String[] args) {
        SecureRandom enteroAleatorio = new SecureRandom();
        int x = 1 + enteroAleatorio.nextInt(2);
        int x2 = 1 + enteroAleatorio.nextInt(100);
        int x3 = enteroAleatorio.nextInt(9);
        int x4 = 1000 + enteroAleatorio.nextInt(113);
        int x5 = -1 + enteroAleatorio.nextInt(2);
        int x6 = -3 + enteroAleatorio.nextInt(11);
        System.out.printf("x %d%n", x);
        System.out.printf("X2 %d%n", x2);
        System.out.printf("X3 %d%n", x3);
        System.out.printf("X4 %d%n", x4);
        System.out.printf("X5 %d%n", x5);
        System.out.printf("X6 %d%n", x6);
    }
}
