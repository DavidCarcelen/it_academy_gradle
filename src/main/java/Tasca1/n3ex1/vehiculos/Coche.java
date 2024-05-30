package Tasca1.n3ex1.vehiculos;

public class Coche extends Vehiculo{

    public Coche(String tipo) {

        super(tipo);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
