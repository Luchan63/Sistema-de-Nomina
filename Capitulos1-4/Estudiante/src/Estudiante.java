//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Estudiante {
    private String nombre;
    private double promedio;

    Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        if (promedio > 0.0 && promedio <= 100.0) {
            this.promedio = promedio;
        }

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPromedio(double promedio) {
        if (promedio > 0.0 && promedio <= 100.0) {
            this.promedio = promedio;
        }

    }

    public double getPromedio() {
        return this.promedio;
    }

    public String getCalificaciones() {
        String calificaciones = "";
        if (this.promedio >= 90.0) {
            calificaciones = "A";
        } else if (this.promedio >= 80.0) {
            calificaciones = "B";
        } else if (this.promedio >= 70.0) {
            calificaciones = "C";
        } else if (this.promedio >= 60.0) {
            calificaciones = "D";
        } else {
            calificaciones = "F";
        }

        return calificaciones;
    }
}
