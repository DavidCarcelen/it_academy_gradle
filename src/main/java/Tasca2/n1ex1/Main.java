package Tasca2.n1ex1;

public class Main {
    public static void main(String[] args) {

        AgenteObservable agenteDeBolsa = new AgenteObservable();

        Observer empresa1 = new EmpresaObserver("Empresa1");
        Observer empresa2 = new EmpresaObserver("Empresa2");
        Observer empresa3 = new EmpresaObserver("Empresa3");

        agenteDeBolsa.addObserver(empresa1);
        agenteDeBolsa.addObserver(empresa2);
        agenteDeBolsa.addObserver(empresa3);

        agenteDeBolsa.setMessage("Primer aviso!!");
        agenteDeBolsa.setMessage("Segundo aviso!");
    }
}
