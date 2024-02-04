public class Tiempo2Mejora {
    private int segundoDesdeMediaNoche; // representacion interna en segundos

    // Constructor sin argumentos
    //inicializar variable deminstancia a cero
    public Tiempo2Mejora() {
        this(0, 0, 0); // invoca al constructor con tres argumentos
    }

    // Constructor con tres argumentos
    public Tiempo2Mejora(int hora, int minuto, int segundo) {
        establecerTiempo(hora, minuto, segundo);
    }

    // Constructor con un argumento (hora)
    public Tiempo2Mejora(int hora) {
        this(hora, 0, 0); // invoca al constructor con tres parametros
    }

    // Constructor con dos argumentos (hora y minuto)
    public Tiempo2Mejora(int hora, int minuto) {
        this(hora, minuto, 0); // invoca al constructor con tres parametros
    }

    // Constructor copia
    public Tiempo2Mejora(Tiempo2Mejora tiempo) {
        this(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
    }

    // Método para establecer el tiempo basado en segundos desde medianoche
    public void establecerTiempo(int hora, int minuto, int segundo) {
        int totalSegundos = hora * 3600 + minuto * 60 + segundo;

        if (totalSegundos < 0 || totalSegundos >= 86400) {
            throw new IllegalArgumentException("El tiempo debe estar entre 00:00:00 y 23:59:59");
        }

        this.segundoDesdeMediaNoche = totalSegundos;
    }

    // Método para obtener la hora
    public int getHora() {
        return segundoDesdeMediaNoche / 3600;
    }

    // Método para obtener el minuto
    public int getMinuto() {
        return (segundoDesdeMediaNoche % 3600) / 60;
    }

    // Método para obtener el segundo
    public int getSegundo() {
        return segundoDesdeMediaNoche % 60;
    }

    // Método para convertir a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    // Método para convertir a String en formato estándar (H:HM:SS AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }
}