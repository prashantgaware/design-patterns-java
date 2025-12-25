package di.problem;

public class RazorpayPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Razorpay Payment ");
    }
}
