
public class Empleado {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;

    public Empleado(String nombre, String apellido, Fecha fechaNacimiento, Fecha fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    public String toString() {
        return String.format("%s, %s Contratado: %s Cumpleaños: %s", this.apellido, this.nombre, this.fechaContratacion, this.fechaNacimiento);
    }
}
