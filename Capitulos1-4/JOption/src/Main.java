//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre");
        String mensaje = String.format("bienvenido, %s, a la aplicacion java", nombre);
        JOptionPane.showMessageDialog((Component)null, mensaje);
    }
}
