import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {


    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal tasa = BigDecimal.valueOf(0.05);
        System.out.printf("%s%20s%n", "Año", "Monto Deposito");

        for(int anio = 1; anio <= 10; ++anio) {
            BigDecimal monto = principal.multiply(tasa.add(BigDecimal.ONE).pow(anio));
            System.out.printf("%4d%20s%n", anio, NumberFormat.getCurrencyInstance().format(monto));
        }

    }
}
