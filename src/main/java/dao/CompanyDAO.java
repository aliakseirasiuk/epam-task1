package dao;

import entity.Company;

public class CompanyDAO {

    public static Company COMPANY;

    public static Company getCompanyInstance() {
        if (COMPANY == null) {
            createDaoInstance();
        }
        return COMPANY;
    }

    private CompanyDAO() {

    }

    private static void createDaoInstance() {
        COMPANY = new Company();
    }

    public static Company getCompany() {
        return new Company();
    }
}
