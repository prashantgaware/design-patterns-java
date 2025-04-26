package product.interior;

public class ConcreteInterior implements Interior {

    public ConcreteInterior() {
        System.out.println("Concrete Interior");
    }
    @Override
    public String toString() {
        return "Concrete Interior";
    }
    
}
