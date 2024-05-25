package n3.ex1;

public class AcelerarBarcoCommand implements Command{

    private Barco barco;

    public AcelerarBarcoCommand(Barco barco) {

        this.barco = barco;
    }

    @Override
    public void execute() {
        barco.acelerar();
    }

    @Override
    public void undo() {
        System.out.println("Desacer acelerar");
    }
}
