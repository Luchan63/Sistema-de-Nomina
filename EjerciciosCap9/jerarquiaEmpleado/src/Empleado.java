//ejercicio 9.14
public class Empleado
{
    //variables heredadas
    private final String nombre;
    private final String apellido;
    private final String numeroSeguridadsocial;

    // contructor de la super clase
    public Empleado(String nombre, String apellido, String numeroSeguridadsocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguridadsocial = numeroSeguridadsocial;
    }

    // get nombre
    public String getNombre() {
        return nombre;
    }

    // get apellido
    public String getApellido() {
        return apellido;
    }

    // get seguridad social

    public String getNumeroSeguridadsocial() {
        return numeroSeguridadsocial;
    }

    // metodo para el ingreso
    public double ingreso()
    {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %s","nombre",this.nombre,"apellido",this.apellido,"numero de Seguridad social",this.numeroSeguridadsocial);
    }
}
