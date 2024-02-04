public class Complejo {
    private double real;
    private double imaginario;
    public Complejo(double real , double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo()
    {
        this.real = 0;
        this.imaginario = 0;
    }

    public void sumarEnteros(Complejo num){
        this.real += num.real;
        this.imaginario += num.imaginario;
    }

    public void restarEnteros(Complejo num){
        this.real -= num.real;
        this.imaginario -= num.imaginario;
    }

    public String toString(){
        return String.format(this.real+ " + (" + this.imaginario +")i" );
    }
}