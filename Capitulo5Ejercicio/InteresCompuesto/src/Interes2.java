public class Interes2 {

    public static void main(String[] args) {
        int pricipal = 100000;
        int tasa = 5;
        System.out.printf("%s%20s%n", "Anio", "Monto en Deposito");

        for(int anio = 1; anio <= 10; ++anio) {
            int monto = (int)((double)pricipal * Math.pow((double)(100 + tasa) / 100.0, (double)anio));
            int dolares = monto / 100;
            int centavo = monto % 100;
            System.out.printf("%4d%20d.%2d%n", anio, dolares, centavo);
        }

    }
}