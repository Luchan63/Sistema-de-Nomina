// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Coche extends Vehiculo {
    private int numeroPuertas;

    Coche(String marca, String modelo, int anioFabricacion, double precio, int numeroPuertas) {
        super(marca, modelo, anioFabricacion, precio);
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirMaletero() {
        System.out.println("maletero abierto: si ");
    }
}
