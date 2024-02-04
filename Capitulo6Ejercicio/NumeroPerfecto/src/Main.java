//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {

    public static void main(String[] args) {
        for(int numero = 1; numero <= 1000; ++numero) {
            if (esPerfecto(numero)) {
                System.out.print("Número perfecto: " + numero + ", Factores: ");

                for(int i = 1; i < numero; ++i) {
                    if (numero % i == 0) {
                        System.out.print("" + i + " ");
                    }
                }

                System.out.println();
            }
        }

    }

    public static boolean esPerfecto(int numero) {
        int suma = 1;

        for(int i = 2; (double)i <= Math.sqrt((double)numero); ++i) {
            if (numero % i == 0) {
                suma += i;
                int complemento = numero / i;
                if (complemento != i) {
                    suma += complemento;
                }
            }
        }

        return suma == numero;
    }
}
