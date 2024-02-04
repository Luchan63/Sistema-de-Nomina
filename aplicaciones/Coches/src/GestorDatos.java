import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDatos
{
    Scanner scannerStr = new Scanner(System.in);
    private ArrayList<Coche> coches = new ArrayList<Coche>();
    private int id = 1;

    public void agregarCoche(Coche coche)
    {
        coche.setId(id++);
        coches.add(coche);
    }

    public ArrayList<Coche> listarCoches()
    {
        ArrayList<Coche> cochesBorrados = new ArrayList<Coche>();
        return coches;
    }

    public ArrayList<Coche> busquedaPorColor(String color)
    {
        ArrayList<Coche> listaPorColor = new ArrayList<Coche>();

        for (Coche coche : coches){
        if (color.contains(coche.getColor()))
        {
           listaPorColor.add(coche);
        }

        }
        return listaPorColor;
    }


}
