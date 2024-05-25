package n3.ex1;

public class FrenarCocheCommand implements Command{
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
