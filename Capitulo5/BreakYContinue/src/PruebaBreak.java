//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PruebaBreak {
    public PruebaBreak() {
    }

    public static void main(String[] args) {
        int cuenta;
        for(cuenta = 1; cuenta <= 10 && cuenta != 5; ++cuenta) {
            System.out.printf("%d ", cuenta);
        }

        System.out.printf("%n salio del ciclo en cuenta = %d%n", cuenta);
    }
}
