package Homework5.SomeCompany;

import java.util.ArrayList;

public class Company {

    private String name;
    private String registrationNumber;
    private ArrayList <Department> departments;


    public Company (String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        departments = new ArrayList<>();
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void addDepartment (Department dep) {
        this.departments.add(dep);
    }

    public void listDepartments () {
        for (int item = 0; item < departments.size(); item++) {
            System.out.println(departments.get(item).getName());
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Company name: " + name;
    }
}
