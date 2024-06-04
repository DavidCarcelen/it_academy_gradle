package Tasca2.n2ex1;

public class Ticket {
    private String about;
    private double amount;
    private PaymentMethod paymentMethod;

    public Ticket(String name, double amount, PaymentMethod paymentMethod) {
        this.about = name;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return about;
    }

    public void setName(String name) {
        this.about = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "about='" + about + '\'' +
                ", amount=" + amount +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
