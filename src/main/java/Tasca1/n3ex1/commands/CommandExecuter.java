package Tasca1.n3ex1.commands;

import Tasca1.n3ex1.vehiculos.Vehiculo;

public class CommandExecuter {
    public void execute(Command command, Vehiculo vehiculo){
        command.execute(vehiculo);
    }
}
