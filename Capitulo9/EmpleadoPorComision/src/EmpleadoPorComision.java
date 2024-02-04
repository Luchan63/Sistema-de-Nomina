// fig 9.4
// La clase EmpleadoPorComision representa a un empleado que
// recibe como sueldo un porcentaje de las ventas brutas.
public class EmpleadoPorComision extends Object
{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguridadSocial;

    private double ventasBrutas; // ventas totales
    private double tarifaComision; // porcertanje de comision

    // contructor con cinco argumentos
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguridadSocial,double ventasBrutas , double tarifaComision)
    {
        // la llamada implicita al contructor predeterminado de Object ocurre aqui

        // si ventas no es valida, lanza un error
        if (ventasBrutas < 0.0)
        {
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0");
        }

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0)
        {
            throw new IllegalArgumentException("la tarifa de ser > 0.0 y < 1.0");
        }

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    } // fin del contructor

    // get de nombre
    public String getPrimerNombre() {
        return primerNombre;
    }

    // get apellido


    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    //  get numero de seguridad social

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    // set y get de ventas brutas

    public void setVentasBrutas(double ventasBrutas) {
       if (ventasBrutas < 0.0){
           throw new IllegalArgumentException("la ventas debe ser >= 0.0");
       }
             this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    // set y get tarifa de comision


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

    public double ingresos()
    {
        return tarifaComision * ventasBrutas;
    }

    // devuelve representacion en ´String de objeto EmpleadoporComision
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","Empleado por comision",this.primerNombre,this.apellidoPaterno,"Numero de Seguridad Social",this.numeroSeguridadSocial, "Ventas Brutas",this.ventasBrutas,"Tarifa por comision",this.tarifaComision);
    }
} //fin de la clase empleadoPorComision