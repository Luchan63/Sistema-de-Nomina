//fig 9.5
// programa de prueba de la clase EmpleadoPorComision
public class PruebaEpleadoPorComision
{
    public static void main(String[] args)
    {
      try {
          // crea instancia de Objto EmpleadoPorComision
          EmpleadoPorComision empleado = new EmpleadoPorComision("Luis", "Figuereo", "1520-56-7895", 1000, .06);

          // get datos del mapa por comision
          System.out.println("informacion del empleado obtenida por los metodos establecer");
          System.out.printf("%n%s %s:%n", "el primer nombre es", empleado.getPrimerNombre());
          System.out.printf("%s %s:%n", "el primer nombre es", empleado.getApellidoPaterno());
          System.out.printf("%s %s:%n", "el primer nombre es", empleado.getNumeroSeguridadSocial());
          System.out.printf("%s %.2f:%n", "Las ventas brutas son", empleado.getVentasBrutas());
          System.out.printf("%s %.2f:%n", "La tarifa por comision es", empleado.getTarifaComision());

          empleado.setVentasBrutas(500);
          empleado.setTarifaComision(.1);

          System.out.printf("%n%s:%n%s%n", "informacion actualizada del metodo toString", empleado);
      } catch (IllegalArgumentException e)
      {
          System.out.println(e.getMessage());
      }
    }
}
