//ejercicio 7.3
public class Francciones {
    private static final int TEMARIO_ARREGLO = 10;
    public static void main(String[] args)
    {
        double total = 0.0;
      double[] fracciones = new double[TEMARIO_ARREGLO];

      fracciones[4] = fracciones[9];
      fracciones[9] = 1.667;
      fracciones[6] = 3.333;

        for (int x = 0; x < fracciones.length; x++)
        {
            total += fracciones[x];
        }
        System.out.printf("%f ",total );
    }
}