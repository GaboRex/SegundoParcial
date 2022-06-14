package Ejercicios.E2;

import java.util.ArrayList;
import java.util.List;

public class ChatJuego implements  IChatJuegos{
    //creamos lista
    List<Persona> players = new ArrayList<>();
    //añadimos jugadores a la lista
    public ChatJuego agregarJugadores(Persona player){
        players.add(player);
        return this;
    }

    @Override
    public void send(String msg, Persona pe, String ruta) {
        if(ruta.equals("Todos")){
            for(Persona jugadorM: players){
                jugadorM.received(msg);
            }

        }else if(ruta.equals("Mi equipo")){
            for(Persona jugadorM: players){
                if(pe.getClass().equals(jugadorM.getClass())){
                    jugadorM.received(msg);
                }
            }
        }
    }
}
