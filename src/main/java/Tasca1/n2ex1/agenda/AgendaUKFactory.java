package Tasca1.n2ex1.agenda;

import Tasca1.n2ex1.direccion.Direccion;
import Tasca1.n2ex1.direccion.DireccionUK;
import Tasca1.n2ex1.telefono.Telefono;
import Tasca1.n2ex1.telefono.TelefonoUK;

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
