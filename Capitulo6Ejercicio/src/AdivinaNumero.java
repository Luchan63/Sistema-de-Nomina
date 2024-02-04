import java.security.SecureRandom;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        SecureRandom numAleatorio = new SecureRandom();
        int num = 1 + numAleatorio.nextInt(1000);
        System.out.println("Bienvenido al juego adivine el numero");
        System.out.println(num);

        int num1;
        do {
            System.out.print("adivine un numero entre 1 y 1000");
            num1 = scanner.nextInt();
            ++intentos;
            if (num1 > num) {
                System.out.println("Es demasiado alto, Intente de nuevo");
            } else if (num1 < num) {
                System.out.println("Es demasiado bajo, Intente de nuevo");
            } else {
                System.out.println("Felicidades adivino el numero");
                System.out.println("el numero de intentos es: " + intentos);
            }
        } while(num1 != num);

        if (intentos > 10) {
            System.out.println("Deberia hacerlo mejor!");
        } else if (intentos < 10) {
            System.out.println("! o ya sabia usted el secreto, o tuvo suerte");
        } else {
            System.out.println("!aja¡ sabia usted el secreto");
        }

    }
}
