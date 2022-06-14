package Ejercicios.E5;

import java.lang.reflect.Member;

public class Computadora {
    private Programas programas;
    private MemoriaRam memoriaRam;
    private CPU cpu;
    private IStateCompu state;

    public Computadora(){
        memoriaRam = new MemoriaRam();
        memoriaRam.setCapacidadUtilizada(5).setCapacidadTotal("16GB").setDescripcion("Memoria RAM");
        cpu = new CPU();
        cpu.setCapacidadUtilizada(5).setCapacidadTotal("64bits").setDescripcion("CPU");
        programas = new Programas();
        programas.setProgramasUtilizados("Ningún programa esta siendo utilizado");
        state = new Apagado();
    }

    public Programas getProgramas() {
        return programas;
    }

    public void setProgramas(Programas programas) {
        this.programas = programas;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public IStateCompu getState() {
        return state;
    }

    public void setState(IStateCompu state) {
        this.state = state;
    }

    public void resourceManager() throws InterruptedException {
        state.resourceManager(this);
    }
}
