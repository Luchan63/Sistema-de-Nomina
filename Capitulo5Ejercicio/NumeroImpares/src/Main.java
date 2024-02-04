public class Main {

    public static void main(String[] args) {
        int multi = 1;

        for(int i = 1; i <= 15; i += 2) {
            multi *= i;
        }

        System.out.println("El producto de impares del 1 al 15 es: " + multi);
    }
}
