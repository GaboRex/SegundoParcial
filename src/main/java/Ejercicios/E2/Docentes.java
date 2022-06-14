package Ejercicios.E2;


public class Docentes extends Persona {
    public Docentes(IChatJuegos chatJuegos) {
        super(chatJuegos);
    }
    @Override
    public void send(String msg, String destino) {
        chatJuegos.send(msg,this, destino);
    }
    //----------------------------------------------------------------
    @Override
    public void received(String msg) {
        System.out.println("Nombre del jugador: " + getNombre() );
        System.out.println("Recibio el mensaje: " + msg);
    }
}
