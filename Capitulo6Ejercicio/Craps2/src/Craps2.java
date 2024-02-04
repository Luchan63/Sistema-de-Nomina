import java.security.SecureRandom;
import java.util.Scanner;

public class Craps2
{
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static double saldoBanco = 1000.0;
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public Craps2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego Craps");

        double apuesta;
        do {
            System.out.println("Cuantos desea apostar?");
            apuesta = scanner.nextDouble();
            if (apuesta <= saldoBanco && apuesta > 0.0) {
                System.out.println("Gracias por su apuesta");
            } else {
                System.out.println("ingrese un valor valido");
            }
        } while(apuesta > saldoBanco || apuesta <= 0.0);

        int miPunto = 0;
        int sumaDeDados = tirarDados();
        Estado estadoJuego;
        switch (sumaDeDados) {
            case 2:
            case 3:
            case 12:
                estadoJuego = Craps2.Estado.PERDIO;
                saldoBanco -= apuesta;
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            default:
                estadoJuego = Craps2.Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("el punto es: %d%n", sumaDeDados);
                break;
            case 7:
            case 11:
                estadoJuego = Craps2.Estado.GANO;
                saldoBanco += apuesta;
        }

        while(estadoJuego == Craps2.Estado.CONTINUA) {
            sumaDeDados = tirarDados();
            if (sumaDeDados == miPunto) {
                estadoJuego = Craps2.Estado.GANO;
                saldoBanco += apuesta;
            } else if (sumaDeDados == 7) {
                estadoJuego = Craps2.Estado.PERDIO;
                saldoBanco -= apuesta;
            }
        }

        charla();
        if (estadoJuego == Craps2.Estado.GANO) {
            System.out.println("El jugador gana");
            System.out.println("Sumando apuesta " + apuesta + " El nuevo saldo es: " + saldoBanco);
        } else {
            System.out.println("el jugador pierde");
            System.out.println("Restando apuesta " + apuesta + "El nuevo saldo es: " + saldoBanco);
            if (saldoBanco == 0.0) {
                System.out.println("Lo siento. ¡ Se quedo sin dinero");
            }
        }

    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);
        int suma = dado1 + dado2;
        System.out.printf("El jugador Tiro %d + %d = %d%n", dado1, dado2, suma);
        return suma;
    }

    public static void charla() {
        SecureRandom mensajesAleatorios = new SecureRandom();
        int opcionAleatoria = mensajesAleatorios.nextInt(3);
        switch (opcionAleatoria) {
            case 0:
                System.out.println("¡Oh!, ¿se está yendo a la quiebra, verdad?");
                break;
            case 1:
                System.out.println("¡Oh, vamos, arriésguese!");
                break;
            case 2:
                System.out.println("La hizo en grande. ¡Ahora es tiempo de cambiar sus fichas por efectivo!");
                break;
            default:
                System.out.println("Algo salió mal al seleccionar el mensaje de charla.");
        }

    }

    private static enum Estado {
        CONTINUA,
        GANO,
        PERDIO;

        private Estado() {
        }
    }
}
