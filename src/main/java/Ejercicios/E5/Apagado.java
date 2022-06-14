package Ejercicios.E5;

public class Apagado implements IStateCompu{

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("<< APAGANDO >>");
        computadora.getMemoriaRam().setCapacidadUtilizada(0);
        computadora.getCpu().setCapacidadUtilizada(0);
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
        computadora.getProgramas().mostrarInfo();
    }
}

