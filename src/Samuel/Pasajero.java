package Samuel;

public class Pasajero {
    public String id;
    public String nombre;
    public int viajesRealizados;

    @Override
    public String toString(){
        return nombre + ". Cantidad de viajes realizados: " + viajesRealizados;
    }
}
