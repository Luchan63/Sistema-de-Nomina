import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente");
        int exponente = sc.nextInt();
        int resultado = enteroPotencia(base, exponente);
        System.out.println("" + base + " Elevado al " + exponente + " el resutado es: " + resultado);
    }

    public static int enteroPotencia(int base, int exponente) {
        int result = 1;

        for(int i = 0; i < exponente; ++i) {
            result *= base;
        }

        return result;
    }
}
