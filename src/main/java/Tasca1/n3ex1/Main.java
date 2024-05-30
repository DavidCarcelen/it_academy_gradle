package Tasca1.n3ex1;

import Tasca1.n3ex1.commands.*;
import Tasca1.n3ex1.vehiculos.*;

public class Main {
    public static void main(String[] args) {

        Vehiculo coche  = new Coche("4x4");
        Vehiculo avion = new Avion("avioneta");
        Vehiculo bici = new Bicicleta("bici electrica");
        Vehiculo barco = new Barco ("Sunseeker");


        CommandList commandList = new CommandList();

        commandList.addCommand(new Acelerar());
        commandList.addCommand(new Frenar());
        commandList.addCommand(new Arrancar());

        CommandExecuter commandExecuter = new CommandExecuter();


        commandExecuter.execute(commandList, coche );
        commandExecuter.execute(commandList, avion );
        commandExecuter.execute(commandList, bici );
        commandExecuter.execute(commandList, barco );
    }

}
