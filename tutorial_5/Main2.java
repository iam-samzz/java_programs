class Vehicle {
    int speed;
    int fuel;

    Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    void move() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    boolean hasAirConditioner;

    Car(int speed, int fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    void turnOnAC() {
        if (hasAirConditioner)
            System.out.println("AC is on");
        else
            System.out.println("AC not available");
    }
}

class Bike extends Vehicle {
    boolean hasKickStart;

    Bike(int speed, int fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    void startBike() {
        if (hasKickStart)
            System.out.println("Kick start available");
        else
            System.out.println("Self start");
    }
}

class Truck extends Vehicle {
    int cargoCapacity;

    Truck(int speed, int fuel, int cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    void loadCargo() {
        System.out.println("Cargo capacity: " + cargoCapacity);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car(80, 40, true);
        Bike b = new Bike(60, 15, false);
        Truck t = new Truck(50, 100, 5000);

        c.move();
        c.turnOnAC();

        b.move();
        b.startBike();

        t.move();
        t.loadCargo();
    }
}