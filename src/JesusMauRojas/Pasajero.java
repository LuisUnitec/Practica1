package JesusMauRojas;

public class Pasajero {
    public String id;
    public String nombre;
    public int cantViajesRealizados;
    @Override
    public String toString(){
        return "Nombre de Pasajero: " + nombre + "\nCantidad de Viajes Realizados: " + cantViajesRealizados;
    }
}
