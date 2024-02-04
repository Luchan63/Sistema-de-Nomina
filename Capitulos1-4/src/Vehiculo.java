public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected double precio;

    Vehiculo(String marca, String modelo, int anioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anioFabricacion);
        System.out.println("Precio: " + this.precio + "$");
    }

    public void arrancar() {
        System.out.println("El vehiculo Esta Arrancado");
    }
}
