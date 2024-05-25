package n2.ex1;

public class DireccionUSA extends Direccion{
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
