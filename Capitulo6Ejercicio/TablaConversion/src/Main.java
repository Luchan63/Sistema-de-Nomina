public class Main {

        public static void main(String[] args) {
            System.out.println("Decimal\t\tBinario\t\tOctal\t\tHexadecimal");
            System.out.println("---------------------------------------------------");

            for(int decimal = 1; decimal <= 256; ++decimal) {
                int binario = convertirDecimalABinario(decimal);
                int octal = covertirDeBinarioAOctal(decimal);
                String hexadecimal = convertirDeDecimalAHexadecimal(decimal);
                System.out.printf("%-10d\t%-16d\t%-10d\t%-12s%n", decimal, binario, octal, hexadecimal);
            }

        }

        public static int convertirDecimalABinario(int decimal) {
            int binario = 0;

            for(int i = 1; decimal != 0; i *= 10) {
                int digito = decimal % 2;
                binario += digito * i;
                decimal /= 2;
            }

            return binario;
        }

        public static int covertirDeBinarioAOctal(int decimal) {
            int octal = 0;

            for(int exponente = 1; decimal != 0; exponente *= 10) {
                int digito = decimal % 8;
                octal += digito * exponente;
                decimal /= 8;
            }

            return octal;
        }

        public static String convertirDeDecimalAHexadecimal(int decimar) {
            String hexadecimal = "";

            for(int exponentes = 1; decimar != 0; exponentes *= 10) {
                int cuatroBits = decimar % 16;
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
                } else {
                    hexadecimal = hexadecimal + "F";
                }

                decimar /= 16;
            }

            String invertida = "";

            for(int indice = hexadecimal.length() - 1; indice >= 0; --indice) {
                invertida = invertida + hexadecimal.charAt(indice);
            }

            return invertida;
        }
    }
