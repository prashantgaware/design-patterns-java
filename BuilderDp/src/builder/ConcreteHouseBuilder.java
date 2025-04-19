package builder;

import product.House;
import product.basement.ConcreteBasement;
import product.interior.GlassInterior;
import product.roof.ConcreteRoofing;
import product.structure.ConcreteStructure;

public class ConcreteHouseBuilder implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder() {
        System.out.println("Creating Concrete House");
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("Building Concrete Basement");
        house.setBasement(new ConcreteBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("Building Concrete Structure");
        house.setStructure(new ConcreteStructure());
    }

    @Override
    public void buildRoof() {
        System.out.println("Building Concrete Roof");
         house.setRoof(new ConcreteRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("Building Concrete Interior");
        house.setInterior(new GlassInterior());
    }

    @Override
    public House getHouse() {
        System.out.println("House is ready");
        return house;
    }
}
