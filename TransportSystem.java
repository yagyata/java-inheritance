class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Vehicle:\nMaximum speed: " + maxSpeed + "\nFuel type: " + fuelType + "\n");
    }
}

class Car extends Vehicle {
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Car:\nMaximum speed: " + maxSpeed + "\nFuel type: " + fuelType + "\nSeat capacity: " +seatCapacity + "\n");
    }
}

class Truck extends Vehicle {
    int totalWheels;
    public Truck(int maxSpeed, String fuelType, int totalWheels) {
        super(maxSpeed, fuelType);
        this.totalWheels = totalWheels;
    }

    @Override
    public void displayInfo(){
        System.out.println("Truck:\nMaximum speed: " + maxSpeed + "\nFuel type: " + fuelType + "\nTotal Wheels: " + totalWheels + "\n");
    }
}

class Motorcycle extends Vehicle {

    String engineCapacity;
    public Motorcycle(int maxSpeed, String fuelType, String engineCapacity) {
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Motorcycle:\nMaximum speed: " + maxSpeed + "\nFuel type: " + fuelType + "\nEngine capacity: " +engineCapacity +"\n");
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(200, "Electric", 6),
                new Truck(150, "Diesel", 8),
                new Motorcycle(180, "Petrol", "150cc")
        };

        for(Vehicle v : vehicles){
            v.displayInfo();
        }
    }
}
