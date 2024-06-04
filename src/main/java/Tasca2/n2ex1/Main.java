package Tasca2.n2ex1;

public class Main {
    static Ticket pago1 = new Ticket("Unos zapatos", 23.50, PaymentMethod.PAYPAL);
    static Ticket pago2 = new Ticket("Unas bambas", 48.50, PaymentMethod.BANK);
    static Ticket pago3 = new Ticket("Unos calcetines", 7.00, PaymentMethod.CREDITCARD);
    static String result;
    static EventListener listener = new PasarelaDePago();
    static Zapateria zapateria = new Zapateria(listener);
    public static void main(String[] args) {

        result = zapateria.operation(pago1);
        System.out.println("Callback realizado, " + result + "\n");

        result = zapateria.operation(pago2);
        System.out.println("Callback realizado, " + result + "\n");

        result = zapateria.operation(pago3);
        System.out.println("Callback realizado, " + result + "\n");
    }
}
