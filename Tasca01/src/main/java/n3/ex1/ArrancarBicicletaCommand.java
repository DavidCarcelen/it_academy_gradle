package n3.ex1;

public class ArrancarBicicletaCommand implements Command{
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
