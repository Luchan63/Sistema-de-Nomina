public class PruebaEntero {

    public static void main(String[] args)
    {
        EnteroEnorme entero1 = new EnteroEnorme("123456789");
        EnteroEnorme entero2 = new EnteroEnorme("012345678");
        entero1.sumar(entero2);
        System.out.println("suma: " + entero1);
        System.out.println("==================================================");
        EnteroEnorme entero3 = new EnteroEnorme("123456789");
        EnteroEnorme entero4 = new EnteroEnorme("012345678");
        entero3.restar(entero4);
        System.out.println("Resta: " + entero3);
        System.out.println("==================================================");
        EnteroEnorme entero5 = new EnteroEnorme("123456789");
        EnteroEnorme entero6 = new EnteroEnorme("012345678");
        entero5.multiplicar(entero6);
        System.out.println("multiplicar: " + entero5);
        System.out.println("==================================================");
        EnteroEnorme entero7 = new EnteroEnorme("123456");
        EnteroEnorme entero8 = new EnteroEnorme("123456");
        System.out.printf("entero 7 rd igual a entero 8: %b%n" , entero7.esIgualA(entero8));
        System.out.println("==================================================");
        EnteroEnorme entero9 = new EnteroEnorme("123456");
        EnteroEnorme entero10 = new EnteroEnorme("123457");
        System.out.printf("entero 9 no igual a entero 10: %b%n" , entero9.noEsIgualA(entero10));
        System.out.println("==================================================");
        EnteroEnorme entero11 = new EnteroEnorme("123457");
        EnteroEnorme entero12 = new EnteroEnorme("123456");
        System.out.printf("entero 11 es mayor a entero 12: %b%n" , entero11.esMayor(entero12));
        System.out.println("==================================================");
        EnteroEnorme entero13 = new EnteroEnorme("123456");
        EnteroEnorme entero14 = new EnteroEnorme("123457");
        System.out.printf("entero 13 es mayor a entero 14: %b%n" , entero13.esMenor(entero14));
        System.out.println("==================================================");
        EnteroEnorme entero15 = new EnteroEnorme("123457");
        EnteroEnorme entero16 = new EnteroEnorme("123456");
        System.out.printf("entero 15 es mayor a entero 16: %b%n" , entero15.esMayorOIgualQue(entero16));
        System.out.println("==================================================");
        EnteroEnorme entero17 = new EnteroEnorme("123457");
        EnteroEnorme entero18 = new EnteroEnorme("123456");
        System.out.printf("entero 16 es mayor a entero 18: %b%n" , entero17.esMenorOIgualQue(entero18));
        System.out.println("==================================================");
    }
}


