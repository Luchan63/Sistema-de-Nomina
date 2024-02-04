public class Main {

    public static void main(String[] args) {
        double x = Math.abs(7.5);
        System.out.println(x);
        System.out.println();
        double x2 = Math.floor(7.5);
        System.out.println(x2);
        System.out.println();
        double x3 = Math.abs(0.0);
        System.out.println(x3);
        System.out.println();
        double x4 = Math.ceil(0.0);
        System.out.println(x4);
        System.out.println();
        double x5 = Math.abs(-6.4);
        System.out.println(x5);
        System.out.println();
        double x6 = Math.ceil(-6.4);
        System.out.println(x6);
        System.out.println();
        double x7 = Math.ceil(-Math.abs(-8.0 + Math.floor(-5.5)));
        System.out.println(x7);
    }
}
