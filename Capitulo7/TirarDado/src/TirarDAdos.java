//fig 7.7
// Programa para tirar dados que utiliza arreglos en vez de switch.
import java.security.SecureRandom;

public class TirarDAdos
{
    public static void main(String[] args)
    {
        SecureRandom numAleatorios = new SecureRandom();
        int[] frecuencia = new int[7]; // arreglo de contadores de frecuencia

        //tira el dado 6.000.000 de veces: usa el valor del dado como indice de frecuencia
        for (int tiro = 1; tiro < 6000000 ; tiro++)
            ++frecuencia[1+ numAleatorios.nextInt(6)];

        System.out.printf("%s%10s%n", "Cara", "Frecuencia");

        // imprime el valor de cada elemento del arreglo
        for (int cara = 1; cara < frecuencia.length ; cara++)
            System.out.printf("%4d%10d%n", cara, frecuencia[cara]);

    }
}
