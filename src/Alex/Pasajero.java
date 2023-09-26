package Alex;

public class Pasajero {
    public String id, nombre;
    public int cantViajesReal;

    @Override
    public String toString(){
        return nombre + "- cantidad de viajes realizados: "
        + cantViajesReal;
    }
}
