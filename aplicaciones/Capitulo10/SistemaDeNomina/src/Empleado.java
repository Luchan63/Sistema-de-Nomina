//fig 10.4
public abstract class Empleado
{
    private final String nombre;
    private final String apellido;
    private final String numerSeguridadSocial;


    public Empleado(String nombre, String apellido,
                    String numerSeguridadSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerSeguridadSocial = numerSeguridadSocial;
    }

        // get nombre
    public String getNombre() {
        return nombre;
    }
        // get apellido
    public String getApellido() {
        return apellido;
    }
        // get nnss
    public String getNumerSeguridadSpcial() {
        return numerSeguridadSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s",this.getNombre(),
                this.getApellido(),this.getNumerSeguridadSpcial());
    }

    //metodo abstracto sobreescrito por la subClases concretas
    public abstract double ingreso(); // aqui ni hay implementacion
} // fin de bstracta empleado
