public class Car extends Vehicle {

    private int milesPerGallon;

    // Constructor
    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    // Getter/Setter
    public int getMilesPerGallon() {
        return milesPerGallon;
    }
    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    // Methods
    public void genericTurnOn() { super.turnOn(); }
    public void turnOn() { System.out.println("Cranking engine..."); }
    public void deployAirBag() { System.out.println("Deploying air bag..."); }

    // Create your own or let IntelliJ create it & modify/edit as needed
    // reference the parent toString() with super keyword
    @Override
    public String toString() {
        return "Car... " +
                super.toString()
                + " milesPerGallon: " +
                this.milesPerGallon;
    }

    // if you want to keep the parent method also, give it a different name and call it
    public void genericToString() {
        System.out.println(super.toString());
    }

}
