package Tasca1.n2ex1.direccion;

public class DireccionUK extends Direccion{
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public DireccionUK(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String getDireccion() {
        return calle + ", " + ciudad + ", " + codigoPostal + ", Reino Unido";
    }
}
