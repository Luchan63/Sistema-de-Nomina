//ejercicio 7.29 fibonacci con arreglo
import java.util.Scanner;
public class SerieFibonacci
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("ingresa el valor de n");
        int n = scan.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++)
        {
               fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" la serie fibonacci de " + n + " es: " + fibonacci[i]);
        }
    }
}
