package n2.ex1;

public interface AgendaAbstractFactory {
    Direccion crearDireccion(String calle, String ciudad, String estadoOcodigoPostal, String codigoPostal);
    Telefono crearTelefono(String codigoArea, String numero);
}
