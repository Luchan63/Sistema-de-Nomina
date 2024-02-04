public class EmpleadoBaseMasComision extends Empleado
{
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String numeroSeguridadsocial, double salarioBase) {
        super(nombre, apellido, numeroSeguridadsocial);

        if (salarioBase < 0.0)
        {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;

    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
        {
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
            return salarioBase;
        }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %.2f",super.toString(),"salarioBase", this.salarioBase);
    }
}
