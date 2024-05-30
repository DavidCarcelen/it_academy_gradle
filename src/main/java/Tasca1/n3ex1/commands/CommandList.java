package Tasca1.n3ex1.commands;

import Tasca1.n3ex1.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements Command{
    private List<Command> commandsList = new ArrayList<>();

    public void addCommand(Command command){
        commandsList.add(command);
    }

    @Override
    public void execute(Vehiculo vehiculo) {
        commandsList.forEach(x -> x.execute(vehiculo));
    }
}
