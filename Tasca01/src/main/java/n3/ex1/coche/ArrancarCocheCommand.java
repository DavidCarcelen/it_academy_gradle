package n3.ex1.coche;

import n3.ex1.Command;

public class ArrancarCocheCommand implements Command {
    private Coche coche;

    public ArrancarCocheCommand(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void execute() {
        coche.arrancar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer arrancar");
    }
}
