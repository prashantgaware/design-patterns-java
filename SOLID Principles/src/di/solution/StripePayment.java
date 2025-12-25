package di.solution;

public class StripePayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Stripe Payment ");
    }
}
