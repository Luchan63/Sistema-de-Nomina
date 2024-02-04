//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    public Main() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return this.anio;
    }

    public int getEdad() {
        int dateActual = 2023;
        int anioCumple = this.anio;
        return dateActual - anioCumple;
    }

    public void mostrarEdad() {
        System.out.println("Esta persona tiene tantos años: " + this.getEdad());
    }

    public int getFrecuencia() {
        return 220 - this.getEdad();
    }

    public void mostrarFrecuenciaMaxima() {
        System.out.println("Frecuencia Cardiaca Maxima;" + this.getFrecuencia());
    }

    public double getRangoBajo() {
        return (double)this.getFrecuencia() * 0.5;
    }

    public double getRangoAlto() {
        return (double)this.getFrecuencia() * 0.85;
    }

    public void IntervaloDfrecuenciacardiacaEsperada() {
        System.out.printf("Mínimo estable: %.1f  ", this.getRangoBajo());
        System.out.printf("Máximo estable: %.1f", this.getRangoAlto());
    }

    public void mostraFecha() {
        System.out.printf("02%d/02%d/04%d", this.dia, this.mes, this.anio);
    }
}
