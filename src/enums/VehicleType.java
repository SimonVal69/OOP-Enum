package enums;

public enum VehicleType {
    CAR("легковой автомобиль"),
    BUS("автобус"),
    TRUCK("грузовик");

    private String typeTranslate;

    VehicleType(String typeTranslate) {
        this.typeTranslate = typeTranslate;
    }

    public String getTypeTranslate() {
        return typeTranslate;
    }
}
