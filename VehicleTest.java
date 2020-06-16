public class VehicleTest {

    public static void turnOnVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            v.turnOn();
        }
    }

    public static void main(String[] args) {
        // Create new Vehicle objects using constructors
        Vehicle v1 = new Vehicle(true, 1, "human-effort");
        Vehicle v2 = new Vehicle(true, 2, "human-effort");

//        alternately, set each field individually
//        v1.setIsOperable(true);
//        v1.setPassengerCapacity(1);
//        v1.setPowerSource("human-effort");

        Vehicle c1 = new Car(true, 5, "gas", 32); // could also use Car c = new Car();
        Vehicle c2 = new Car(false, 2, "electric", 60);

        Vehicle j1 = new Jet(true, 10, "gas", 51000); // could also use Jet j = new Jet();
        Vehicle j2 = new Jet(false, 6, "gas", 46000);

        // Call on override toString() methods for super and subclasses
        System.out.println(v1.toString());
        System.out.println(c1.toString());
        System.out.println(j1.toString());

        // Create an array of vehicles and pass it to the turnOnVehicles class
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = v1;
        vehicles[1] = v2;
        vehicles[2] = c1;
        vehicles[3] = c2;
        vehicles[4] = j1;
        vehicles[5] = j2;
        turnOnVehicles(vehicles);

//        c1.genericToString(); // calling the parent toString() from Car stopped working at some point, I think after adding the Car objects
        Car car = (Car) vehicles[2]; // explicitly casting it as a Car type allows it to work again
        car.genericToString();

    }
}
