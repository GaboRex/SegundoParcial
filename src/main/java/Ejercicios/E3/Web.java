package Ejercicios.E3;
import java.util.ArrayList;
import java.util.List;
public class Web implements  IPagina{
    private List<Notificaciones> notificacionesList = new ArrayList<>();
    private List<IUser> usuarios = new ArrayList<>();

    public Web() {}

    public void noti(Notificaciones notificaciones) {
        notificacionesList.add(notificaciones);
        notifyObservers(notificaciones);
    }

    @Override
    public void attach(IUser observer) {
        usuarios.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        usuarios.remove(observer);

    }

    @Override
    public void notifyObservers(Notificaciones notificaciones) {
        for (IUser user : usuarios) {
            if (user.getPreferenciasNotificaciones().equals(notificaciones.getElementos())) {
                user.update("Revisa, tus notificaciones te puedesd perder de mucho!", notificaciones);
            } else {
                user.update2("DESPIERTAAA, TIENES NUEVAS NOTIFICACIONES, UN BESO", notificaciones);
            }
        }
    }
}
