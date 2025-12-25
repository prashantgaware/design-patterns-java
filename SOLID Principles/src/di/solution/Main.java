package di.solution;

public class Main {
    public static void main(String[] args) {
        Payment stripePayment = new StripePayment();
        System.out.println("Stripe Payment ");
        stripePayment.pay();

        Payment razorpayPayment = new RazorpayPayment();
        System.out.println("RazorpayPayment ");
        razorpayPayment.pay();
    }
}
