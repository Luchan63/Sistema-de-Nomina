// Fig. 9.11: EmpleadoBaseMasComision.java
// La clase EmpleadoBaseMasComision representa a un empleado que recibe un salario base, además de la comisión.

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
        private double salarioBase; // salario base por semanas

        // contructor con cinco argumentos
        public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguridadSocial, double ventasBrutas, double tarifaComision, double salarioBase)
        {
            // la llamada explicita al contructor de la superclase de EmpleadoPorComusion
            super(primerNombre,apellidoPaterno,numeroSeguridadSocial,ventasBrutas,tarifaComision);

            if (salarioBase < 0.0)
            {
                throw new IllegalArgumentException("El salario base debe ser >= 0.0");
            }
            this.salarioBase = salarioBase;
        } // fin del contructor

        // set y get de salario base
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

        // calcula los ingresos
        @Override // indica que este metodo sobreescribe al metodo de la super clase
        public double ingresos()
        {
            return this.getSalarioBase() + super.ingresos();
        }

        // devuelve representacion en String de objeto EmpleadoBaseMasComision
        @Override
        public String toString() {
            return String.format("%s %s%n%s: %.2f","con sueldo base",
                    super.toString(),"Sueldo base",this.getSalarioBase());
        }
    } //fin de la clase empleadoPorComision
