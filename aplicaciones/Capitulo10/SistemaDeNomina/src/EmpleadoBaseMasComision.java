// fig 10.8
public class EmpleadoBaseMasComision extends EmpleadoPorComision
{

    private double salarioBase; // salario base por semana

    // contructor
    public EmpleadoBaseMasComision(String nombre, String apellido, String numerSeguridadSocial, double ventasBrutas, double tarifaPorComision, double salarioBase) {
        super(nombre, apellido, numerSeguridadSocial, ventasBrutas, tarifaPorComision);

        if (salarioBase < 0.0)
        {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    // get y set de salario base
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
        {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    @Override
    public double ingreso() {
        return getSalarioBase() +  super.ingreso();
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s: $%,.2f","Con Salario base",
                super.toString(),"Salario base", getSalarioBase());
    }
}
