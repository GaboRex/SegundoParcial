package Ejercicios.E1;

public class Memento {
    private Documento state;

    public Memento(Documento documento) {
        state = documento;
    }

    public Documento getState() {
        return state;
    }
}
