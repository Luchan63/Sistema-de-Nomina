import java.util.Scanner;

// ejercicio 7.29 sin arreglo
public class Seriefibonacci2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el valor de n");
        int n = scan.nextInt();

        // calcula e imprime el enesimo numero de fibonacci
        System.out.println("el enesimo numero de fibonacci es: "+ fibonacci(n));

        encontrarMaximoFibonacci();

        scan.close();
    }
    // Método para calcular el enésimo número de Fibonacci usando int
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Método para encontrar el número de Fibonacci más grande que puede imprimirse en su sistema
    public static void encontrarMaximoFibonacci() {
        int n = 0;
        while (true) {
            try {
                int resultado = fibonacci(n);
                System.out.println("Fibonacci(" + n + ") = " + resultado);
                n++;
            } catch (Exception e) {
                // Captura de la excepción cuando se desborda el int
                System.out.println("El número de Fibonacci más grande para 'int' es: " + (n - 1));
                break;
            }
        }
    }
}
