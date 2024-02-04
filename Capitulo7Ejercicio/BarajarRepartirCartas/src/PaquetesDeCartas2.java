import java.security.SecureRandom;

import static java.lang.Integer.parseInt;

//7.10
public class PaquetesDeCartas2
{
    private final Carta2[] paquete; // arreglo de objeto Carta
    private int cartaActual; // indice de la siguiente carta a repartir (0 a 51)
    public static final int NUM_DE_CARTAS = 52; // numero constantes de cartas
    private static final SecureRandom numAleatorio = new SecureRandom(); // genrador de numeros seguros aleatorios
    public PaquetesDeCartas2()
    {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis",
                "Siete", "Ocho", "Nueve", "Diez", "Jocker", "Reina", "Rey"};
        String[] palo = {"Corazones","Diamantes","Treboles","Espadas"};

        this.paquete = new Carta2[NUM_DE_CARTAS]; // crea arreglo objeto carta
        this.cartaActual = 0; // la primera carta repartida sera del paquete[0]

        // llenamos el paqueta con objeto carta
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            this.paquete[cuenta] = new Carta2(caras[cuenta % 13],palo[cuenta / 13] );
        }
    }

    public void barajar()
    {
        this.cartaActual = 0; // empezamos del paquete[0]

        // para cada carta selecciona otra carta aleatoria de (0 a 51)
        for (int primera = 0; primera < this.paquete.length; primera++)
        {
            // selecionamos un numero aleatorio de 0 a 51
            int segunda = numAleatorio.nextInt(NUM_DE_CARTAS);

            // intercambiamos carta actual con la carta seleccionada al azar
            Carta2 temp = this.paquete[primera];
            this.paquete[primera] = this.paquete[segunda];
            this.paquete[segunda] = temp;
        }
    }

    public Carta2 repartirCarta()
    {
        // determina si quedan cartas por repartir
        if (this.cartaActual < this.paquete.length)
        {
            return this.paquete[cartaActual++]; //devuelve la carta al arreglo
        } else {
            return null; // devuelve null para indicar que se repartieron todas las cartas
        }
    }

    public Carta2[] repartirMano()
    {
        Carta2[] mano = new Carta2[5];
        System.out.println("\n--- Tu Mano Es: ----\n");
        for (int carta = 0; carta < 5; carta++) {
            mano[carta] = this.repartirCarta();
            System.out.println(mano[carta].toString());
        }
        return mano;
    }
    // determinamos si es par
    private boolean hayPar(Carta2[] mano)
    {
        // creamos una variable boolean en false
        boolean isPar = false;
        // iteramos en las cartas
        for (int i = 0; i < mano.length; i++) {
            for (int j = 0; j < mano.length; j++) {
                if (i != j && (mano[i].getCaras().equals(mano[j].getCaras()))){ // determinamos que si tenemos dos cartas iguales en la misma mano
                        isPar = true; // determinamos en verdadero la ya que es un par
                        break;

                }
            }
        }
        return isPar;
    }
    // determinamos si hay dos pares
    private boolean hay2Pares(Carta2[] mano)
    {
        // creamos la variable booleana en false para que no se muestre la carta
        boolean is2Par = false;
        int par2 = 0; // creamos un contador en 0
        // iteramos sobre las cartas
        for (int i = 0; i < mano.length; i++) {
            for (int j = 0; j < mano.length; j++) {
                if (i != j && (mano[i].getCaras().equals(mano[j].getCaras()))){ // si las cartas son iguales
                        par2++; // incrementamos el contador

                }
            }
        }
        if (par2 == 2){ // si hay 2 par cartas iguales y 2 par de cartas iguales de diferent valor es un dobles par
            is2Par = true;
        }
        return is2Par;
    }
    // determinamos si es tercia
    private boolean hayTercia(Carta2[] mano)
    {
        boolean isTercia = false;
        int tercia = 0; // iniciamos el contador 0

        // iteramos en la mano
        for (int i = 0; i < mano.length; i++) {
            for (int j = 0; j < mano.length; j++) {
                if (i!=j )
                    if (mano[i].getCaras().equals(mano[j].getCaras())) { // determinamos si las caras son iguales
                        tercia++; // incrementamos el conntaodr
                }
            }
        }
        if (tercia == 3){ // si hay tres caras del mismo valor
            isTercia = true; // isTercia cambia a true
        }
        return isTercia;

    }
    // determinamos si es poker
    private boolean esPoker(Carta2[] mano)
    {
        boolean isPoker = false;
        int poker = 0;
        // iteramos en las cartas
        for (int i = 0; i < mano.length; i++) {
            for (int j = 0; j < mano.length; j++) {
                if (i!=j)
                    if (mano[j].getCaras().equals(mano[i].getCaras())){ // revisa si hay 4 as
                        poker++;

                }
            }
        }
        if (poker == 4) // si hay 4 as
        {
            isPoker = true; // hay poker
        }
        return isPoker;
    }
    // determinamos si es una corrida
    private boolean isCorrida(Carta2[] mano)
    {
        boolean isCorrida = false;
        int corrida = 0;

        for (int i = 0; i < mano.length; i++) {
            for (int j = 0; j < mano.length; j++) {
                if (i!= j)
                    if(mano[i].getPalo().equals(mano[j].getPalo()))
                    {
                        corrida++;

                }
            }
        }
        if (corrida == 5)
        {
            isCorrida = true;
        }
        return isCorrida;
    }
    // determinamos si es escalera
    private boolean isEscalera(Carta2[] mano) {
        // Asumiendo que el valor de las cartas es un número entero
        int[] valores = new int[mano.length];

        // Obtener los valores de las cartas
        for (int i = 0; i < mano.length; i++) {
            String cara = mano[i].getCaras();
            switch (cara) {
                case "As":
                    valores[i] = 1; // As puede ser 1 u 11, usaremos 1 en este caso
                    break;
                case "Dos":
                    valores[i] = 2;
                    break;
                case "Tres":
                    valores[i] = 3;
                    break;
                case "Cuatro":
                    valores[i] = 4;
                    break;
                case "Cinco":
                    valores[i] = 5;
                    break;
                case "Seis":
                    valores[i] = 6;
                    break;
                case "Siete":
                    valores[i] = 7;
                    break;
                case "Ocho":
                    valores[i] = 8;
                    break;
                case "Nueve":
                    valores[i] = 9;
                    break;
                case "Diez":
                    valores[i] = 10;
                    break;

                case "Jocker":
                    valores[i] = 11;
                    break;
                case "Reina":
                    valores[i] = 12;
                    break;
                case "Rey":
                    valores[i] = 13;
                    break;
            }
        }

        // Buscar el valor mínimo y máximo
        int minimo = valores[0];
        int maximo = valores[0];

        for (int valor : valores) {
            if (valor < minimo) {
                minimo = valor;
            }
            if (valor > maximo) {
                maximo = valor;
            }
        }

        // Verificar si la diferencia es 4 (indicando cinco valores consecutivos)
        return maximo - minimo == 4;
    }
    // determinamos si es fullHouse
    private boolean isFullHouse(Carta2[] mano)
    {
        return hayTercia(mano) && hayPar(mano);
    }
    public void analizaMano(Carta2[] mano)
    {

        String[][] manoHecha = new String[7][2];
        manoHecha[0][0] = "Hay Par";
        manoHecha[1][0] = "Hay doble Pares";
        manoHecha[2][0] = "Hay Tercia";
        manoHecha[3][0] = "Es Poker";
        manoHecha[4][0] = "Es Corrida";
        manoHecha[5][0] = "Es Escalera";
        manoHecha[6][0] = "Full House";

        System.out.println("\n<*** Resultados de la mano: ***\n");
        for (int indice = 0; indice < manoHecha.length; indice++) {
            int col = 1;
            switch(indice) {
                case 0:  manoHecha[indice][col] = String.valueOf(this.hayPar(mano)); break;
                case 1:  manoHecha[indice][col] = String.valueOf(this.hay2Pares(mano)); break;
                case 2:  manoHecha[indice][col] = String.valueOf(hayTercia(mano)); break;
                case 3:  manoHecha[indice][col] = String.valueOf(this.esPoker(mano)); break;
                case 4:  manoHecha[indice][col] = String.valueOf(this.isCorrida(mano)); break;
                case 5:  manoHecha[indice][col] = String.valueOf(this.isEscalera(mano)); break;
                case 6:  manoHecha[indice][col] = String.valueOf(this.isFullHouse(mano)); break;

            }
        }

        for (String[] strings : manoHecha) {
            for (int col = 0; col < strings.length; col++) {
                if (col == 0) {
                    System.out.print(strings[col] + " - ");
                } else {
                    System.out.println(strings[col]);
                }
            }
        }
    }
}
