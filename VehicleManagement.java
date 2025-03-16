class Vehiclee{
    String model;
    int maxSpeed;

    public Vehiclee(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehiclee{
    int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

interface Refuelable{
    void refuel();
}

class PetrolVehicle extends Vehiclee implements Refuelable{
    int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelCapacity + " liters of petrol.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Petrol Vehicle");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle electric = new ElectricVehicle("Tesla", 200, 75);
        PetrolVehicle petrol = new PetrolVehicle("Hyundai Creta", 250, 60);

        electric.displayDetails();
        electric.charge();
        System.out.println();

        petrol.displayDetails();
        petrol.refuel();
    }
}