package Tasca2.n2ex1;

public class Main {
    public static void main(String[] args) {

        Ticket pago1 = new Ticket("Unos zapatos", 23.50, PaymentMethod.PAYPAL);
        Ticket pago2 = new Ticket("Unas bambas", 23.50, PaymentMethod.BANK);
        Ticket pago3 = new Ticket("Unos calcetines", 23.50, PaymentMethod.CREDITCARD);

        EventListener listener = new PasarelaDePago();
        Zapateria zapateria = new Zapateria(listener);

        String result;

        result = zapateria.operation(pago1);
        System.out.println("Callback realizado, " + result + "\n");

        result = zapateria.operation(pago2);
        System.out.println("Callback realizado, " + result + "\n");

        result = zapateria.operation(pago3);
        System.out.println("Callback realizado, " + result + "\n");
    }
}
