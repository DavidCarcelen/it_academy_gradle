package Tasca2.n2ex1;

public class Zapateria {

    private final EventListener eventListener;


    public Zapateria(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public String operation(Ticket ticket){
        System.out.println("Realizando Callback, cobrando");
        return eventListener.payment(ticket);
    }


}
