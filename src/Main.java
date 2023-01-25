import driver.*;
import enums.Capacity;
import enums.CarBody;
import enums.LoadCapacity;
import enums.VehicleType;
import transport.*;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Bob", true, 15, "B");
        DriverC driverC = new DriverC("Thom", true, 10, "C");
        DriverD driverD = new DriverD("Jack", true, 17, "D");

        Car car1 = new Car("Toyota", "Camry", 2.5, driverB, CarBody.SEDAN, null);
        Car car2 = new Car("Mercedes", "S200", 3.5, driverB, CarBody.SUV, VehicleType.CAR);
        Car car3 = new Car("BMW", "A6", 3.0, driverB, CarBody.COUPE, VehicleType.CAR);
        Car car4 = new Car("Audi", "A6", 3.5, driverB, CarBody.CROSSOVER, VehicleType.CAR);

        Truck truck1 = new Truck("Mercedes", "M100", 5.0, driverC, LoadCapacity.N1, VehicleType.TRUCK);
        Truck truck2 = new Truck("Volvo", "V200", 5.0, driverC, LoadCapacity.N2, VehicleType.TRUCK);
        Truck truck3 = new Truck("GMC", "G300", 5.0, driverC, LoadCapacity.N3, VehicleType.TRUCK);
        Truck truck4 = new Truck("Kamaz", "K400", 5.0, driverC, LoadCapacity.N1, VehicleType.TRUCK);

        Bus bus1 = new Bus("Mercedes", "BM100", 5.5, driverD, Capacity.TINY, VehicleType.BUS);
        Bus bus2 = new Bus("Volvo", "BV200", 5.5, driverD, Capacity.LARGE, VehicleType.BUS);
        Bus bus3 = new Bus("Neoplan", "BN300", 5.5, driverD, Capacity.HUGE, VehicleType.BUS);
        Bus bus4 = new Bus("Icarus", "BI400", 5.5, driverD, Capacity.SMALL, VehicleType.BUS);

        showInfo(driverB, driverC, driverD, car1, car2, truck1, truck2, bus1, bus2);
        showInfo(driverB, driverC, driverD, car3, car4, truck3, truck4, bus3, bus4);
        System.out.println();

        driverB.fillCar();
        driverB.start();
        car1.start();
        System.out.println();

        driverC.fillCar();
        driverC.start();
        truck1.start();
        System.out.println();

        driverD.fillCar();
        driverD.start();
        bus1.start();
        System.out.println();

        car1.pitStop();
        truck1.pitStop();
        bus1.pitStop();
        System.out.println();

        car1.stop();
        driverB.stop();
        System.out.println();

        truck1.stop();
        driverC.stop();
        System.out.println();

        bus1.stop();
        driverD.stop();
        System.out.println();

        car1.bestTimeOfCircle();
        truck1.bestTimeOfCircle();
        bus1.bestTimeOfCircle();
        System.out.println();

        car1.maxSpeed();
        truck1.maxSpeed();
        bus1.maxSpeed();

    }

    private static void showInfo(DriverB driverB, DriverC driverC, DriverD driverD, Car car1, Car car2, Truck truck1, Truck truck2, Bus bus1, Bus bus2) {
        System.out.println();
        System.out.println("Водитель с категорией B " + driverB + " управляет автомобилем " + car1 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией C " + driverC + " управляет автомобилем " + truck1 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией D " + driverD + " управляет автомобилем " + bus1 + " и будет учавствовать в заезде");
        System.out.println();
        System.out.println("Водитель с категорией B " + driverB + " управляет автомобилем " + car2 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией C " + driverC + " управляет автомобилем " + truck2 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией D " + driverD + " управляет автомобилем " + bus2 + " и будет учавствовать в заезде");
    }
}