package Ejercicios.E2;

public abstract class Persona {
    private String alias;
    private String nombre;
    private String ranking;
    protected IChatJuegos chatJuegos;
    private String equipo;

    public Persona(String alias, String nombre, String equipo) {
        this.alias = alias;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public Persona(IChatJuegos chatJuegos) {
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

    public IChatJuegos getChatJuegos() {
        return chatJuegos;
    }

    public void setChatJuegos(IChatJuegos chatJuegos) {
        this.chatJuegos = chatJuegos;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public abstract void send(String msg, String ruta);
    public abstract void receive(String msg);
}
