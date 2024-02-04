//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {

    public static void main(String[] args) {
        int exponente = 0;
        int base = 2;

        for(double potencia = 1.0; exponente < 100; ++exponente) {
            System.out.println(potencia);
            potencia *= (double)base;
        }

    }
}
