package Tasca2.n1ex1;

public class EmpresaObserver implements Observer{
    private String name;

    public EmpresaObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Observer " + name + " recibe el mensaje: " + message);
    }
}
