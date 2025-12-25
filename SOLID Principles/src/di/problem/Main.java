package di.problem;

public class Main {
    public static void main(String[] args) {
        StripePayment stripePayment = new StripePayment();
        System.out.println("Stripe Payment ");
        stripePayment.pay();
    }
}
