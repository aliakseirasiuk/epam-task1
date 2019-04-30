import dao.CompanyDAO;
import dao.PlaneReaderDAO;
import entity.PlaneType;

public class App {
    public static void main(String[] args) {

        PlaneReaderDAO.fillCompanyPlaneLIst(CompanyDAO.getDaoInstance(), PlaneType.PASSENGER, PlaneType.MILITARY, PlaneType.CARGO);
        PlaneReaderDAO.getCompanyPlanes();

    }
}
