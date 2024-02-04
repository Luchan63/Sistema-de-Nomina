// 7.11
public class PruebaPaqueDeCartas2
{
    public static void main(String[] args)
    {
        PaquetesDeCartas2 mazo = new PaquetesDeCartas2();
        mazo.barajar(); // coloca las cartas en orden aleatorio
        Carta2[] mano = mazo.repartirMano();
        mazo.analizaMano(mano);
        Carta2[] luis = mazo.repartirMano();
        mazo.analizaMano(mano);
    }
}
