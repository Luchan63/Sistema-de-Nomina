//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
    public PanelDibujo() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int anchura = this.getWidth();
        int altura = this.getHeight();
        g.drawLine(0, 0, anchura, altura);
        g.drawLine(0, altura, anchura, 0);
    }
}
