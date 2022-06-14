package Ejercicios.E3;

public class UsuarioPagina implements IUser{
    String elementos;
    Persona persona;

    public UsuarioPagina(String elementos, Persona persona) {
        this.elementos = elementos;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificaciones newNotificaciones) {
        System.out.println("\n Notificaciones: \n " + msg );
        System.out.println("Persona: " +persona.getNombre());
        System.out.println("Preferencia: "+ elementos);
        newNotificaciones.mostrarInfo();
    }

    @Override
    public void update2(String msg, Notificaciones newNotificaciones) {
        System.out.println("\n Notificaciones: \n " + msg );
        System.out.println("Persona: " +persona.getNombre());
        System.out.println("Preferencia: "+ elementos);
        newNotificaciones.mostrarInfo();
    }

    @Override
    public String getPreferenciasNotificaciones(){
        return elementos;
    }

    public Persona getPersona(){
        return persona;
    }
}
