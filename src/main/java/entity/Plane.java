package entity;

public class Plane {

    private PlaneType type;

    private CargoCapacityType capacity;

    public Plane(PlaneType type) {
        this.type = type;

    }

    public Plane(PlaneType type, CargoCapacityType cargoCapacityType) {
        this.type = type;
        this.capacity = cargoCapacityType;

    }

}
