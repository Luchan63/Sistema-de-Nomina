// EJERCICIO 9.14
public class EmpleadoPorComision extends Empleado
{
    // variables locales
    private double ventasBrutas;
    private double tarifaComision;

    // contructor que herada la clase empleado y sus variabkes locales
    public EmpleadoPorComision(String nombre, String apellido, String numeroSeguridadSocial, double ventasBrutas , double tarifaComision)
    {
        // aqui se heradan las clases locale de la herencia
        super(nombre,apellido,numeroSeguridadSocial);

        // si ventas no es valida, lanza un error
        if (ventasBrutas < 0.0)
        {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0");
        }

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
        {
            throw new IllegalArgumentException("la tarifa de ser > 0.0 y < 1.0");
        }

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
        // set y get
    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0)
        {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0");
        }
        this.ventasBrutas = ventasBrutas;
    }
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    // set y get de tarifa por comision

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
        {
            throw new IllegalArgumentException("la tarifa de ser > 0.0 y < 1.0");
        }
        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }
    @Override
    public double ingreso()
    {
       return this.getTarifaComision() * this.getVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("%s %n%s: %.2f%n%s: %.2f",super.toString(), "ventas brutas",this.getVentasBrutas());
    }
}
