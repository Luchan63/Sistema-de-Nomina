//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class InteresCompuesto {
    public InteresCompuesto() {
    }

    public static void main(String[] args) {
        double pricipal = 2000.0;
        double tasa = 0.04;
        System.out.printf("%s%20s%n", "Anio", "Monto en Deposito");

        for(int anio = 1; anio <= 10; ++anio) {
            double monto = pricipal * Math.pow(1.0 + tasa, (double)anio);
            System.out.printf("%4d%,20.2f%n", anio, monto);
        }

    }
}
