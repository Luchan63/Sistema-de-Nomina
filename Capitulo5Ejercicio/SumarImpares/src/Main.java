public class Main {

    public static void main(String[] args) {
        int suma = 0;

        for(int numero = 1; numero <= 99; numero += 2) {
            suma += numero;
        }

        System.out.println("La suma de los enteros impares entre 1 y 99 es: " + suma);
    }
}
