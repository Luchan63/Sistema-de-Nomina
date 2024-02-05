//fig 10.7
public class EmpleadoPorComision extends Empleado
{
    private double ventasBrutas; // ventas totales por semana

    private double tarifaPorComision; // porcentaje de comision

    // contructor
    public EmpleadoPorComision(String nombre, String apellido, String numerSeguridadSocial, double ventasBrutas, double tarifaPorComision) {
        super(nombre, apellido, numerSeguridadSocial);
        if (tarifaPorComision <= 0.0 || tarifaPorComision >= 1.0) // valida
        {
             throw new IllegalArgumentException(
                 "La tarifa de comision debe ser > 0.0 y < 1.0");
        }
         if (ventasBrutas < 0.0) {
             throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
         }

        this.ventasBrutas = ventasBrutas;
        this.tarifaPorComision = tarifaPorComision;
    }
    // get y set de ventas brutas
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }

    // get y set de tarifa por comision
    public double getTarifaPorComision() {
        return tarifaPorComision;
    }

    public void setTarifaPorComision(double tarifaPorComision) {
        if (tarifaPorComision <= 0.0 || tarifaPorComision >= 1.0) // valida
        {
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0");
        }
        this.tarifaPorComision = tarifaPorComision;

    }
    @Override
    public double ingreso() {
        return getTarifaPorComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f","Empleado por comision",super.toString(),"Ventas Brutas", getVentasBrutas(),"Tarifa por comision",getTarifaPorComision());
    }
}
