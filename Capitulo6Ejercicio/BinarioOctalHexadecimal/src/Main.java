import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int binario;
        do {
            System.out.print("Ingrese el numero binario entre (0 y 1)");
            binario = scanner.nextInt();
            int decimal = convertirDeBinarioADecimal(binario);
            if (esBinario(binario)) {
                System.out.println("Numero correcto");
                System.out.println("El numero Binario " + binario + " Representa al numero Decimal " + convertirDeBinarioADecimal(binario));
                System.out.println("El numero Binario " + binario + " Representa al numero Octal " + covertirDeBinarioAOctal(binario));
                System.out.println("El numero Decimal " + decimal + " Representa al numero Hexadecimal " + convertirDeDecimalAHexadecimal(decimal));
            } else {
                System.out.println("Numero incorrecto");
            }
        } while(!esBinario(binario));

    }

    public static boolean esBinario(int binario) {
        while(binario != 0) {
            int digito = binario % 10;
            if (digito != 0 && digito != 1) {
                return false;
            }

            binario /= 10;
        }

        return true;
    }

    public static int convertirDeBinarioADecimal(int binario) {
        double decimal = 0.0;

        for(int exponente = 0; binario != 0; binario /= 10) {
            int digito = binario % 10;
            decimal += (double)((int)((double)digito * Math.pow(2.0, (double)exponente)));
            ++exponente;
        }

        return (int)decimal;
    }

    public static int covertirDeBinarioAOctal(int binario) {
        int octal = 0;

        for(int exponente = 0; binario != 0; ++exponente) {
            int tresBits = binario % 1000;
            octal += (int)((double)convertirDeBinarioADecimal(tresBits) * Math.pow(10.0, (double)exponente));
            binario /= 1000;
        }

        return octal;
    }

    public static String convertirDeDecimalAHexadecimal(int decimal) {
        String hexadecimal;
        for(hexadecimal = ""; decimal != 0; decimal /= 16) {
            int cuatroBits = decimal % 16;
            if (cuatroBits <= 9) {
                hexadecimal = hexadecimal + cuatroBits;
            } else if (cuatroBits == 10) {
                hexadecimal = hexadecimal + "A";
            } else if (cuatroBits == 11) {
                hexadecimal = hexadecimal + "B";
            } else if (cuatroBits == 12) {
                hexadecimal = hexadecimal + "C";
            } else if (cuatroBits == 13) {
                hexadecimal = hexadecimal + "D";
            } else if (cuatroBits == 14) {
                hexadecimal = hexadecimal + "E";
            } else if (cuatroBits == 15) {
                hexadecimal = hexadecimal + "F";
            }
        }

        String invertida = "";

        for(int indice = hexadecimal.length() - 1; indice >= 0; --indice) {
            invertida = invertida + hexadecimal.charAt(indice);
        }

        return invertida;
    }
}
