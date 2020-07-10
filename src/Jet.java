public class Jet extends Vehicle {

    private int maximumAltitude;

    // Constructor
    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    // Getter/Setter
    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    // Methods
    public void genericTurnOn() { super.turnOn(); }
    public void turnOn() { System.out.println("Igniting jet engines..."); }
    public void takeOff() {
        System.out.println("Taking off...");
    }

    @Override
    public String toString() {
        return "Jet... " +
                super.toString()
                + " maximumAltitude: " +
                this.maximumAltitude;

    }
}
