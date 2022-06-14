package Ejercicios.E1;

public class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void mostrarInfo(){
        System.out.println("------Contenido del documento-----");
        System.out.println("contenido");
    }
}
