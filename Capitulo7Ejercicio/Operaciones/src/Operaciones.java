//ejercicio 7.11
public class Operaciones
{
    public static void main(String[] args)
    {
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]= 0;
        System.out.printf("%d%n ", arreglo[i]);
        }
        System.out.println("-----------------------");
        int[] bono = {20,5,2,4,5,2,3,6,9,8,1,2,25,4,58};
        for (int i = 0; i < bono.length; i++) {
            bono[i]++;
            System.out.printf("%d%n",bono[i]);
        }
        System.out.println("-----------------------");
        int[] mejoresPuntuaciones = {7,20,55,63,98};

        for (int contador = 0; contador < mejoresPuntuaciones.length; contador++) {
            System.out.printf("%d ",mejoresPuntuaciones[contador]);
        }
    }
}
