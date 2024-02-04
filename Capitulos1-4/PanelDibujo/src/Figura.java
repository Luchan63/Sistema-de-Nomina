//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figura extends JPanel {
    private int option;

    public Figura(int opcionUsuario) {
        this.option = opcionUsuario;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < 10; ++i) {
            switch (this.option) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
            }
        }

    }
}
