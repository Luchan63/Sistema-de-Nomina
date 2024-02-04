//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class BreakMejora {

    public static void main(String[] args) {
        boolean anio = false;

        int cuenta;
        for(cuenta = 0; cuenta <= 10 && !anio; ++cuenta) {
            if (cuenta == 5) {
                anio = true;
                System.out.printf("%d ", cuenta);
            }
        }

        System.out.printf("%n salio del ciclo en cuenta = %d%n", cuenta);
        System.out.println();

        for(int cuenta1 = 1; cuenta1 <= 10; ++cuenta1) {
            if (cuenta1 != 5) {
                System.out.printf("%d ", cuenta1);
            }
        }

        System.out.printf("%nSe omitio imprimir 5%n");
    }
}
