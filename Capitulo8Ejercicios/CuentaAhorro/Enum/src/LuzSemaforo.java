//ejercicio 8.10
public enum LuzSemaforo {
    ROJO(30), // duracion segundo
    VERDE(45),
    AMARILLO(5);

    private final int duracion; // duracion de la luz en segundo

    // contructor privado
    private LuzSemaforo(int duracion)
    {
        this.duracion = duracion;
    }

    // metodo get duracion
    public int getDuracion()
    {
        return duracion;
    }
}
