package builder;

import product.House;
import product.basement.WoodenBasement;
import product.interior.WoodenInterior;
import product.roof.WoodenRoofing;
import product.structure.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {

    private House house;

    public WoodenHouseBuilder() {
        System.out.println("Creating a new Wooden House");
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("Building Wooden Basement");
        house.setBasement(new WoodenBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("Building Wooden Structure");
        house.setStructure(new WoodenStructure());
    }

    @Override
    public void buildRoof() {
        System.out.println("Building Wooden Roof");
         house.setRoof(new WoodenRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("Building Wooden Interior");
        house.setInterior(new WoodenInterior());
    }

    @Override
    public House getHouse() {
        System.out.println("House is ready");
        return house;
    }
}
