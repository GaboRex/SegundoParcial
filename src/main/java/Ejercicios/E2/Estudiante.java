package Ejercicios.E2;


public class Estudiante extends Persona{
    public Estudiante(IChatJuegos chatJuegos) {
        super(chatJuegos);
    }

    @Override
    public void send(String msg, String ruta) {
        chatJuegos.send(msg,this, ruta);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre del jugador: " + getNombre() );
        System.out.println("Recibio este mensaje: " + msg);
    }
}

