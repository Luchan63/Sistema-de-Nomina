//figura10.5
public class EmpleadoAsalariado extends Empleado
{
    private double salarioSemanal;

    //contructor
    public EmpleadoAsalariado(String nombre, String apellido, String numerSeguridadSocial, double salarioSemanal) {
        super(nombre, apellido, numerSeguridadSocial);

        if (salarioSemanal < 0.0)
        {
            throw new IllegalArgumentException("El salarioSemanal noo debe ser negativo");
        }
        this.salarioSemanal = salarioSemanal;
    }
    // get y set de salario semanal
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
        {
            throw new IllegalArgumentException("El salarioSemanal noo debe ser negativo");
        }
        this.salarioSemanal = salarioSemanal;
    }
    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingreso() {
        return this.getSalarioSemanal();
    }

    //devuelve representación String de un objeto EmpleadoAsalariado

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s%n%s: $%,.2f",super.toString(),"Salario semanal",this.getSalarioSemanal());
    }
}
