import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero");
        int num1 = entre.nextInt();
        System.out.print("Ingrese el segundo numero entero");
        int num2 = entre.nextInt();
        boolean esMultiplo = esMultiplo(num1, num2);
        System.out.printf("El numero %d  es Multiplo de %d : %b", num2, num1, esMultiplo);
    }

    public static boolean esMultiplo(int num1, int num2) {
        return num2 % num1 == 0;
    }
}
