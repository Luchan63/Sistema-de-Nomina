import java.math.BigDecimal;
import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        Scanner scanString = new Scanner(System.in);
        Scanner scanNumero = new Scanner(System.in);

        // Crear una instancia de Cuenta y mostrar información
        Cuenta cuenta = mostrarInformacion(scanString, scanNumero);

        // Realizar operaciones en la cuenta
        ingresar(scanNumero, cuenta);
    }

    private static Cuenta mostrarInformacion(Scanner scanString, Scanner scanNumero) {
        System.out.println("Ingrese el nombre:");
        String nombre = scanString.nextLine();
        System.out.println("Ingrese el apellido:");
        String apellido = scanString.nextLine();
        BigDecimal saldoInicial = BigDecimal.valueOf(1000.0);
        Cuenta cuenta = new Cuenta(nombre, apellido, saldoInicial);
        System.out.println(cuenta);

        return cuenta; // Devolver la instancia de Cuenta creada
    }

    private static void ingresar(Scanner scanNumero, Cuenta cuenta) {
        System.out.println("¿Cuánto desea depositar?");
        BigDecimal monto = scanNumero.nextBigDecimal();
        System.out.printf("Ingresando %.2f al Saldo de la cuenta%n%n", monto);
        cuenta.depositar(monto);
        System.out.println(cuenta);
    }
}