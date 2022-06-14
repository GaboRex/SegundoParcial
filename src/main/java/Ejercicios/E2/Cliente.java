package Ejercicios.E2;

public class Cliente {
    public static void main(String[] args) {
        ChatJuego slack = new ChatJuego();

        Estudiante player1 = new Estudiante(slack);
        player1.setNombre("Eynar");
        player1.setAlias("El legendario");
        player1.setRanking("Top 1 Bolivia");
        //-------------------- first player------------------
        Estudiante player2 = new Estudiante(slack);
        player2.setNombre("Thor");
        player2.setAlias("Hijo de Odin");
        player2.setRanking("Top 1 Asgard");

//-------------------- second player------------------
        Estudiante player3 = new Estudiante(slack);
        player3.setNombre("Ariane");
        player3.setAlias("Legenda");
        player3.setRanking("Top 10 La Paz");

//-------------------- first docentes------------------

        Docentes player4 = new Docentes(slack);
        player4.setNombre("Alexis");
        player4.setAlias("El tardes");
        player4.setRanking("Top 20 la paz");

//-------------------- first docentes------------------
        Docentes player5 = new Docentes(slack);
        player5.setNombre("Carlos");
        player5.setAlias("El leches");
        player5.setRanking("Top 500 apenas");

        slack.agregarJugadores(player1).agregarJugadores(player2).agregarJugadores(player3).
                agregarJugadores(player4).agregarJugadores(player5);

        System.out.println("\n----------------MENSAJE NUEVOOOO!!!!!----------------\n");
        player5.send("Hello everyone!", "Todos");
        System.out.println("\n----------------MENSAJE NUEVOOOO!!!!!----------------\n");
        player4.send("Estan listas hijitas?", "Mi equipo");
        System.out.println("\n----------------MENSAJE NUEVOOOO!!!!!----------------\n");
        player2.send("Unas partidas para calentar", "Mi equipo");
    }
}

