
import javax.swing.JFrame;

public class PruebaDibujaCara {

    public static void main(String[] args) {
        Main panel = new Main();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(3);
        aplicacion.add(panel);
        aplicacion.setSize(230, 250);
        aplicacion.setVisible(true);
    }
}
