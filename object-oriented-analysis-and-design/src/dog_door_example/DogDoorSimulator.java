package dog_door_example;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();

        System.out.println("Fido barks to go outside...");
        dogDoor.open();
        System.out.println("Fido has gone outside...");

        try {
            Thread.sleep(10000); // Simulate time for the dog to be outside
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("Fido is all done...");
        System.out.println("Fido barks to come back inside...");
        dogDoor.close();
    }
}
