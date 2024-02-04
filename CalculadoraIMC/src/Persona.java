//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private double imc;
    private String imcMsj;

    public Persona() {
        this.nombre = JOptionPane.showInputDialog("nombre: ");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        this.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
    }

    public Persona(String nombre, int edad, double peso, double altura, double imc, String imcMsj) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.imcMsj = imcMsj;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getImc() {
        return this.imc;
    }

    public String getImcMsj() {
        return this.imcMsj;
    }

    public void setImcMsj(String imcMsj) {
        this.imcMsj = imcMsj;
    }
}
