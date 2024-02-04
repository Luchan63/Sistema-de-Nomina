public class Interes1 {

    public static void main(String[] args) {
        double pricipal = 1000.0;
        double tasa = 0.05;
        double tasa2 = 0.06;
        double tasa3 = 0.07;
        double tasa4 = 0.08;
        double tasa5 = 0.09;
        double tasa6 = 0.1;
        System.out.printf("%s%20s%n", "Anio", "Monto en Deposito");

        for(int anio = 1; anio <= 6; ++anio) {
            double monto;
            if (anio == 1) {
                monto = pricipal * Math.pow(1.0 + tasa, (double)anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            } else if (anio == 2) {
                monto = pricipal * Math.pow(1.0 + tasa2, (double)anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            } else if (anio == 3) {
                monto = pricipal * Math.pow(1.0 + tasa3, (double)anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            } else if (anio == 4) {
                monto = pricipal * Math.pow(1.0 + tasa4, (double)anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            } else if (anio == 5) {
                monto = pricipal * Math.pow(1.0 + tasa5, (double)anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            } else {
                monto = pricipal * Math.pow(1.0 + tasa6, (double)anio);
                System.out.printf("%4d%,20.2f%n", anio, monto);
            }
        }

    }
}