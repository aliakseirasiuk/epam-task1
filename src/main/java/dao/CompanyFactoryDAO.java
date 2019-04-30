package dao;

public class CompanyFactoryDAO {

    public static CompanyFactoryDAO COMPANYFACTORYDAO;

    public CompanyFactoryDAO getDaoInstance() {
        if (COMPANYFACTORYDAO == null) {
            createDaoInstance();
        }
        return COMPANYFACTORYDAO;
    }

    private CompanyFactoryDAO() {

    }

    private void createDaoInstance() {
        COMPANYFACTORYDAO = new CompanyFactoryDAO();
    }
}
