public class Triangulo1 {

    public static void main(String[] args) {
        int i;
        int k;
        for(i = 1; i <= 10; ++i) {
            for(k = 1; k <= i; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

        for(i = 10; i >= 1; --i) {
            for(k = 1; k <= i; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

        for(i = 10; i >= 1; --i) {
            for(k = 1; k <= 10 - i; ++k) {
                System.out.print(' ');
            }

            for(k = 1; k <= i; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

        for(i = 1; i <= 10; ++i) {
            for(k = 1; k <= 10 - i; ++k) {
                System.out.print(' ');
            }

            for(k = 1; k <= i; ++k) {
                System.out.print('*');
            }

            System.out.println();
        }

    }
}