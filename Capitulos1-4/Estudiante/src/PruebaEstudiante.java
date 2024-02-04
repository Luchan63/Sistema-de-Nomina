
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PruebaEstudiante {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jane Green", 93.5);
        Estudiante estudiante2 = new Estudiante("John Blue", 72.55);
        Estudiante estudiante3 = new Estudiante("Luis Figuereo", 59.3);
        System.out.printf("La Calificacion %s es: %s%n", estudiante1.getNombre(), estudiante1.getCalificaciones());
        System.out.printf("La Calificacion %s es: %s%n", estudiante2.getNombre(), estudiante2.getCalificaciones());
        System.out.printf("La Calificacion %s es: %s%n", estudiante3.getNombre(), estudiante3.getCalificaciones());
    }
}
