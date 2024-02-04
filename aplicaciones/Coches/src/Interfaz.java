import java.util.Locale;
import java.util.Scanner;

public class Interfaz
{
    // inicializamos el objeto
    private static GestorDatos datos = new GestorDatos();
    // varibables Scanner para iteractual el usuario
    private  static Scanner scanString = new Scanner(System.in);
   private static Scanner scanNumero = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {

        boolean salir = false; // variable false para salir del bucle
        int opcion;

        do {
            menu();
            opcion = scanNumero.nextInt();

            switch (opcion)
            {
                case 1:
                    ingresarCoche();
                    break;
                case 2:
                    mostraCoches();
                    break;
                case 3:
                    filtrar();
                case 9:
                  mocearCoche();
                    break;
                case 0:
                    salir = true;
            }
        } while (!salir);
    }

    public static void menu()
    {
        System.out.println("========= menu =========");
        System.out.println("1- Ingresar coche" );
        System.out.println("2- listar coche" );
        System.out.println("3- Filtrar" );
        System.out.println("9- agregal coche ejemplo" );
        System.out.println("0- salir" );
    }

    public static void ingresarCoche()
    {
        System.out.println("======Formulario de coche=====");
        System.out.println("Modelo de coche");
        String modelo = scanString.nextLine();
        System.out.println("Marca del coche");
        String marca = scanString.nextLine();
        System.out.println("anio Coche");
        int anio = scanNumero.nextInt();
        System.out.println("Color Coche");
        String color = scanString.nextLine();
        datos.agregarCoche(new Coche(modelo,marca,anio,color));
        System.out.println("\nCoche agregado con exito.......!");
        pausa();
    }

    private static void cabeceraListarCoches() {
        // Salida de datos con variable local
        System.out.println("\n\n          Listado de Coches");
        System.out.println("============================================================");
        System.out.println("ID  Marca                 Modelo          Año   Color");
        System.out.println("============================================================");
    }

    private static void pausa()
    {
        System.out.println();
        System.out.println("Presione ENTER para continuar");
        scanString.nextLine();
    }

    private static void mostraCoches()
    {
        cabeceraListarCoches();
        for (Coche coche : datos.listarCoches())
        {
            System.out.println(coche.toString());
        }
        pausa();
    }

    private static void mocearCoche()
    {
        datos.agregarCoche(new Coche("Toyota", "Corolla", 2018, "Azul"));
        datos.agregarCoche(new Coche("Honda", "Civic", 2019, "Negro"));
        datos.agregarCoche(new Coche("Chevrolet", "Camaro", 2020, "Amarillo"));
        datos.agregarCoche(new Coche("Nissan", "Sentra", 2021, "Blanco"));
        datos.agregarCoche(new Coche("Volkswagen", "Golf", 2017, "Verde"));
        datos.agregarCoche(new Coche("BMW", "Serie 3", 2022, "Gris"));
        datos.agregarCoche(new Coche("Audi", "A4", 2016, "Plata"));
        datos.agregarCoche(new Coche("Mercedes-Benz", "Clase C", 2023, "Negro"));
        datos.agregarCoche(new Coche("Subaru", "Impreza", 2015, "Rojo"));
        datos.agregarCoche(new Coche("Mazda", "3", 2014, "Azul"));
        System.out.println("\n10 registros agrados con exito.......!");

        pausa();
    }

    private static void filtrar()
    {
        String myColor;
        String colorX ;
        System.out.println("\n      Filtro de color");
        System.out.println("=============================");
        System.out.println(" Ingrese el color que buscas");
        System.out.println("=============================");
        myColor = scanString.nextLine();
        colorX = myColor.substring(0,1).toUpperCase()+ myColor.substring(1).toLowerCase();
        System.out.println("El color escogido es: "+colorX+"\n");
        for (Coche coche : datos.busquedaPorColor(colorX))
        {
            System.out.println(coche);
        }
    }



}