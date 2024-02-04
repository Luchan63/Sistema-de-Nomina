// Fig. 7.24: ColeccionArrayList.java
// Demostración de la colección de genéricos ArrayList.
import java.util.ArrayList;

public class ColeecionArrayList
{
    public static void main(String[] args)
    {
        // crea un nuevo objeto arrayList de objeto string con una capacidad inical de 10
        ArrayList <String> elementos = new ArrayList<>();

        elementos.add("rojo"); // adjunta un elemento a la lista
        elementos.add(0,"amarillo"); // inserta amarillo en el indice 0

        //encabezado
        System.out.print("Mostrar contenidp de lista con ciclo controlado por contador: ");


        // muestra los colores de la lista
        for (int i = 0; i < elementos.size(); i++)
        {
            System.out.printf(" %s",elementos.get(i));
        }

        //muestra colores usando for en el metodo mostrar
        mostrar(elementos, "\nMostrar contenido de lista con instruccion for mrjorada:");

        elementos.add("verde"); // agrega verde al final de la lista
        elementos.add("amarillo"); // agrega amarillo al final de la lista
        mostrar(elementos, " lista con dos nuevos elementos:");

        elementos.remove("amarillo"); // elimina el primer amarillo
        mostrar(elementos, " elimina primera instancia de amarillo:");

        elementos.remove(1); // elimina elementos en subIndices 1
        mostrar(elementos, " elimina el segundo elemento de la lista (verde):");

        //verifica si hay un valor en la lista
        System.out.printf("\"rojo\" %sesta de la lista%n", elementos.contains("rojo") ? "" : "no ");

        //muestra el nuemero de elementos en la lista
        System.out.printf("Temario: %s%n",elementos.size());
    } // fin del main
        //muestra los elementos de arrayList en la consola
    public static void mostrar(ArrayList<String> elementos, String encabezado)
    {
        System.out.print(encabezado); // muestra encabezado

        // muestra cada elemento en elementos
        for (String elemento : elementos)
        {
            System.out.printf("%s ",elemento);
        }
        System.out.println();
    }
}
