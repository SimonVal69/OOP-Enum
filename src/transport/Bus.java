package transport;

import driver.*;
import enums.Capacity;
import enums.VehicleType;
import interfaces.Competing;

public class Bus extends Transport<DriverD> implements Competing {

    private Capacity capacity;
    private VehicleType vehicleType;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity, VehicleType vehicleType) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void printType() {
        if (vehicleType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + vehicleType.getTypeTranslate());
        }
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для " + getBrand() + " " + getModel());
    }

    @Override
    public void bestTimeOfCircle() {
        System.out.println("Лучшее время круга для " + getBrand() + " " + getModel() + "...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для " + getBrand() + " " + getModel() + "...");
    }
}
