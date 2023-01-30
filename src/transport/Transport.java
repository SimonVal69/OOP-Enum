package transport;

import driver.Driver;
import exceptions.TransportTypeException;
import utils.Utils;

public abstract class Transport<T extends Driver> {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = Utils.checkData(brand);
        this.model = Utils.checkData(model);
        this.engineVolume = Utils.checkData(engineVolume);
        this.driver = driver;
    }

    public abstract void printType();
    public abstract void diagnoseVehicle() throws TransportTypeException;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить движение");
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }


}
