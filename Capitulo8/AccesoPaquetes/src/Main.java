// Fig. 8.15: PruebaDatosPaquete.java
// Los miembros con acceso a nivel de paquete de una clase son accesibles
// para las demás clases en el mismo paquete.

    public class Main{

    public static void main(String[] args){
        DatosPaquete datosPaquete = new DatosPaquete();

         // imprime la representación String de datosPaquete
         System.out.printf("Despues de instanciar:%n%s%n", datosPaquete);

         datosPaquete.numero = 77;
         datosPaquete.cadena = "Adios";

         // imprime la representación String de datosPaquete
         System.out.printf("%nDespues de modificar valores:%n%s%n", datosPaquete);
    }
         } // fin de la clase PruebaDatosPaquete

         // clase con variables de instancia con acceso a nivel de paquete
         class DatosPaquete
 {
         int numero; // variable de instancia con acceso a nivel de paquete
 String cadena; // variable de instancia con acceso a nivel de paquete
// constructo public DatosPaquete()
 {
         numero = 0;
         cadena = "Hola";
 }

         // devuelve la representación String del objeto DatosPaquete
         public String toString()
        {
         return String.format("numero: %d; cadena: %s", numero, cadena);
         }
 } // fin de la clase DatosPaque