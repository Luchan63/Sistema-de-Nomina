//ejercicio 7.8
public class Tarea
{
    public static void main(String[] args)
    {
        int[] arreglo = {5,4,6,9,8,7,5,4};
            System.out.println(arreglo[6]);
        System.out.println("-----------------------------");

        int[] arreglo2 = new int[5];
        for (int i = 0; i < arreglo2.length; i++)
        {
            arreglo2[i] = 8;
        }
        for (int contador = 0; contador < arreglo2.length; contador++) {
            System.out.println(arreglo2[contador] );
        }
        System.out.println("----------------------------");
        final int ARREGLO = 100;
        double[] arreglo3 = new double[ARREGLO];
        double total = 0.0;

        for (int i = 0; i < arreglo3.length; i++)
        {
            arreglo3[i]= total += i;

        }
        System.out.println(total);
        System.out.println("-----------------------------");
        int[] a = new int[11];
        int[] b = new int[34];
        System.arraycopy(a,0 , b, 0, a.length);
        for (int valor :  b){
            System.out.println(valor);
        }
        System.out.println("------------------------------");
        // creamos el arreglo con 99 elementos
        double[] arreglo4 = new double[99];
        // inicializamos mayor y menor del arreglo
        double mayor = arreglo4[0];
        double menor = arreglo4[0];

        // itereamos en el arreglo para asiganarle un valor
        for (int i = 0; i < arreglo4.length; i++)
        {
            arreglo4[i] = i + 1; // le asinamos un valor
            if (arreglo4[i] < menor){ // determinamos si es menor
                menor = arreglo4[i];
            }
            if (arreglo4[i] > mayor){ // determinamos si es mayor
                mayor = arreglo4[i];
            }
        }
        System.out.println("El arreglo menor es: " + menor);
        System.out.println("El arreglo mayor es: " + mayor);
    }
}
