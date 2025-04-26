package product.roof;

public class ConcreteRoofing implements Roof {

    public ConcreteRoofing() {
        System.out.println("Concrete Roofing");
    }

    @Override
    public String toString() {
        return "Concrete Roofing";
    }
}
