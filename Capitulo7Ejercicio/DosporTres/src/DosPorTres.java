import java.util.Scanner;

//ejercicio 7.9
public class DosPorTres
{
    public static void main(String[] args)
    {
        // creamos el entero t de dos por 3
        int[][] t = new int[2][3];
        // Inicializar valores para demostración
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j] = i * 3 + j + 1; // Valores de ejemplo
            }
        }
        // mostramos las filas y las columnas
            System.out.printf("numero de fila: %d%n ", t.length);
            System.out.printf("numero de columnas: %d%n ",t[0].length);


        System.out.println("---------------------------");
        // creamos la variable total para calcular las filas y columnas
        int total = t.length * t[0].length;
            // mostramos el resutado
            System.out.printf("el total es: %d%n ",total);
            // salto de linea
        System.out.println("-----------------------");
        // accedemos a la fila 1
        int elementoFila1Columna1 = t[1][0];
        int elementoFila1Columna2 = t[1][1];
        int elementoFila1Columna3 = t[1][2];
            System.out.printf("elementos de la fila 1: %d, %d, %d%n",elementoFila1Columna1,elementoFila1Columna2,elementoFila1Columna3);
        System.out.println("----------------------------");
        //accedemos a la columna 2
        int elementoFila1Columna21 = t[0][1];
        int elementoFila2Columna2 = t[1][1];
            System.out.printf("elemento de la columna 2: %d, %d%n", elementoFila1Columna21,elementoFila2Columna2);

        System.out.println("------------------------------");
        //asignamos 0 a la fila 0 columna 1
        t[0][1] = 0;
        // mostramos
            System.out.printf("fila0 columna 1: %d%n", t[0][1]);
        System.out.println("------------------------------");
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
           System.out.printf("todos los elementos de t: %d%n", t[0][0]);
        System.out.println("----------------------------------");
        for (int fila = 0; fila < t.length; fila++) {
            for (int columnas = 0; columnas < t[fila].length; columnas++) {
                t[fila][columnas] = 0;
            System.out.print(t[fila][columnas]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    // pedimos al usuario que ingrese los numero del arreglo
        Scanner scan = new Scanner(System.in);
        for (int fila = 0; fila < t.length; fila++) {
            for (int coumnas = 0; coumnas < t[0].length; coumnas++) {
            System.out.printf(" añade un valor al arreglo t[%d][%d]; ",fila,coumnas);
            t[fila][coumnas] = scan.nextInt();
            }
        }
        int menor = t[0][0];
        System.out.println("los nuevos elementos son: ");
        for (int fila = 0; fila < t.length; fila++) {
            for (int columnas = 0; columnas < t[0].length; columnas++) {
                System.out.printf("%d ", t[fila][columnas]);
                if (t[fila][columnas] < menor){
                menor = t[fila][columnas];
                }
            }
            System.out.println();

        }
        System.out.println("el arreglo menor es: " + menor);
        System.out.println("-----------------------------");

        System.out.printf("%d,%d,%d%n ", t[1][0],t[1][1],t[1][2]);
        int total1 = t[0][2] + t[1][2];
        System.out.printf("El total es: %d%n",total1);

        System.out.println("-----------------" +
                "------------");

        System.out.printf("%s%10s%10s%n", "fila" , "columnas", "valor");
        for (int fila = 0; fila < t.length; fila++) {
            for (int columnas = 0; columnas < t[0].length; columnas++) {
                System.out.printf("%5d%10d%10d%n",fila,columnas,t[fila][columnas]);
            }
        }
    }
}
