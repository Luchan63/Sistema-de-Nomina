// Fig. 8.11: PruebaEnum.java
// Prueba del tipo enum Libro.
import java.util.EnumSet;

public class PruebaEnum
  {
      public static void main(String[] args)
  {
      System.out.println("Todos los libros:");

       // imprime todos los libros en enum Libro
      for (Libro libro : Libro.values()) {
          System.out.printf("%-10s%-45s%s%n", libro,
                  libro.getTitulo(), libro.getAnioCopyright());
      }
       System.out.println("%nMostrar un rango de constantes enum:%n");

       // imprime los primeros cuatro libros
       for (Libro libro : EnumSet.range(Libro.JHTP, Libro.CPPHTP))
  {
      System.out.printf("%-10s%-45s%s%n", libro,
              libro.getTitulo(), libro.getAnioCopyright());
        }
     }
 } // fin de la clase PruebaEnum