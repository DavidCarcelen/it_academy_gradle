package n3.ex1;

public class AcelerarAvionCommand implements Command{
    private Avion avion;

    public AcelerarAvionCommand(Avion avion) {

        this.avion = avion;
    }

    @Override
    public void execute() {
        avion.acelerar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer acelerar");
    }
}
