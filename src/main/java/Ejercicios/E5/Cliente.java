package Ejercicios.E5;

public class Cliente {
    public static void main(String[] args) throws InterruptedException{
        Computadora computer = new Computadora();
        computer.setState(new Apagado());
       //computer.setState(new Encendido());
        //computer.setState(new Reinicio());
        computer.resourceManager();
// descomentar uno por uno para ver la funcionalidad, pero todos funcionan
    }
}

