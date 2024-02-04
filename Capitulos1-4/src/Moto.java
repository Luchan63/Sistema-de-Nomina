//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Moto extends Vehiculo {
    private boolean cascoRequerido;

    Moto(String marca, String modelo, int anioFabricacion, double precio, boolean cascoRequerido) {
        super(marca, modelo, anioFabricacion, precio);
        this.cascoRequerido = cascoRequerido;
    }

    public void ponerCasco() {
        System.out.println("Poner Casco: " + this.cascoRequerido);
    }
}
