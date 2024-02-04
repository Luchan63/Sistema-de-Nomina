//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PruebaPoliza {
    public PruebaPoliza() {
    }

    public static void main(String[] args) {
        PolizaAuto polizaAuto1 = new PolizaAuto(125458788, "toyota camry", "NY");
        PolizaAuto polizaAuto2 = new PolizaAuto(222222222, "ford fusion", "ME");
        polizaAuto1.setEstado(polizaAuto1.getEstado());
        polizaAuto2.setEstado(polizaAuto2.getEstado());
        polizaEnEStadoSinCulpa(polizaAuto1);
        polizaEnEStadoSinCulpa(polizaAuto2);
    }

    public static void polizaEnEStadoSinCulpa(PolizaAuto poliza) {
        System.out.println("La poliza de Auto");
        System.out.printf("Cuenta #: %d; Auto: %s; Estado: %s %s un estado sin culpa%n%n", poliza.getNumeroCuenta(), poliza.getMarcaYModelo(), poliza.getEstado(), poliza.esEstadoSinCulpa() ? "esta en" : "no esta en");
    }
}
