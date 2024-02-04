import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero 1 a 99999");
        int numero = scanner.nextInt();
        mostrarDigito(numero);
    }

    public static int calculaParteEntera(int a, int b) {
        return a / b;
    }

    public static int calcularResiduo(int a, int b) {
        return a % b;
    }

    public static void mostrarDigito(int numero) {
        int numero1 = 0;

        for(int base = 1; numero > 0; base *= 10) {
            int digito = calcularResiduo(numero, 10);
            numero1 += digito * base;
            numero = calculaParteEntera(numero, 10);
        }

        System.out.println(numero1);
    }
}
