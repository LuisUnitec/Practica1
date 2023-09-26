package eduardo;

public class Pasajero {
    public String nombre;
    public int cantViajesRealizados;

    @Override
    public String toString(){
        return nombre + " " + "Cantidad de viajes realizados: " + cantViajesRealizados;
    }
}
