public class PruebaEnum
{
    public static void main(String[] args)
    {
        // mostrar las constante de la enum y sus duraciones
        for (LuzSemaforo luz : LuzSemaforo.values())
        {
            System.out.printf("%-10s%-45s%n", luz, luz.getDuracion());
        }
    }
}
