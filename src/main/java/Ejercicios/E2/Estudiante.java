package Ejercicios.E2;


public class Estudiante extends Persona{
    public Estudiante(IChatJuegos chatJuegos) {
        super(chatJuegos);
    }

    @Override
    public void send(String msg, String ruta) {
        chatJuegos.send(msg, this, ruta );
    }

    @Override
    public void receive(String msg) {
        System.out.println("El Jugador");
    }
}
