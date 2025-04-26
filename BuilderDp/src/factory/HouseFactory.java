package factory;

import builder.ConcreteHouseBuilder;
import builder.HouseBuilder;
import builder.IglooHouseBuilder;
import builder.WoodenHouseBuilder;
import director.CivilEngineer;
import product.House;

public class HouseFactory {
    /**
     * Factory method to create a house of a specific type.
     * This method uses the factory pattern to construct
     * the house step by step.
     * @param type The type of house to create (e.g., "wooden", "concrete", "igloo").
     * @return A House object of the specified type.
     */
    public static House createHouse(String type) {
        HouseBuilder builder;
        switch (type) {
            case "wooden":
                System.out.println("Creating Wooden House");
                builder = new WoodenHouseBuilder();
                break;
            case "concrete":
                System.out.println("Creating Concrete House");
                builder = new ConcreteHouseBuilder();
                break;
            case "igloo":
                System.out.println("Creating Igloo House");
                builder = new IglooHouseBuilder();
                break;
            default:
                throw new IllegalArgumentException("Unknown house type: " + type);
        }

        // Use the builder to construct the house
        CivilEngineer engineer = new CivilEngineer(builder);
        // Set the builder's parameters
        engineer.constructHouse();
        // Return the constructed house
        return engineer.getHouse();
    }
}
