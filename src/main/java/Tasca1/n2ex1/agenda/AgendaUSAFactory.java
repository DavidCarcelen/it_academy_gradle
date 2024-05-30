package Tasca1.n2ex1.agenda;

import Tasca1.n2ex1.direccion.Direccion;
import Tasca1.n2ex1.direccion.DireccionUSA;
import Tasca1.n2ex1.telefono.Telefono;
import Tasca1.n2ex1.telefono.TelefonoUSA;

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
