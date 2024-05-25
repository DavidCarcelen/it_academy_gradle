package n3.ex1;

public class AcelerarCocheCommand implements Command {
    private Coche coche;

    public AcelerarCocheCommand(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void execute() {
        coche.acelerar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer acelerar");
    }
}
