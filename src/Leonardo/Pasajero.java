package Leonardo;

public class Pasajero {
    public String id;
    public String nombre;
    public int cantViajesRealizados;

    @Override
    public String toString(){
        return nombre + ". cantidad de viajes realizados: " + cantViajesRealizados;

    }
}
