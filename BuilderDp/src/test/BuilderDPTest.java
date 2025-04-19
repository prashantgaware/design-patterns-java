package test;

import factory.HouseFactory;
import product.House;

public class BuilderDPTest {
    public static void main(String[] args) {
        House house1 = HouseFactory.createHouse("wooden");
        System.out.println(house1);

        House house2 = HouseFactory.createHouse("concrete");
        System.out.println(house2);

        House house3 = HouseFactory.createHouse("igloo");
        System.out.println(house3);
    }
}
