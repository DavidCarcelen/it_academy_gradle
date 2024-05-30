package Tasca1.n3ex1.vehiculos;

public class Bicicleta extends Vehiculo{

    public Bicicleta(String tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
