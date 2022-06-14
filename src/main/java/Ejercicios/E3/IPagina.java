package Ejercicios.E3;

public interface IPagina {
    void attach(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Notificaciones notificaciones);
}
