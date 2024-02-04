import javax.swing.*;
import java.util.ArrayList;

public class GestorPersona
{
    double imc;
    ArrayList<Persona> lisPersonas = new ArrayList<>(); // declaramos nuestra lista

    public void registrarPersona(Persona p)
    {

        String resultado = "Persona Resgitrada con exito!\n";
        resultado += "Nombre: " + p.getNombre()+ "\n";
        resultado += "Edad: "+ p.getEdad() + "\n";
        resultado += "Peso: " + p.getPeso() + "\n";
        resultado += "Altura: " + p.getAltura() + "\n";
        String imcMsj = calcularIMC(p.getPeso(), p.getAltura());
        resultado += imcMsj + "\n";
        p.setImcMsj(imcMsj);
        p.setImc(imc);
        JOptionPane.showMessageDialog(null,resultado); // mostramos en pantalla con ventana emergente

        lisPersonas.add(p); // agg el registro a nuestro listado
    }
    // calcular imc
    public String calcularIMC(double peso, double altura)
    {
        imc = peso / (altura * altura);
        // verificamos la clasificacion del peso
        String msj = "";
        if (imc < 18.50){
            msj = "Peso bajo";
        }
        if (imc > 19 && imc <= 24.99) {
            msj= "Rango normal";
        }
        if (imc > 25.00 && imc <= 29.99) {
            msj = "sobre peso";
        }
        if (imc > 30 && imc <= 40){
            msj ="obecidad";
        }
        if (imc > 40 && imc <= 45){
            msj = "obesidad Morbida";
        }

        return String.format("IMC: %.2f%n su indice indica que tiene: %s",imc,msj); // lo retomamos con String.format para poder elegir el formato y solo coger 2 decimal
    }

    // metodo para consultar la lista
    public void consultarListaPersona()
    {
        String resultado = "";
        Persona p;
        for (Persona lisPersona : lisPersonas) {
            p = lisPersona;
            resultado += "Nombre: " + p.getNombre() + "\n";
            resultado += "Edad: " + p.getEdad() + "\n";
            resultado += "Peso: " + p.getPeso() + "\n";
            resultado += "Altura: " + p.getAltura() + "\n";
            resultado += "IMC: " + p.getImcMsj() + "\n";
            resultado += "======================================\n";

        }
        JOptionPane.showMessageDialog(null,resultado);

    }
}