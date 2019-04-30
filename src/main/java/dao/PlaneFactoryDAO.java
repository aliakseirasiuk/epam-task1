package dao;

import entity.CargoCapacityType;
import entity.Plane;
import entity.PlaneType;

public class PlaneFactoryDAO {

    public static PlaneFactoryDAO PLANEFACTORYDAO;

    public Plane getPlaneByType(PlaneType type) {
        Plane plane;
        switch (type) {
            case CARGO:
                System.out.println("Create CARGO plane");
                return plane = new Plane(type);

            case POST:
                System.out.println("Create POST plane");
                return new Plane(type);

            case MILITARY:
                System.out.println("Create MILITARY plane");
                return new Plane(type);

            case PASSENGER:
                System.out.println("Create PASSENGER plane");
                return new Plane(type);

        }
        return null;
    }

    private PlaneFactoryDAO() {

    }

    public static PlaneFactoryDAO getDaoInstance() {
        if (PLANEFACTORYDAO == null) {
            createDaoInstance();
        }
        return PLANEFACTORYDAO;
    }

    private static void createDaoInstance() {
        PLANEFACTORYDAO = new PlaneFactoryDAO();
    }

    public Plane getPlaneByCargoCapacityType(PlaneType type, CargoCapacityType cargoCapacityType) {
        Plane plane;
        switch (type) {
            case CARGO:
                System.out.println("Create CARGO plane");
                return plane = new Plane(type, cargoCapacityType);

            case POST:
                System.out.println("Create POST plane");
                return new Plane(type, cargoCapacityType);

            case MILITARY:
                System.out.println("Create MILITARY plane");
                return new Plane(type, cargoCapacityType);

            case PASSENGER:
                System.out.println("Create PASSENGER plane");
                return new Plane(type, cargoCapacityType);

        }
        return null;
    }
}
