//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class Inventario {
    private String[] productos = new String[1];
    private int cantidadProducto;
    private Scanner entrada;

    public void seleccion() {
        System.out.println("Seleccione una Produto\n1: Agregar Producto\n2: Eliminar Producto");
        int seleccion = this.entrada.nextInt();
        switch (seleccion) {
            case 1:
                this.agregarProducto();
                break;
            case 2:
                this.eliminarProducto();
                break;
            default:
                System.out.println("opcion no valida");
        }

    }

    Inventario() {
        this.entrada = new Scanner(System.in);
        System.out.print("Ingres el Producto: ");
        String nombreProducto = this.entrada.next();
        this.cantidadProducto = this.productos.length;
        this.productos[0] = nombreProducto;
        System.out.println(this.productos[0]);
    }

    public void agregarProducto() {
        System.out.print("Agrega un Producto: ");
        String nombreProducto = this.entrada.next();
        if (this.productos[this.productos.length - 1] != null) {
            this.productos = Arrays.copyOf(this.productos, this.productos.length * 2);
        }

        this.productos[this.cantidadProducto] = nombreProducto;
        ++this.cantidadProducto;
    }

    public void mostrarProductos() {
        System.out.println("los prducto son: ");
        String[] var1 = this.productos;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String item = var1[var3];
            System.out.println(item);
        }

    }

    public void eliminarProducto() {
        System.out.print("Que Producto quieres Eliminar: ");
        String nombreProducto = this.entrada.next();
        String[] var2 = this.productos;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String item = var2[var4];
            if (item.equalsIgnoreCase(nombreProducto)) {
                --this.cantidadProducto;
                System.out.println(item + " se ha eliminado");
            }
        }

    }
}
