

public enum Libro {
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web Hoe to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    private final String titulo;
    private final String anioCopyright;

    Libro(String titulo, String anioCopyright) {
        this.titulo = titulo;
        this.anioCopyright = anioCopyright;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnioCopyright() {
        return anioCopyright;
    }
}
