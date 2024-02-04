
public class Fecha {
    private int day;
    private int month;
    private int year;
    private static final int[] diaPorMes = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha(int month, int day, int year) {
        if (month > 0 && month <= 12) {
            if (day > 0 && (day <= diaPorMes[month] || month == 2 && day == 29)) {
                if (month != 2 || day != 29 || year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    this.day = day;
                    this.month = month;
                    this.year = year;
                    System.out.printf("constructor de objeto Fecha para la fecha %s%n", this);
                } else {
                    throw new IllegalArgumentException("dia (" + day + ") fuera del rango para el mes y anio especificos");
                }
            } else {
                throw new IllegalArgumentException("dia (" + day + ") fuera de rango para el mes y el año especificados");
            }
        } else {
            throw new IllegalArgumentException("mes (" + month + ") debe ser 1-12");
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", this.month, this.day, this.year);
    }
}
