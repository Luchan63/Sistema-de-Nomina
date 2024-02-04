public class Rombo1 {

    public static void main(String[] args) {
        int i;
        int k;
        for(i = 1; i <= 7; ++i) {
            for(k = 1; k <= 7 - i; ++k) {
                System.out.print(' ');
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

        for(i = 6; i >= 1; --i) {
            for(k = 1; k <= 7 - i; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

    }
}
