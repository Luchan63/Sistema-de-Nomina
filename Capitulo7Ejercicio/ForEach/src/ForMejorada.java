// ejercicio 7.16
public class ForMejorada
{
    public static void main(String[] args)
    {
        // Verifica si hay al menos un argumento
        if (args.length < 1) {
            System.out.println("Debes proporcionar al menos un valor double como argumento.");
            return;
        }

        // Inicializa la suma
        double suma = 0;

        // Utiliza una instrucción for mejorada para sumar los valores
        for (String arg : args) {
            try {
                // Convierte el String a double y suma al total
                suma += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                // En caso de error al convertir, muestra un mensaje y sigue con el siguiente argumento
                System.out.println("Error al convertir el argumento: " + arg);
            }
        }

        // Muestra el resultado
        System.out.println("La suma de los valores double es: " + suma);
    }
}
