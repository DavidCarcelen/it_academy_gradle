package n2.ex1;

public class TelefonoUSA extends Telefono{
    private String prefix;
    private String numero;

    public TelefonoUSA(String prefix, String numero) {
        this.prefix = prefix;
        this.numero = numero;
    }

    @Override
    public String getTelefono() {
        return "+1 " + prefix + "-" + numero;
    }
}
