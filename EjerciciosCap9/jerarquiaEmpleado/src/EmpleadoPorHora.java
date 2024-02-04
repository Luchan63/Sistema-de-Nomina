public class EmpleadoPorHora extends Empleado
{
    private double horasTrabajadas;
    private double sueldoPorHora;

    public EmpleadoPorHora(String nombre, String apellido, String numeroSeguridadsocial, double horasTrabajadas, double sueldoPorHora) {
        super(nombre, apellido, numeroSeguridadsocial);

        // verificamos si las horas trabajadas estan dentro del rango
        if (horasTrabajadas >= 0 && horasTrabajadas <= 168)
        {
        this.horasTrabajadas = horasTrabajadas;
        } else {
            throw new IllegalArgumentException("Las horas trabajadas deben estar entre 0 y 168");
        }

        // verificamos si el sueldo esta dentro del rango
        if (sueldoPorHora >= 0)
        {
        this.sueldoPorHora = sueldoPorHora;
        } else {
            throw new IllegalArgumentException("El sueldo debe ser mayor que 0");
        }
    }

    // set y get de horas trabajadas
    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas >= 0 && horasTrabajadas <= 168)
        {
            this.horasTrabajadas = horasTrabajadas;
        } else {
            throw new IllegalArgumentException("El sueldo debe ser mayor que 0");
        }
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    // set y get de sueldo por horas

    public void setSueldoPorHora(double sueldoPorHora) {
        if (sueldoPorHora >= 0)
        {
            this.sueldoPorHora = sueldoPorHora;
        } else {
            throw new IllegalArgumentException("El sueldo debe ser mayor que 0");
        }
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    @Override
    public double ingreso() {
        if (horasTrabajadas <= 40)
        {
            return this.horasTrabajadas * this.sueldoPorHora;
        } else {
            return 40 * this.sueldoPorHora + (horasTrabajadas - 40) * 1.5 * this.sueldoPorHora;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado Por Horas: %n%s%n %s: %.2f%n%s: %.2f",super.toString(),"Horas trabajadas",this.getHorasTrabajadas(),"Sueldo por horas",this.getSueldoPorHora());
    }
}
