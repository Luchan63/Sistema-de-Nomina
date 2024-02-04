public class Cuadrado extends Cuadrilatero{


    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
        validarCuadrado();
    }

    @Override
    public double CalcularArea() {
        double longitud = distanciaEntrePuntos(getPunto1(),getPunto2());
        return Math.pow(longitud,2);
    }

    public double distanciaEntrePuntos(Punto punto1, Punto punto2)
    {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(),2) + Math.pow(punto2.getY() - punto1.getY(),2));
    }

    public void validarCuadrado()
    {
        double lado1 = distanciaEntrePuntos(getPunto1(),getPunto2());
        double lado2 = distanciaEntrePuntos(getPunto2(),getPunto3());
        double lado3 = distanciaEntrePuntos(getPunto3(),getPunto4());
        double lado4 = distanciaEntrePuntos(getPunto4(),getPunto1());

        if (lado1 != lado2 || lado3 != lado4)
        {
            throw new IllegalArgumentException("los lados no tienen las misma longitud, no es un cuadrado");
        }

        double diagonal1 = distanciaEntrePuntos(getPunto1(),getPunto3());
        double diagonal2 = distanciaEntrePuntos(getPunto2(),getPunto4());

        if (diagonal1 != diagonal2)
        {
            throw new IllegalArgumentException("los diagonales no tienen las misma longitud, no es un cuadrado");

        }
    }
}
