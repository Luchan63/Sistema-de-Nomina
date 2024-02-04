public class Main {
    public static void main(String[] args) {
        try {

        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(5,0);
        Punto punto3 = new Punto(5,5);
        Punto punto4 = new Punto(0,5);

        Cuadrado cuadrado = new Cuadrado(punto1,punto2,punto3,punto4);

        System.out.println("Area de un cuadrado: " + cuadrado.CalcularArea());
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}