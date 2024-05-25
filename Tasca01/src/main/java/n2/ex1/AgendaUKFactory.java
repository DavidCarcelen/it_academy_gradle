package n2.ex1;

public class AgendaUKFactory implements AgendaAbstractFactory{
    @Override
    public Direccion crearDireccion(String calle, String ciudad, String estadoOcodigoPostal, String codigoPostal) {
        return new DireccionUK(calle, ciudad, codigoPostal);
    }

    @Override
    public Telefono crearTelefono(String codigoArea, String numero) {
        return new TelefonoUK(codigoArea, numero);
    }
}
