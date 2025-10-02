package inheritanceSamaj;

public class Truck extends Vehicle implements VehicleActions {
    private double loadCapacity;

    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    public void start() {
        System.out.println("Truck started.");
    }

    public void stop() {
        System.out.println("Truck stopped.");
    }

    public void displayInfo() {
        displayBasicInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
