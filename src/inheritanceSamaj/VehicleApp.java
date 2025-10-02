package inheritanceSamaj;

import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleActions vehicle = null;

        System.out.println("Choose vehicle type:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.println("3. Truck");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter model: ");
                String model = scanner.nextLine();
                vehicle = new Car(brand, year, model);
                break;
            case 2:
                System.out.print("Enter engine capacity (cc): ");
                int cc = scanner.nextInt();
                vehicle = new Motorcycle(brand, year, cc);
                break;
            case 3:
                System.out.print("Enter load capacity (tons): ");
                double tons = scanner.nextDouble();
                vehicle = new Truck(brand, year, tons);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("\n--- Vehicle Info ---");
        vehicle.displayBasicInfo();
        vehicle.start();
        vehicle.stop();

        scanner.close();
    }
}
