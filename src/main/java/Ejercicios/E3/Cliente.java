package Ejercicios.E3;

public class Cliente {
    public static void main(String[] args) {

        Web paginaWeb = new Web();

        paginaWeb.attach(new UsuarioPagina("Publicaciones e imagenes ", new Persona("Gabriel", "34234324343")));
        paginaWeb.attach(new UsuarioPagina("Publicaciones e imagenes ", new Persona("Arianne", "34234324324545")));
        paginaWeb.attach(new UsuarioPagina("Publicaciones e imagenes ", new Persona("Eynar", "435435435435435")));
        paginaWeb.attach(new UsuarioPagina("Publicaciones e imagenes ", new Persona("Alexis", "6767676766")));
        paginaWeb.attach(new UsuarioPagina("Publicaciones e imagenes ", new Persona(" Jorge", "56456546546546")));

        paginaWeb.noti(new Notificaciones("La pagina que sigue subio un nuevo video!", " Tambien pasate por nuestro sector de imagenes tene os 10 novedades"));
    }
}

