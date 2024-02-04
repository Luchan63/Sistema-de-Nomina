public class Main {

    public static void main(String[] args) {
        for(int a = 1; a <= 500; ++a) {
            for(int b = 1; b <= 500; ++b) {
                for(int hipotenusa = 1; hipotenusa <= 500; ++hipotenusa) {
                    if (a * a + b * b == hipotenusa * hipotenusa) {
                        System.out.println("" + a + "\t" + b + "\t" + hipotenusa);
                    }
                }
            }
        }

    }
}
