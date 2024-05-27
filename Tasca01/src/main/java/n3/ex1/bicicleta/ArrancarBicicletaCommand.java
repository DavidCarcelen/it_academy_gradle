package n3.ex1.bicicleta;

import n3.ex1.Command;
import n3.ex1.bicicleta.Bicicleta;

public class ArrancarBicicletaCommand implements Command {
    private Bicicleta bicicleta;

    public ArrancarBicicletaCommand(Bicicleta bicicleta) {

        this.bicicleta = bicicleta;
    }

    @Override
    public void execute() {
        bicicleta.arrancar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer arrancar");
    }

}
