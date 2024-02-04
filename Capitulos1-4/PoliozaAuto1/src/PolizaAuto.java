//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class PolizaAuto {
    private int numeroCuenta;
    private String marcaYModelo;
    private String estado;

    public PolizaAuto(int numeroCuenta, String marcaYmodelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYmodelo;
        this.estado = estado;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    public String getMarcaYModelo() {
        return this.marcaYModelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean esEstadoSinCulpa() {
        boolean estadoSinCulpa;
        switch (this.getEstado()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
        }

        return estadoSinCulpa;
    }
}
