//ejercicio 7.17
import java.util.Random;

public class TirarDados
{
    public static void main(String[] args)
    {
        // arreglo para la frecuencia de la suma
        int[] frecuencia = new int[13];// indice 2 a 12(ambos inclusive)

        Random numAleatorio = new Random(); // objeto random para simular el tiro de dados
        // simula el tiro del dado  y registra las sumas
        for (int tiro = 0; tiro < 360000000; tiro++)
        {
            int dado1 = 1 + numAleatorio.nextInt(6); // valor del dado1 (1a6)
            int dado2 = 1 + numAleatorio.nextInt(6); // valor del dado 2(1a6)
            int suma = dado1 + dado2; // calcula el valor de los dados
            frecuencia[suma]++; // incrementa la frecuencia de esa suma
        }
        // mostramos los resultados en formato tabular
        System.out.printf("%-8s%-12s%n", "Suma", "Frecuencia");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%-8d%-12d%n", i,frecuencia[i]);
        }
    }
}
