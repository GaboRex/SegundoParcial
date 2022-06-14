package Ejercicios.E3;

public class Notificaciones {
    private String videosPublicaciones;
    private String imagenes;
    private String elementos;


    public Notificaciones(String videosPublicaciones, String imagenes) {
        this.videosPublicaciones = videosPublicaciones;
        this.imagenes = imagenes;

    }

    public String getVideosPublicaciones() {
        return videosPublicaciones;
    }

    public void setVideosPublicaciones(String videosPublicaciones) {
        this.videosPublicaciones = videosPublicaciones;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public void mostrarInfo(){
        System.out.println("\n Notificacion nuevaaaaaa!! \n ");
        System.out.println("Publicaciones de videos: " + videosPublicaciones);
        System.out.println("Imagenes:" + imagenes);
        System.out.println();
    }
}
