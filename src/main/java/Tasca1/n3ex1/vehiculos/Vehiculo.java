package Tasca1.n3ex1.vehiculos;

public class Vehiculo {
    protected String tipo;
    public Vehiculo(String tipo){
        this.tipo = tipo;

    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
