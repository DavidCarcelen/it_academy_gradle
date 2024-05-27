package n3.ex1.barco;

import n3.ex1.Command;

public class ArrancarBarcoCommand implements Command {
    private Barco barco;

    public ArrancarBarcoCommand(Barco barco) {

        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.arrancar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer arrancar");
    }
}

