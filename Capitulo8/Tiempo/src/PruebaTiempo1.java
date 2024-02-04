//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PruebaTiempo1 {

    public static void main(String[] args) {
        Tiempo tiempo1 = new Tiempo();
        mostrarTiempo("Despues de crear el objeto tiempo", tiempo1);
        System.out.println();
        tiempo1.SetTiempo(12, 38, 10);
        mostrarTiempo("Despues de llamar a setTiempo", tiempo1);
        System.out.println();

        try {
            tiempo1.SetTiempo(99, 99, 99);
        } catch (IllegalArgumentException var3) {
            System.out.printf("Excepcion: %s%n%n", var3.getMessage());
        }

        mostrarTiempo("despues de llamar SetTiempo con valores invalidos", tiempo1);
    }

    private static void mostrarTiempo(String encabezado, Tiempo t) {
        System.out.printf("%s%nTiempo universal: %s%nTiempo estandar: %s%n", encabezado, t.aStringUniversal(), t.toString());
    }
}
