//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {

    public static void main(String[] args) {
        int fila = 10;

        while(fila >= 1) {
            for(int columna = 1; columna <= 10; ++columna) {
                System.out.println(fila % 2 == 1 ? "<" : ">");
            }

            --fila;
            System.out.println();
        }

    }
}
