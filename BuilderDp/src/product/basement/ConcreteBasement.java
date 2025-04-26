package product.basement;

public class ConcreteBasement implements Basement {

    public ConcreteBasement() {
        System.out.println("Concrete Basement");
    }

    @Override
    public String toString() {
        return "Concrete Basement";
    }

}
