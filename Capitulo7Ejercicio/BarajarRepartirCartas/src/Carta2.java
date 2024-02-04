// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// 7.09
public class Carta2 {
    private final String cara; // cara de la carta ("AS,DOS,...)
    private final String palo; // palo de carta ("CORAZONES,"DIAMNTE",....)

    public Carta2(String caraCarta, String paloCarta)
    {
        this.cara = caraCarta; // inicializa la cara de la carta
        this.palo = paloCarta; // inicializa el palo de la carta
    }

    public String getCaras()
    {
        return this.cara;
    }

    public String getPalo()
    {
        return  this.palo;
    }

    public String toString()
    {
        return this.cara + " de " + this.palo;
    }
}