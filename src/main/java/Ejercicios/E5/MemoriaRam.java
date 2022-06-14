package Ejercicios.E5;


public class MemoriaRam {
    private String capacidadTotal;
    private int capacidadUtilizada;
    private String descripcion;

    public MemoriaRam(){}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public MemoriaRam setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public int getCapacidadUtilizada() {
        return capacidadUtilizada;
    }

    public MemoriaRam setCapacidadUtilizada(int capacidadUtilizada) {
        this.capacidadUtilizada = capacidadUtilizada;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public MemoriaRam setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public void showInfo(){
        System.out.println("INFORMACION MEMORIA RAM");
        System.out.println("Capacidad Total: " + capacidadTotal);
        System.out.println("Capacidad Utilizada: " + capacidadUtilizada);
        System.out.println("Descripcion: " + descripcion);
    }
}
