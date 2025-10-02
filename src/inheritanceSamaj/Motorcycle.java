package inheritanceSamaj;

public class Motorcycle extends Vehicle implements VehicleActions {
    private int engineCapacity;

    public Motorcycle(String brand, int year, int engineCapacity) {
        super(brand, year);
        this.engineCapacity = engineCapacity;
    }

    public void start() {
        System.out.println("Motorcycle started.");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    public void displayInfo() {
        displayBasicInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}

