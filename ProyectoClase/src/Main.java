
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        GestorDatos gestorDatos = new GestorDatos();

        Scanner scannerString = new Scanner(System.in).useLocale(Locale.US);
        Scanner scanNumero = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=========Menu Opciones==========");
        boolean salir = false;
        int opcion;
        do {
            System.out.print("Seleccione una opcion:\n");
            menu();
            opcion = scanNumero.nextInt();
            switch (opcion) {
                case 1:
                   ingresarPersona(scannerString,scanNumero,gestorDatos);
                    break;
                case 2:
                    mostrarInformacion(gestorDatos);
                    break;
                case 3:
                    imcMayor(gestorDatos);
                    break;
                case 4:
                    imcMenor(gestorDatos);
                    break;
                case 5:
                    promedio(gestorDatos);
                case 9:
                    mostraPersonas(gestorDatos);
                    break;
                case 0:
                    salir = true;
                default:
                    System.out.println("opcion no valida");
            }

       } while (!salir);
    }

    private static void mostraPersonas(GestorDatos gestorDatos)
    {
        gestorDatos.agregarPersonas(new Persona("Juan", 25, 1.75, 75));
        gestorDatos.agregarPersonas(new Persona("Maria", 30, 1.65, 60));
        gestorDatos.agregarPersonas(new Persona("Pedro", 35, 1.80, 80));
        gestorDatos.agregarPersonas(new Persona("Ana", 40, 1.60, 55));
        gestorDatos.agregarPersonas(new Persona("Luis", 45, 1.70, 70));
        gestorDatos.agregarPersonas(new Persona("Luisa", 50, 1.55, 50));
        gestorDatos.agregarPersonas(new Persona("Carlos", 55, 1.85, 85));
        gestorDatos.agregarPersonas(new Persona("Carla", 60, 1.50, 45));
    }

    private static void menu() {
        System.out.println("1- ingresar una persona");
        System.out.println("2- Lista una persona");
        System.out.println("3- Persona con mayor IMC");
        System.out.println("4- Persona con menor IMC");
        System.out.println("5- Promedio de IMC");
        System.out.println("9- Agregar Data Ejemplo");
    }


    private static void ingresarPersona(Scanner scannerString, Scanner scanNumero, GestorDatos gestorDatos)
    {
        //      formulario de persona
        System.out.println("Formulario de Persona");
        System.out.println("=====================");
        System.out.println();
        System.out.print("Nombre: ");
        String nombre = scannerString .nextLine();
        System.out.print("Edad: ");
        int edad = scanNumero.nextInt();
        System.out.print("Altura: ");
        double altura = scanNumero.nextDouble();
        System.out.print("Peso: ");
        double peso = scanNumero.nextDouble();
        //      fin de formulario de persona

        // crear objeto persona1
        gestorDatos.agregarPersonas(new Persona(nombre, edad, altura, peso));
    }
    private static void mostrarInformacion(GestorDatos gestorDatos)
    {
        System.out.println("\n\n          Datos de las Personas");
        System.out.println("========================================");
        System.out.println("nombre edad altura     peso      imc");
        System.out.println("========================================");

        for (Persona p : gestorDatos.listarPersonas()) {
            System.out.println(p.toString());
        }
    }

    private static void imcMayor(GestorDatos gestorDatos)
    {
        System.out.println("\n\n          Datos de las Personas");
        System.out.println("========================================");
        System.out.println("nombre edad altura     peso      imc");
        System.out.println("========================================");
        System.out.println(gestorDatos.getIMCMayor().toString());
    }

    private static void imcMenor(GestorDatos gestorDatos)
    {
        System.out.println("\n\n          Datos de las Personas");
        System.out.println("========================================");
        System.out.println("nombre edad altura     peso      imc");
        System.out.println("========================================");
        System.out.println(gestorDatos.getIMCMenor().toString());
    }

    private static void promedio(GestorDatos gestorDatos)
    {
       // System.out.printf("El promedio de IMC del grupo es: %.2f",gestorDatos.getPromedio());//
        System.out.printf("El promedio del grupo es: %.2f%n",gestorDatos.getPromedio());

    }
}




    
