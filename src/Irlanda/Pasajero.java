package Irlanda;

public class Pasajero {
    public String id;
   public String nombre;
   public int cantViajesRealizado;
    @Override
    public String toString() {
        return nombre + ". cantidad de viajes realizados: " + cantViajesRealizado;
    }
}
