import java.util.Scanner;

public class Main
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero");
            int a = scanner.nextInt();
            System.out.print("Ingrese un numero");
            int b = scanner.nextInt();
            System.out.println("La parte entera de " + a + "/" + b + ": " + calculaLaParteEntera(a, b));
            System.out.println("El residuo de " + a + "/" + b + "es: " + residuo(a, b));
        }

        public static int calculaLaParteEntera(int a, int b) {
            return a / b;
        }

        public static int residuo(int a, int b) {
            return a % b;
        }
    }
