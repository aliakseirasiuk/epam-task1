package dao;

import entity.Company;
import entity.Plane;
import entity.PlaneType;

import java.util.ArrayList;
import java.util.List;

public class PlaneReaderDAO {

    public static List<Plane> fillCompanyPlaneLIst(Company company, PlaneType... types) {
        List<Plane> planes = new ArrayList<>();
        for (PlaneType type : types) {
            planes.add(PlaneFactoryDAO.getDaoInstance().getPlaneByType(type));
        }
        company.setListOfPlanes(planes);
        return planes;
    }

    public static List<Plane> getCompanyPlanes() {
        System.out.println("COMPANY HAS: " + CompanyDAO.getDaoInstance().getListOfPlanes().size() + " planes");
        return CompanyDAO.getDaoInstance().getListOfPlanes();
    }

}
