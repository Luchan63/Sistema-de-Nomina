public class Triangulo {


    public static void main(String[] args) {
        for(int i = 1; i <= 10; ++i) {
            int j;
            for(j = 1; j <= i; ++j) {
                System.out.print('*');
            }

            System.out.print("\t\t");

            for(j = 10; j >= i; --j) {
                System.out.print("*");
            }

            System.out.print("\t\t");

            for(j = 1; j <= i; ++j) {
                System.out.print(" ");
            }

            System.out.print("\t\t");

            for(j = 10; j >= i; --j) {
                System.out.print("*");
            }

            System.out.print("\t\t");

            for(j = 10; j >= i; --j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
