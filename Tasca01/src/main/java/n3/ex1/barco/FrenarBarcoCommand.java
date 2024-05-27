package n3.ex1.barco;

import n3.ex1.Command;

public class FrenarBarcoCommand implements Command {
    private Barco barco;

    public FrenarBarcoCommand(Barco barco) {

        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.frenar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer frenar");
    }
}
