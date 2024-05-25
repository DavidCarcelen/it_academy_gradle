package n2.ex1;

public class Main {
    public static void main(String[] args) {

        AgendaAbstractFactory factoryUSA = new AgendaUSAFactory();
        Direccion direccionUSA = factoryUSA.crearDireccion("742 Evergreen Terrace", "Springfield", "Utah", "62701");
        Telefono telefonoUSA = factoryUSA.crearTelefono("217", "5551234");

        System.out.println("Dirección en USA creada: " + direccionUSA.getDireccion());
        System.out.println("Teléfono (USA): " + telefonoUSA.getTelefono());


        AgendaAbstractFactory factoryUK = new AgendaUKFactory();
        Direccion direccionUK = factoryUK.crearDireccion("456 High St", "London", "", "SW1A 1AA");
        Telefono telefonoUK = factoryUK.crearTelefono("20", "79460123");

        System.out.println("Dirección en UK: " + direccionUK.getDireccion());
        System.out.println("Teléfono (UK): " + telefonoUK.getTelefono());

    }
}
