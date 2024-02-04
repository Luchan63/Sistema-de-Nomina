// ejercicio 8.16
public class EnteroEnorme {

    private int[] digitos;

    // Constructor que inicializa un objeto EnteroEnorme a partir de un número largo
    public EnteroEnorme() {
        digitos = new int[40];
    }
    // contructor que toma un numero String
    public EnteroEnorme(String numero) {
        this();
        parse(numero);
    }

    // Método para inicializar desde un String
    public void parse(String numero) {
        // Obtener la longitud del número
        int longitud = numero.length();

        // Iterar sobre cada dígito del String y almacenarlo en el arreglo
        for (int i = 0; i < longitud; i++) {
            char digitoChar = numero.charAt(i); // digitamos cada string a numero
            int digito = digitoChar - '0'; // creamo la variable digito para almacenar cada numero converitdo y le restamos un string
            digitos[i] = digito; // guardamos el resultado en la variable digito
        }
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();
        boolean inicioNumero = false;

        // Iterar sobre los dígitos y construir el String resultante
        for (int digito : digitos) {
            // Omitir ceros no significativos al inicio del número
            if (digito != 0 || inicioNumero) {
                resultado.append(digito);
                inicioNumero = true;
            }
        }

        // Si el número es cero, asegurarse de devolver "0"
        if (!inicioNumero) {
            resultado.append(0);
        }

        return  resultado.toString();
    }

    public void sumar(EnteroEnorme entero)
    {
        // creamos un acumulador
        int sumar = 0;
        //iteramos sobre cada digito
        for (int i = digitos.length - 1; i >= 0; i--)
        {
            // creamos variable de para almacenar el resultado
            int sumarDigitos = digitos[i] + entero.digitos[i] + sumar;
            digitos[i] = sumarDigitos % 10;
            sumar = sumarDigitos / 10;
        }
    }

    public void restar(EnteroEnorme entero) {
        int resta = 0;

        for (int i = digitos.length - 1; i >= 0; i--) {
            int restaDigitos = digitos[i] - entero.digitos[i] - resta;

            // manejamos el prestamo si la resta es negativa
            if (restaDigitos < 0)
            {
                restaDigitos += 10;
                resta = 1;
            } else {
                resta = 0;
            }
            digitos[i] = restaDigitos;
        }
    }

    // metodo para multiplicar
    public void multiplicar(EnteroEnorme entero)
    {
        int multiplicar = 0;
        for (int i = digitos.length - 1; i >= 0; i--)
        {
        int multiplicacion = digitos[i] * entero.digitos[i] + multiplicar;

        digitos[i] = multiplicacion % 10;
        multiplicar = multiplicacion / 10;
        }
    }

    public boolean esCero()
    {
       for (int digito : digitos)
       {
           if (digito != 0)
           {
               return false;
           }
       }
       return true;
    }
    //metod para verificar que es igual
    public boolean esIgualA(EnteroEnorme entero)
    {
        for (int i = 0; i < digitos.length; i++)
        {
            if (digitos[i] != entero.digitos[i])
            {
                return false;
            }
        }
        return true;
    }
    //metodo para verificar que no son iguales
    public boolean noEsIgualA(EnteroEnorme entero)
    {
        return !esIgualA(entero);
    }

    // metodo para verificar si es mayor que otro numero
    public boolean esMayor(EnteroEnorme entero)
    {
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] > entero.digitos[i])
            {
                return true;
            }
        }
        return false;
    }

    // metodo para verificar si es menor wue otro numero
    public boolean esMenor(EnteroEnorme entero)
    {
        return !esMayor(entero);
    }

    // verificamos si es mayor o igual que el otro numero
    public boolean esMayorOIgualQue(EnteroEnorme entero)
    {
        return esMayor(entero)||esIgualA(entero);
    }

    // verificamos si es n¡menor o igual que el otro numero
    public boolean esMenorOIgualQue(EnteroEnorme entero) {
        return esMenor(entero) || esIgualA(entero);
    }
}