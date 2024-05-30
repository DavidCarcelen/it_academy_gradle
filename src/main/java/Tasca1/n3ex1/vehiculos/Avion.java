package Tasca1.n3ex1.vehiculos;

public class Avion extends Vehiculo{

    public Avion(String tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
