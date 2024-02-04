//ejercicio 7.12
import java.util.Scanner;

public class EliminacionDeDuplicado
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    final int TEMANO_ARREGLO = 5;
    int[] arreglo = new int[TEMANO_ARREGLO];
    int contador = 0;

        System.out.println("ingrese cinco numnero entre 10 y 100:");
    while (contador < TEMANO_ARREGLO){
        int numero = scan.nextInt();

        //verifica si el numero esta en el rango
        if (numero >= 10 && numero <= 100) {
            // verifica si el numero ya ha sido ingresado
            if (!contieneNumero(arreglo,contador,numero)) {
                arreglo[contador] = numero;
                contador++;
            } else {
                System.out.println("numero duplicado, Intente de nuevo");
            }
        } else {
            System.out.println("nuemero fuera del rango. intente denuevo");
        }
    }
    //muesyra los numeros unicos al final
        System.out.print("Numeros Unicos");
        for (int i = 0; i < contador; i++) {
            System.out.printf(" %d ",arreglo[i]);
        }
    }
    // metodo para comprobar si el numero se repite en el arreglo
    public static boolean contieneNumero(int[] arreglo,int longitud,int numero)
    {
        for (int i = 0; i < longitud; i++)
        {
            if (arreglo[i] == numero){
                return true;
            }
        }
        return false;
    }
}
