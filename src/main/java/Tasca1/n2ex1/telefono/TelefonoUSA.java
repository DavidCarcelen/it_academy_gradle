package Tasca1.n2ex1.telefono;

public class TelefonoUSA implements Telefono{
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
