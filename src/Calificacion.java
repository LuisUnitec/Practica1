public class Calificacion {
    String concepto;
    double calificacion;

    @Override
    public String toString() {
        return concepto + ": " + calificacion;
    }
}
