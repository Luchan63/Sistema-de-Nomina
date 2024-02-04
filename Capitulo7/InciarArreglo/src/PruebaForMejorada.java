// Fig. 7.12: PruebaForMejorado.java
//  Uso de la instrucción for mejorada para sumar el total de enteros en un arreglo.

public class PruebaForMejorada
{
    public static void main(String[] args)
    {
        int[] arreglo = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        // suma el valor de cada elemento al total
        for (int numero: arreglo) { // nueva forma de sumar y asignar el valor del arreglo a una variable
            total += numero; // sumamos al total
        }
            System.out.printf("Total de elementos del arreglo: %d%n",total);
    } // fin de clase main
}//fin de la clase Prueba
