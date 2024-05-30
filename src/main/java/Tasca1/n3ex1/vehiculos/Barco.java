package Tasca1.n3ex1.vehiculos;

public class Barco extends Vehiculo{

    public Barco(String tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Barco{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
