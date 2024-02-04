// Fig. 7.26: PruebaDibujoArcoIris.java
// Aplicación de prueba para mostrar un arco iris.
import javax.swing.JFrame;

public class PruebaDibujoArcoIris
  {
      public static void main(String[] args)
        {
            DibujoArcoIris panel = new DibujoArcoIris();
            JFrame aplicacion = new JFrame();

           aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           aplicacion.add(panel);
           aplicacion.setSize(400, 250);
           aplicacion.setVisible(true);
        }
  } // fin de la clase PruebaDibujoArcoIris
