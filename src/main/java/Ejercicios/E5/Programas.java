package Ejercicios.E5;

public class Programas {
    private String programasUtilizados;

    public Programas() {
    }

    public String getProgramasUtilizados() {
        return programasUtilizados;
    }

    public void setProgramasUtilizados(String programasUtilizados) {
        this.programasUtilizados = programasUtilizados;
    }

    public void mostrarInfo(){
        System.out.println(programasUtilizados);
    }
}
