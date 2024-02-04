
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> almacenFrutas = new ArrayList();
        almacenFrutas.add("banana");
        almacenFrutas.add("pera");
        almacenFrutas.add("mandarina");
        almacenFrutas.add("pina");
        almacenFrutas.add("mango");
        System.out.println("Frutas en almacen");
        Iterator var2 = almacenFrutas.iterator();

        String frutaEliminar;
        while(var2.hasNext()) {
            frutaEliminar = (String)var2.next();
            System.out.println(frutaEliminar);
        }

        Scanner eliminar = new Scanner(System.in);
        System.out.println("Que producto desea eliminar: ");
        frutaEliminar = eliminar.nextLine();
        if (almacenFrutas.contains(frutaEliminar)) {
            almacenFrutas.remove(frutaEliminar);
            System.out.println(frutaEliminar + " Ha sido elominado del almazon");
        } else {
            System.out.println(frutaEliminar + "No se encontro en el Almacen");
        }

        System.out.println("frutas del almacen actualizado");
        Iterator var4 = almacenFrutas.iterator();

        while(var4.hasNext()) {
            String frutas = (String)var4.next();
            System.out.println(frutas);
        }

    }
}
