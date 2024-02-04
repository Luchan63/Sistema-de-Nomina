import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        // crea objeto Scanner para oterner la entrada de la ventana de comando
        Scanner entrada = new Scanner(System.in);

        //iniciamos las variables requeridas
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiante = 1;


        // procesa el contador de 10 estudiantes, con un ciclo controlado por contandor
        while (contadorEstudiante <= 10)
        {
            // pide al usuario la entrada y valor
            System.out.print("Escriba el resultado (1= aprobado, 2=reprobado): ");
            int resultado = entrada.nextInt();

            // if else anidadas en la intruccion while
            if (resultado == 1)
                aprobados += 1;
            else
                reprobados += 1;

            // incrementamos el contador para que el ciclo termine en un  momento dado
            contadorEstudiante += 1;

        }
        // fase de terminancion: prepara y muestra los datos
        System.out.printf("Aprobados: %d%nReprobados: %d%n ", aprobados,reprobados);

        // determina si mas de 8 estudiantes aprobaron
        if (aprobados > 8)
            System.out.println("Bono para el instructor");
    }
} //fin de la clase