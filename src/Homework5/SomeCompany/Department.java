package Homework5.SomeCompany;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private ArrayList<Employee> employees ;
    private Company company;
    private Employee employee;

    public Department (String name, Company company) {
        this.name = name;
        this.company = company;
        company.addDepartment(this);
        employees = new ArrayList<Employee>();
    }

    public void appendEmployee (Employee object) {
        employees.add(object);
    }

    public int totalEmployees () {
        return employees.size();
    }

    public void listOfEmployees () {
        for(int i = 0; i<employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Company name: " + company.getName() + "\n" +
                "Department name: " + getName() + "\n" +
                "Total employees in department: " + totalEmployees();
    }
}
