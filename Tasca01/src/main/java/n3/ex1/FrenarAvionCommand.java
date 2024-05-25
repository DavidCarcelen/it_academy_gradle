package n3.ex1;

public class FrenarAvionCommand implements Command{
    private Avion avion;

    public FrenarAvionCommand(Avion avion) {

        this.avion = avion;
    }

    @Override
    public void execute() {
        avion.frenar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer frenar");
    }
}
