public class PruebaEmpleadoPorHoras
{
    public static void main(String[] args)
    {
        EmpleadoPorHora empleado = new EmpleadoPorHora("luis","figuereo","1233647",5,10.00);
        System.out.println(empleado);


        System.out.println("salario por hora: " + empleado.ingreso());
    }
}
