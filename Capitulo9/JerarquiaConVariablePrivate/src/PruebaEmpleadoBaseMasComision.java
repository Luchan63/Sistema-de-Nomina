public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args)
    {
        try {
            // crea instancia de Objto EmpleadoPorComision
            EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Luis", "Figuereo", "1520-56-7895", 1000, .06,300);

            // get datos del mapa por comision
            System.out.println("informacion del empleado obtenida por los metodos establecer");
            System.out.printf("%n%s %s:%n", "el primer nombre es", empleado.getPrimerNombre());
            System.out.printf("%s %s:%n", "el primer nombre es", empleado.getApellidoPaterno());
            System.out.printf("%s %s:%n", "el primer nombre es", empleado.getNumeroSeguridadSocial());
            System.out.printf("%s %.2f:%n", "Las ventas brutas son", empleado.getVentasBrutas());
            System.out.printf("%s %.2f:%n", "La tarifa por comision es", empleado.getTarifaComision());

            empleado.setSalarioBase(1000);

            System.out.printf("%n%s:%n%n%s%n","Informacion actualizada del empleado, obtenida por toString",empleado);
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}