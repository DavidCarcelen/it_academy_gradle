package n3.ex1.bicicleta;

import n3.ex1.Command;
import n3.ex1.bicicleta.Bicicleta;

public class AcelerarBicicletaCommand implements Command {
    private Bicicleta bicicleta;

    public AcelerarBicicletaCommand(Bicicleta bicicleta) {

        this.bicicleta = bicicleta;
    }

    @Override
    public void execute() {
        bicicleta.acelerar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer acelerar");
    }
}
