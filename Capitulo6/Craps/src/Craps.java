//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public Craps() {
    }

    public static void main(String[] args) {
        int miPunto = 0;
        int sumaDeDados = tirarDados();
        Estado estadoJuego;
        switch (sumaDeDados) {
            case 2:
            case 3:
            case 12:
                estadoJuego = Craps.Estado.PERDIO;
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            default:
                estadoJuego = Craps.Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("el punto es: %d%n", sumaDeDados);
                break;
            case 7:
            case 11:
                estadoJuego = Craps.Estado.GANO;
        }

        while(estadoJuego == Craps.Estado.CONTINUA) {
            sumaDeDados = tirarDados();
            if (sumaDeDados == miPunto) {
                estadoJuego = Craps.Estado.GANO;
            } else if (sumaDeDados == 7) {
                estadoJuego = Craps.Estado.PERDIO;
            }
        }

        if (estadoJuego == Craps.Estado.GANO) {
            System.out.println("El jugador gana");
        } else {
            System.out.println("el jugador pierde");
        }

    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);
        int suma = dado1 + dado2;
        System.out.printf("El jugador Tiro %d + %d = %d%n", dado1, dado2, suma);
        return suma;
    }

    private static enum Estado {
        CONTINUA,
        GANO,
        PERDIO;

        private Estado() {
        }
    }
}
