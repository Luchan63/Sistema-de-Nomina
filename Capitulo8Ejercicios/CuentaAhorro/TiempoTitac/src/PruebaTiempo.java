
public class PruebaTiempo {

    public static void main(String[] args) {
        Tiempo2 tiempo = new Tiempo2(12, 00, 00);
        Tiempo2 tiempo2 = new Tiempo2(00, 00, 00);
        tiempo.ticTac();
        tiempo2.ticTac();
        System.out.println(tiempo);
        System.out.println(tiempo.aStringUniversal());
    }
}
