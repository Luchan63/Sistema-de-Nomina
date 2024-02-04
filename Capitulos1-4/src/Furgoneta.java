//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    Furgoneta(String marca, String modelo, int anioFabricacion, double precio, double capacidadCarga) {
        super(marca, modelo, anioFabricacion, precio);
        this.capacidadCarga = capacidadCarga;
    }

    public void cargaMecanica() {
        System.out.println("Caraga Maxima: " + this.capacidadCarga);
    }
}
