//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public abstract class Jugador {
    protected String nombre;
    protected String posicion;
    protected String equipo;
    protected int edad;
    protected int numCamiseta;

    public Jugador() {
    }

    protected abstract void correr();

    protected abstract void pasarBalon();

    protected abstract void hacerGol();
}
