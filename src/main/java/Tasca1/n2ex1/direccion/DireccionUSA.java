package Tasca1.n2ex1.direccion;

public class DireccionUSA implements Direccion{
    private String calle;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    public DireccionUSA(String calle, String ciudad, String estado, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String getDireccion() {
        return calle + ", " + ciudad + ", " + estado + " " + codigoPostal + ", USA.";
    }
}
