
public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2() {
        this(0, 0, 0);
    }

    public Tiempo2(int hora) {
        this(hora, 0, 0);
    }

    public Tiempo2(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tiempo2(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24) {
            if (minuto >= 0 && minuto < 60) {
                if (segundo >= 0 && segundo < 60) {
                    this.hora = hora;
                    this.minuto = minuto;
                    this.segundo = segundo;
                } else {
                    throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
                }
            } else {
                throw new IllegalArgumentException("minuto de estar entre 0 y 59");
            }
        } else {
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        }
    }

    public Tiempo2(Tiempo2 tiempo) {
        this(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
    }

    public void setTiempo(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24) {
            if (minuto >= 0 && minuto < 60) {
                if (segundo >= 0 && segundo < 60) {
                    this.hora = hora;
                    this.minuto = minuto;
                    this.segundo = segundo;
                } else {
                    throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
                }
            } else {
                throw new IllegalArgumentException("minuto de estar entre 0 y 59");
            }
        } else {
            throw new IllegalArgumentException("hora debe estar entre 0 y 23");
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("la hora debe estar entre 0 y 23");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("el minuto debe estar entre 0 y 59");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("El segundo de estar entre 0 y 59");
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", this.getHora(), this.getSegundo(), this.getSegundo());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %S", this.getHora() != 0 && this.getHora() != 12 ? this.getHora() % 12 : 12, this.getMinuto(), this.getSegundo(), this.getHora() < 12 ? "AM" : "PM");
    }
}
