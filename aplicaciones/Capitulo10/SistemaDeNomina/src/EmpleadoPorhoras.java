//fig 10.6
public class EmpleadoPorhoras extends Empleado
{
    private double hora;
    private double sueldo;

    public EmpleadoPorhoras(String nombre, String apellido, String numerSeguridadSocial, double hora, double sueldo) {
        super(nombre, apellido, numerSeguridadSocial);

        //VERIFICAMOS HORA
        if (hora < 0.0 || hora > 168.0){
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }
        this.hora = hora;

        // verificamos el sueldo
        if (sueldo < 0)
        {
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");
        }
        this.sueldo = sueldo;
    }

    // set y get de hora
    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        if (hora < 0.0 || hora > 168.0){
            throw new IllegalArgumentException("Las horas trabajadas deben ser >= 0.0 y <= 168.0");
        }
        this.hora = hora;
    }

    // set y get de sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public double ingreso()
    {
       if (getHora() <= 40) // no hay tiempo extra
       {
        return this.getSueldo() * this.getHora();
       } else
       {
           return 40 * this.getSueldo() + (40 - this.getHora()) * this.getSueldo() * 1.5;
       }
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s%n%s: $%.2f%n%s: %.2f",super.toString(),"sueldo por horaa", getSueldo(),
                "Horas trabajadas",getHora());
    }
}
