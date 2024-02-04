// Fig. 7.22: ManipulacionesArreglos.java
// Métodos de la clase Arrays y System.arraycopy.
import java.util.Arrays;

public class ManipulacionDeArreglos
{
    public static void main(String[] args)
    {
        //ordena arregloDouble en forma ascendentes
        double[] arregloDouble = {8.4,9.3,0.2,7.9,3.4};
        Arrays.sort(arregloDouble);
        System.out.printf("%narregloDouble: ");

        for (double valor : arregloDouble)
        {
            System.out.printf("%.1f ",valor);
        }

        // llena un arreglo de 10 elementos con 7
        int[] arregloIntLleno = new int[10];
        Arrays.fill(arregloIntLleno,7);
        mostraArreglo(arregloIntLleno, "arregloIntLleno");


        //copia el arreglo arregloInt en el arreglo copiaArregloInt
        int[] arregloInt = {1,2,3,4,5,6};
        int[] copiaArregloint = new int[arregloInt.length];
        System.arraycopy(arregloInt,0,copiaArregloint,0,arregloInt.length);
        mostraArreglo(arregloInt, "arregloInt");
        mostraArreglo(copiaArregloint, "copiaArregloInt");

        //compara si un arregloInt y copiaArregloInt son iguales
        boolean b = Arrays.equals(arregloInt,copiaArregloint);
        System.out.printf("%n%narregloInt %s copiaArregloInt%n",(b ? "==" : "!="));

        // compara si arregloInt y arregloIntLleno son iguales
        b = Arrays.equals(arregloInt,arregloIntLleno);
        System.out.printf("arregloInt %s arregloIntLlno%n", (b ? "==" : "!="));

        //busca en arregloInt el valor 5
        int ubicacion = Arrays.binarySearch(arregloInt,5);

        if (ubicacion >= 0){
            System.out.printf("Se encontro 5 en el elmento %d de arregloInt%n",ubicacion);
        } else {
            System.out.println("no se encontro el 5 en arregloInt");
        }
    }
    //imprime los valores de cada arreglo
    public static void mostraArreglo(int[] arreglo, String descripcion)
    {
        System.out.printf("%n%s: ",descripcion);

        for (int valor : arreglo)
        {
            System.out.printf("%d ",valor);
        }
    }
}
