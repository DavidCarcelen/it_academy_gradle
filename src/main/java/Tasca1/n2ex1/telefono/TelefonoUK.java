package Tasca1.n2ex1.telefono;

public class TelefonoUK implements Telefono{

    private String prefix;
    private String numero;

    public TelefonoUK(String prefix, String numero) {
        this.prefix = prefix;
        this.numero = numero;
    }

    @Override
    public String getTelefono() {
        return "+44 " + prefix + " " + numero;
    }
}
