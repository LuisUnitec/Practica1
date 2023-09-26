package Erick;

public class Pasajero {
    public String id;
    public String  nombre;
    public int cantViajesRealizados;

    @Override
    public String toString(){
        return nombre + "   Cantidad de viajes realizados:  "+cantViajesRealizados;
    }
}
