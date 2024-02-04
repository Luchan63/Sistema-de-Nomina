public class Prueba {
    public static void main(String[] args)
    {
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(1000.00);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("luis","figuereo","1111-11-111",1000,0.1, empleadoBaseMasComision);
        System.out.println(empleadoPorComision);
    }
}