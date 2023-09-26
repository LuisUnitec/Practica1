package aiko;

public class Pasajero {
    public String id,nombre;
    public int cantViajesRealizados;

    @Override
    public String toString() {
        return nombre + " cantidad de viajes realizados: " + cantViajesRealizados;
    }
}
