import java.util.ArrayList;
public class GestorDatos
{
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    public  void agregarPersonas(Persona persona)
    {
        personas.add(persona);
    }

    public ArrayList<Persona> listarPersonas()
    {
        return personas;
    }
    public Persona getIMCMayor()
    {
        Persona personaMayorIMC = null;
        for (Persona p : personas)
        {
            if (personaMayorIMC == null)
            {
                personaMayorIMC = p;
            } else
            {
                if (p.getImc() > personaMayorIMC.getImc())
                {
                    personaMayorIMC = p;
                }
            }
        }
        return personaMayorIMC;
    }

    public Persona getIMCMenor()
    {
        Persona personaIMCMenor = null;
        for (Persona personaMenor : personas)
        {
            if (personaIMCMenor == null)
            {
                personaIMCMenor = personaMenor;
            } else {
                if (personaMenor.getImc() < personaIMCMenor.getImc())
                {
                    personaIMCMenor = personaMenor;
                }
            }
        }
        return personaIMCMenor;
    }

    public double getPromedio()
    {
        double promedio = 0;

        for (Persona persona : personas)
        {
            promedio += persona.getImc();
        }
        return  promedio /personas.size();
    }

}
