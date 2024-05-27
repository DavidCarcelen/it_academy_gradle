package n3.ex1.bicicleta;

import n3.ex1.Command;
import n3.ex1.bicicleta.Bicicleta;

public class FrenarBicicletaCommand implements Command {
    private Bicicleta bicicleta;

    public FrenarBicicletaCommand(Bicicleta bicicleta) {

        this.bicicleta = bicicleta;
    }

    @Override
    public void execute() {
        bicicleta.frenar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer frenar");
    }
}

