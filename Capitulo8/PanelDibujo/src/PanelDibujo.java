
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
    private SecureRandom numAleatorios = new SecureRandom();
    private MiLinea[] lineas;

    public PanelDibujo() {
        this.setBackground(Color.black);
        this.lineas = new MiLinea[5 + this.numAleatorios.nextInt(5)];

        for(int cuenta = 0; cuenta < this.lineas.length; ++cuenta) {
            int x1 = this.numAleatorios.nextInt(300);
            int y1 = this.numAleatorios.nextInt(300);
            int x2 = this.numAleatorios.nextInt(300);
            int y2 = this.numAleatorios.nextInt(300);
            Color color = new Color(this.numAleatorios.nextInt(256), this.numAleatorios.nextInt(256), this.numAleatorios.nextInt(256));
            this.lineas[cuenta] = new MiLinea(x1, y1, x2, y2, color);
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        MiLinea[] var2 = this.lineas;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            MiLinea linea = var2[var4];
            linea.dibujar(g);
        }

    }
}
