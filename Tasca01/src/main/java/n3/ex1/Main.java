package n3.ex1;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        Avion avion = new Avion();
        Barco barco = new Barco();


        Command arrancarCoche = new ArrancarCocheCommand(coche);
        Command acelerarCoche = new AcelerarCocheCommand(coche);
        Command frenarCoche = new FrenarCocheCommand(coche);


        Command arrancarBicicleta = new ArrancarBicicletaCommand(bicicleta);
        Command acelerarBicicleta = new AcelerarBicicletaCommand(bicicleta);
        Command frenarBicicleta = new FrenarBicicletaCommand(bicicleta);


        Controlador controlador = new Controlador();


        controlador.setCommand(arrancarCoche);
        controlador.executeCommand();

        controlador.setCommand(acelerarCoche);
        controlador.executeCommand();

        controlador.setCommand(frenarCoche);
        controlador.executeCommand();


        controlador.setCommand(arrancarBicicleta);
        controlador.executeCommand();

        //...
    }

}
