package product.structure;

public class ConcreteStructure implements Structure {

    public ConcreteStructure() {
        System.out.println("Concrete Structure");
    }

    @Override
    public String toString() {
        return "Concrete Structure";
    }

}
