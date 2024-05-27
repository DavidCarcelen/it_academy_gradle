package n3.ex1;

import n3.ex1.avion.Avion;
import n3.ex1.barco.Barco;
import n3.ex1.bicicleta.AcelerarBicicletaCommand;
import n3.ex1.bicicleta.ArrancarBicicletaCommand;
import n3.ex1.bicicleta.Bicicleta;
import n3.ex1.bicicleta.FrenarBicicletaCommand;
import n3.ex1.coche.AcelerarCocheCommand;
import n3.ex1.coche.ArrancarCocheCommand;
import n3.ex1.coche.Coche;
import n3.ex1.coche.FrenarCocheCommand;

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
