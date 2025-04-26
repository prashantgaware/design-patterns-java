package director;

import builder.HouseBuilder;
import product.House;

public class CivilEngineer {

    /**
     * The HouseBuilder instance used to construct the house.
     * This instance is provided through the constructor.
     */
    private HouseBuilder houseBuilder;

    /**
     * Constructor for the CivilEngineer class.
     * It initializes the houseBuilder instance variable
     * with the provided HouseBuilder.
     *
     * @param houseBuilder the HouseBuilder to be used for construction
     */
    public CivilEngineer(HouseBuilder houseBuilder) {
        System.out.println("Inside CivilEngineer constructor");
        this.houseBuilder = houseBuilder;
    }

    /**
     * Constructs a house using the provided HouseBuilder.
     * This method orchestrates the
     * construction process by calling the appropriate methods
     * on the HouseBuilder.
     * It builds the basement, structure, roof,
     * and interior of the house in that order.
     */
    public void constructHouse() {
        System.out.println("Inside CivilEngineer constructHouse method");
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }

    /**
     * Returns the constructed house.
     * This method retrieves the house object
     * from the HouseBuilder.
     *
     * @return the constructed House object
     */
    public House getHouse() {
        System.out.println("Inside CivilEngineer getHouse method");
        return houseBuilder.getHouse();
    }
}
