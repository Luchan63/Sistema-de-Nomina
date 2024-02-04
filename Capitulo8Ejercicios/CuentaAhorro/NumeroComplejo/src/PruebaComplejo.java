public class PruebaComplejo
{
    public static void main(String[] args) {
       Complejo complejo = new Complejo(50,90);
        System.out.println(complejo);
       complejo.sumarEnteros(new Complejo(480,23));
        System.out.println(complejo);
        complejo.restarEnteros(new Complejo(504,744));
        System.out.println(complejo);
    }
}
