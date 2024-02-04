//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        GestorPersona gestorPersonas = new GestorPersona();
        boolean salir = false;

        int opcionConsulta;
        do {
            opcionConsulta = Integer.parseInt(JOptionPane.showInputDialog("Desea registrar una persona:\n1- Si\n2- No"));
            if (opcionConsulta == 1) {
                Persona personas = new Persona();
                gestorPersonas.registrarPersona(personas);
            } else if (opcionConsulta == 2) {
                salir = true;
            } else {
                JOptionPane.showMessageDialog((Component)null, "Opción no válida. Intente de nuevo");
            }
        } while(!salir);

        opcionConsulta = Integer.parseInt(JOptionPane.showInputDialog("¿Desea consultar la lista?\n1- Si\n2- No"));
        if (opcionConsulta == 1) {
            gestorPersonas.consultarListaPersona();
        } else if (opcionConsulta == 2) {
            JOptionPane.showMessageDialog((Component)null, "Gracias por visitarnos");
        }

    }
}
