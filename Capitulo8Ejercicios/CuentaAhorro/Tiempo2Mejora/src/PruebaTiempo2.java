public class PruebaTiempo2
{
    public static void main(String[] args)
    {

        try {
            Tiempo2Mejora tiempo = new Tiempo2Mejora(12,25,42); //12:25:42


            mostrarTiempo("se especifico hora, minuto y seundo", tiempo);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%n%s%n", e.getMessage());
        }

    }
    public static void mostrarTiempo(String encabezado, Tiempo2Mejora t)
    {
        System.out.printf("%s%n %s%n %s%n",
                encabezado,
                t.aStringUniversal(),
                t);
    }
}



