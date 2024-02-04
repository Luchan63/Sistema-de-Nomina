public class Main{

    public static void main(String[] args) {
        double pi = 0.0;
        int acum = 1;

        for(int i = 1; i <= 200000; i += 2) {
            if (acum % 2 != 0) {
                pi += 4.0 / (double)i;
            } else {
                pi -= 4.0 / (double)i;
            }

            ++acum;
        }

        System.out.println(pi);
    }
}