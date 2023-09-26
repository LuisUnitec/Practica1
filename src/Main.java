import MauRubi.pasajero;

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

        pasajero pasajero = new pasajero();
        pasajero.nombre = "MauRubi";
        pasajero.cantViajesRealizados = 5 ;

        System.out.println(pasajero);

    }
}