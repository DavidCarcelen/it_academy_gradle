package n3.ex1.coche;

import n3.ex1.Command;
import n3.ex1.coche.Coche;

public class FrenarCocheCommand implements Command {
    private Coche coche;

    public FrenarCocheCommand(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void execute() {
        coche.frenar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer frenar");
    }
}
