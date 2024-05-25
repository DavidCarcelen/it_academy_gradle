package n3.ex1;

public class FrenarBarcoCommand implements Command{
    private Barco barco;

    public FrenarBarcoCommand(Barco barco) {

        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.frenar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer frenar");
    }
}
