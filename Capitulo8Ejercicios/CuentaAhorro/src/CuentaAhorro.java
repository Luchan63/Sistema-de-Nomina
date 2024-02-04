// ejercicio 8.6
public class CuentaAhorro
{
    private static double tasaInteresAnual;
    private double saldoAhorro;

    // contructor de CuentaAhorra
    public  CuentaAhorro(double saldoAhorro)
    {
        if (saldoAhorro < 0)
        {
            throw new IllegalArgumentException("El saldo debe ser positivo");
        }
        this.saldoAhorro = saldoAhorro;
    }

    // set y get de saldoAhorro
    public void setSaldoAhorro(double saldoAhorro)
    {
        this.saldoAhorro = saldoAhorro;
    }

    public double getSaldoAhorro()
    {
        return saldoAhorro;
    }

    // calcular interes
    public void calcularinteresMensual()
    {

        double interesMensual = saldoAhorro * (tasaInteresAnual / 12) / 100;
        saldoAhorro += interesMensual;

    }
    // metodo para modificar la tasa
    public static void modificarTasa(double nuevaTasa)
    {
        if (nuevaTasa < 0)
        {
            throw new IllegalArgumentException("La tasa no puede ser negativa");
        }
        tasaInteresAnual = nuevaTasa;
    }

}