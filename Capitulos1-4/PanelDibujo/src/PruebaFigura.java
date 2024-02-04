//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFigura {
    public PruebaFigura() {
    }

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("escriba 1 para dibujar rectangulos\nescriba 2 para dibujar ovalos");
        int opcion = Integer.parseInt(entrada);
        Figura panel = new Figura(opcion);
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(3);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
    }
}
