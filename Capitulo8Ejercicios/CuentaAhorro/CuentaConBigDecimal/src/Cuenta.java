import java.math.BigDecimal;

// ejercicio 8.18
public class Cuenta
{
    private String nombre; // variable para el nombre
    private String apellido; // variable para el apellido
    BigDecimal saldo; // variable big decimal para calculos grandes y exactos

    // contructor que recibe parametros
    public Cuenta(String nombre, String apellido, BigDecimal saldo)
    {
        this.nombre = nombre;
        this.apellido = apellido;

        if (saldo.compareTo(BigDecimal.ZERO) > 0.0){ // verificamos si el saldo esta dentro de los parametros
            this.saldo = saldo; // si esta dentro lo inicializamos
        } else {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo"); // si no enviamos un mensaje
        }
    }
    public Cuenta()
    {

    }

    // metodoss set y get nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    // metodos set y get para apellido


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    // metodos set y get de saldo

    public void setSaldo(BigDecimal saldo) {
        if (saldo.compareTo(BigDecimal.ZERO) > 0.0)
        {
            this.saldo = saldo;
        }
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal montoDeposito)
    {
        if (montoDeposito.compareTo(BigDecimal.ZERO) > 0.0)
        {
            this.saldo = montoDeposito.add(saldo);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",this.nombre,this.apellido,this.saldo);
    }
}