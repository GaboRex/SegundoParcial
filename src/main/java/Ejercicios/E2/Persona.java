package Ejercicios.E2;

public abstract class Persona {
    protected IChatJuegos chatJuegos;

    private String alias;

    private String nombre;

    private String ranking;




    public Persona(String alias, String nombre, String equipo) {
        this.alias = alias;
        this.nombre = nombre;
    }


    public Persona(IChatJuegos chatDeJuegos) {
        this.chatJuegos = chatDeJuegos;
    }

    public IChatJuegos getChatDeJuegos() {
        return chatJuegos;
    }

    public void setChatDeJuegos(IChatJuegos chatDeJuegos) {
        this.chatJuegos = chatDeJuegos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public abstract void send(String msg, String ruta);
    public abstract void received(String msg);
}
