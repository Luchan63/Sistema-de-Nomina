public class Coche {
    private  int id;
    private  String marca;
    private  String modelo;
    private int anio;

    private boolean esBorrado;
    private String color;

    public Coche( String marca, String modelo, int anio,String color)
    {
        this.id = 0;
        this.marca = marca;
        this.modelo =modelo;
        this.anio = anio;
        this.color = color;
        this.esBorrado = false;
    }

    // set y get de id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // set y get marca

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // set get anio
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    // set get modelo

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    // set y get color

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // set y get de borrado

    public boolean isEsBorrado() {
        return esBorrado;
    }

    public void setEsBorrado(boolean esBorrado) {
        this.esBorrado = esBorrado;
    }

    @Override
    public String toString() {
        return String.format("%-4d %-20s %-15s %-6d %-10s", id, marca, modelo, anio, color);
    }
}
