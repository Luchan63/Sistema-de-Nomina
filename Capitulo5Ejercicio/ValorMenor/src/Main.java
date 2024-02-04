import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = entrada.nextInt();
        if (numero <= 0) {
            System.out.println("ingresa un numero positivo valido");
        }

        int menorValor = Integer.MAX_VALUE;

        for(int i = 0; i <= numero; ++i) {
            System.out.println("ingrese el # " + i + ": ");
            int valor = entrada.nextInt();
            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("el menor valor ingresado es: " + menorValor);
        entrada.close();
    }
}