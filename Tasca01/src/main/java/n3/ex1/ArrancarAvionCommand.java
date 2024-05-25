package n3.ex1;

public class ArrancarAvionCommand implements Command{
    private Avion avion;

    public ArrancarAvionCommand(Avion avion) {

        this.avion = avion;
    }

    @Override
    public void execute() {
        avion.arrancar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer arrancar");
    }
}
