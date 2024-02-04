import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double totalRecibo = 0.0;
        Scanner enter = new Scanner(System.in);
        System.out.print("Ingrese el numero del cliente");
        int numCliente = enter.nextInt();

        for(int i = 1; i <= numCliente; ++i) {
            System.out.print("Ingrese las horas de estacionamiento");
            int horasEstacionamiento = enter.nextInt();
            double cargoClente = calcularCargos(horasEstacionamiento);
            totalRecibo += cargoClente;
            System.out.printf("Cargo para el cliente %d = €%.2f%n ", i, cargoClente);
            System.out.printf("El total de recibos de ayer es: %.2f€%n ", totalRecibo);
        }

    }

    public static double calcularCargos(int horasEstacionamiento) {
        double cargoMinimo = 2.0;
        double cargoAdicionalPorHora = 0.5;
        double horaMaxima = 3.0;
        double cargo = cargoMinimo;
        if ((double)horasEstacionamiento > horaMaxima) {
            cargo = cargoMinimo + ((double)horasEstacionamiento - horaMaxima) * cargoAdicionalPorHora;
        }

        return Math.min(cargo, cargoMinimo);
    }
}
