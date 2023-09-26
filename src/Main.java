import JesusMauRojas.Pasajero;

public class Main {
    public static void main(String[] args) {
        Calificacion c = new Calificacion();
        c.concepto = "Amabilidad";
        c.calificacion = 4.7;

        Calificacion c2 = new Calificacion();
        c2.concepto = "Limpieza";
        c2.calificacion = 3.5;

        System.out.println(c);
        System.out.println(c2);

        Conductor conductor = new Conductor();
        Pasajero pasajero = new Pasajero();
        pasajero.nombre = "jose";
        pasajero.cantViajesRealizados = 5;
        System.out.println(pasajero);
    }
}