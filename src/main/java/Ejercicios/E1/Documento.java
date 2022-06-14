package Ejercicios.E1;

public class Documento {
    private String contenido;
    private String newContenido;
    private String id;


    public Documento(String contenido, String newContenido, String id) {
        this.contenido = contenido;
        this.newContenido = newContenido;
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNewContenido() {
        return newContenido;
    }

    public void setNewContenido(String newContenido) {
        this.newContenido = newContenido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarInfo(){
        System.out.println("Mi documento: ");
        System.out.println("ID: " + id);
        System.out.println("------Contenido del documento-----");
        System.out.println("contenido");
    }
}
