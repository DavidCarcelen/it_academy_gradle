package Tasca2.n2ex1;

public class PasarelaDePago implements EventListener{
    @Override
    public String payment(Ticket ticket) {
        String mensaje = switch (ticket.getPaymentMethod()) {
            case PAYPAL -> "pagando con Paypal. \n";
            case BANK -> "pagando con Bank account. \n";
            case CREDITCARD -> "pagando con Credit Card. \n";
        };
        return mensaje + ticket;
    }
}
