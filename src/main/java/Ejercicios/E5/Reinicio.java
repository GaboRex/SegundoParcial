package Ejercicios.E5;

public class Reinicio implements IStateCompu{
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("<< REINICIANDO >>");
        computadora.getMemoriaRam().setCapacidadUtilizada(0);
        computadora.getCpu().setCapacidadUtilizada(0);
        computadora.getProgramas().setProgramasUtilizados("Cerrando programas, ninguno estara disponible");
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
        computadora.getProgramas().mostrarInfo();
    }
}

