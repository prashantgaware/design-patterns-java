package builder;

import product.House;
import product.basement.IceBasement;
import product.interior.IceCarvingInterior;
import product.roof.IceRoofing;
import product.structure.IceStructure;

public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        System.out.println("Building Igloo House");
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("Building Igloo Basement");
        house.setBasement(new IceBasement());
    }

    @Override
    public void buildStructure() {
        System.out.println("Building Igloo Structure");
        house.setStructure(new IceStructure());
    }

    @Override
    public void buildRoof() {
        System.out.println("Building Igloo Roof");
         house.setRoof(new IceRoofing());
    }

    @Override
    public void buildInterior() {
        System.out.println("Building Igloo Interior");
        house.setInterior(new IceCarvingInterior());
    }

    @Override
    public House getHouse() {
        System.out.println("House is ready");
        return house;
    }
}
