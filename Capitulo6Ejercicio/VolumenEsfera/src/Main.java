import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner entre = new Scanner(System.in);
            System.out.print("ingrese el valor de radio de la Esfera");
            double radio = entre.nextDouble();
            System.out.printf("El volumen Es: %f%n", volumenEsfera(radio));
        }

        public static double volumenEsfera(double radio) {
            return 4.1887902047863905 * Math.pow(radio, 3.0);
        }
    }
