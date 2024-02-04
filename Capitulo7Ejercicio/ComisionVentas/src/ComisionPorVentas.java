import java.util.Scanner;

//ejercicio 7.10
public class ComisionPorVentas
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // pedimos al usuario que ingresen el numero de vendedores
        System.out.print("ingrese el numero de vendedores");
        int numVenderores = scan.nextInt();
        // arreglo para las comisiones
        int[] comision = new int[9];
        //ingresa las ventas y calcula el salario para cada vendedor
        for (int i = 0; i < numVenderores; i++)
        {
            System.out.printf("Ingrese las Ventas del Vendedor %d: $", i +1);
            double ventas = scan.nextDouble();

            // calcula el salirio para el vendedor
            double salirio = 200 + 0.09 * ventas;

            if (salirio >= 200 && salirio <= 299){
                comision[0]++;
            } else if (salirio >= 300 && salirio <= 399) {
                comision[1]++;
            } else if (salirio >= 400 && salirio <= 499 ) {
                comision[2]++;
            } else if (salirio >= 500 && salirio <= 599) {
                comision[3]++;
            } else if (salirio >= 600 && salirio <= 699) {
                comision[4]++;
            } else if (salirio >= 700 && salirio <= 799) {
                comision[5]++;
            } else if (salirio >= 800 && salirio <= 899) {
                comision[6]++;
            } else if (salirio >= 900 && salirio <= 999) {
                comision[7]++;
            } else {
                comision[8]++;
            }
        }
        System.out.println("\nResultados: ");
        System.out.printf("%-20s %10s%n", "Rango de Salario", "Cantidad");
        String[] rangos = {"$200-299", "$300-399", "$400-499", "$500-599", "$600-699",
                "$700-799", "$800-899", "$900-999", "$1,000 en adelante"};
        for (int i = 0; i < comision.length; i++) {
            System.out.printf("%-20s %-10d%n",rangos[i],comision[i]);
        }

    }
}
