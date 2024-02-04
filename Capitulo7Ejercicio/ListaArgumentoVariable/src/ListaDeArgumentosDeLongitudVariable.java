//ejercicio 7.14
public class ListaDeArgumentosDeLongitudVariable
{
    public static double calculo(double... numeros)
    {
        double total = 0.0;

        // calcula el total usando la instruccion for mejorada
        for (double numero : numeros )
        {
            total += numero;
        }
        return total;
    }
    public static void main(String[] args)
    {
        double numero1 = 500.0;
        double numero2 = 50.0;
        double numero3 = 580.0;
        double numero4 = 20.0;
        double numero5 = 7000.0;
        double numero6 = 890.0;

        System.out.printf("numero1 = %.1f%nnumero2 = %.1f%nnumero3 = %.1f%nnumero4 = %.1f%nnumero5 = %.1f%nnumero6 = %.1f%n%n",numero1,numero2,numero3,numero4,numero5,numero6);

        System.out.printf("El calculo de numero1 y numero2 es: %.1f%n",calculo(numero1,numero2));
        System.out.printf("El calculo de numero1,  numero2 y numero3 es: %.1f%n",calculo(numero1,numero2,numero3));
        System.out.printf("El calculo de numero1,  numero2, numero3 y numero4 es: %.1f%n",calculo(numero1,numero2,numero3,numero4));
        System.out.printf("El calculo de numero1,  numero2, numero3, numero4 y numero5 es: %.1f%n",calculo(numero1,numero2,numero3,numero4,numero5));
        System.out.printf("El calculo de numero1,  numero2, numero3, numero4, numero5 y numero6 es: %.1f%n",calculo(numero1,numero2,numero3,numero4,numero5,numero6));

    }
}
