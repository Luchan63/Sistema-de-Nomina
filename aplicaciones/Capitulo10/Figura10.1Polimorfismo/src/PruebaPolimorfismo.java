// fig 10.1
// asignacion de referencias a la superClase, a variables de la superClase y la subClase
public class PruebaPolimorfismo {
    public static void main(String[] args) {

        //asigna la referencia a la superClase a una variable de la superClase
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("luis","figuereo","2222-2222",1000,.06);

        // asigna la referencia a la subClase a una variable subClase
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("bob","lewis","3333-33-33333",5000,.04,300);

        //invoca a toString en un objeto de la superClase, usando una variable de la superClase
        System.out.printf("%s %s:%n%n%s%n%n","llamada a toString de EmpleadoPoComision con referencia de superClase",
                "a un objeto de la superclase",empleadoPorComision.toString());

        //invoca a toString en un objeto de la subClase, usando una variable de la subClase
        System.out.printf("%s %s:%n%n%s%n%n","llamada a toString de EmpleadoBaseMasComision con referencia",
                "de subClase a un objeto de subClase",empleadoBaseMasComision.toString());

        //invoca a toString en un objeto de la subClase, usando una variable de la superClase
        EmpleadoPorComision empleadoPorComision1 = empleadoBaseMasComision;
        System.out.printf("%s %s:%n%n%s%n","llamada a toString de EmpleadoBaseMasComision con referencia de superClase",
                "a un objeto de la subClase",empleadoPorComision1.toString());


    }
}