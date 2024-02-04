
import javax.swing.JFrame;

public class PruebaPanelDibujo {

    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame aplly = new JFrame();
        aplly.setDefaultCloseOperation(3);
        aplly.add(panel);
        aplly.setSize(300, 300);
        aplly.setVisible(true);
    }
}
