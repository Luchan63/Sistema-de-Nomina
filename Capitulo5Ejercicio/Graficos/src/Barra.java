import java.util.Scanner;

public class Barra {

    public static void main(String[] args) {
        String cadena = "";
        System.out.println(cadena);
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; ++i) {
            System.out.println("ingrese 5 numero entre 1-30");
            int num = sc.nextInt();

            for(int j = 1; j <= num; ++j) {
                cadena = cadena + "*";
            }

            cadena = cadena + "\n";
        }

        System.out.println(cadena);
    }
}
