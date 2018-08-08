package Homework5.SomeCompany;

public class Employee {

    private String name;
    private String surname;
    private String contractNumber;
    private double salary;
    private Department department;

    public Employee (String name, String surname, String contractNumber, Department department) {
        this.name = name;
        this.surname = surname;
        this.contractNumber = contractNumber;
        this.department = department;
        department.appendEmployee(this);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public String getDepartment () {
        return department.getName();
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

//    public String getDepartment (Department department) {
//        return department.getName();
//    }

    @Override
    public String toString() {
        return "Name, surname : " + getName() +" " + getSurname() +"\n"+
                "Department: " + getDepartment() + "\n" +
                "Employees salary: " + getSalary() +"\n"+
                "Contract number: " + getContractNumber() +"\n";
    }
}
