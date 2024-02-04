
public class PruebaCuenta
{
    public static void main(String[] args)
    {
        // inicializamos la clase
        CuentaAhorro cuentaAhorro = new CuentaAhorro(2000.00);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(3000.00);

        // creamo un encabezado
        System.out.printf("%s%20s%20s%n", "Mes","Cuenta1","Cuenta2");

        // le damos un valor a la taza
        CuentaAhorro.modificarTasa(4);

        // iteramos para sacar el interes de 12 meses
        for (int mensual = 1; mensual <= 12 ; mensual++)
        {
            cuentaAhorro.calcularinteresMensual();
            cuentaAhorro2.calcularinteresMensual();
            System.out.printf("%4d%,20.2f%,20.2f%n",mensual,cuentaAhorro.getSaldoAhorro(),cuentaAhorro2.getSaldoAhorro());

        }

        // llamamo el metodo estatico "nota: un metodo statics de una clase se llama con el nombre de la clase no con el identificador"
        CuentaAhorro.modificarTasa(5);

        cuentaAhorro.calcularinteresMensual();
        cuentaAhorro2.calcularinteresMensual();
        System.out.printf("  13%,20.2f%,20.2f%n",cuentaAhorro.getSaldoAhorro(),cuentaAhorro2.getSaldoAhorro());


    }
}
