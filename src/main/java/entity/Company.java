package entity;

import java.util.List;

public class Company {

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Plane> getListOfPlanes() {
        return listOfPlanes;
    }

    public void setListOfPlanes(List<Plane> listOfPlanes) {
        this.listOfPlanes = listOfPlanes;
    }

    private List<Plane> listOfPlanes;

}
