package Tasca1.n2ex1.agenda;

import Tasca1.n2ex1.direccion.Direccion;
import Tasca1.n2ex1.telefono.Telefono;

public interface AgendaAbstractFactory {
    Direccion crearDireccion(String calle, String ciudad, String estadoOcodigoPostal, String codigoPostal);
    Telefono crearTelefono(String codigoArea, String numero);
}
