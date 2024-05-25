package n2.ex1;

public class AgendaUSAFactory implements AgendaAbstractFactory {
    @Override
    public Direccion crearDireccion(String calle, String ciudad, String estado, String codigoPostal) {
        return new DireccionUSA(calle, ciudad, estado, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String codigoArea, String numero) {
        return new TelefonoUSA(codigoArea, numero);
    }
}
