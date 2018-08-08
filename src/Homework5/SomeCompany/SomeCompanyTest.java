package Homework5.SomeCompany;

public class SomeCompanyTest {

    public static void main(String[] args) {
        Company ibm = new Company("IBM", "4000123456");
        Department accountants = new Department("Accountants", ibm);
        Department marketing = new Department("Marketing", ibm);
        Employee accountant333056 = new Employee("Galina","Pupkina","333056",accountants);
        Employee accountant333057 = new Employee("Yosip", "Zilberman", "333057",accountants);
        Employee marketing333058 = new Employee("Uasya","Suvorov","333058",marketing);
        Employee marketing333059 = new Employee("Clint", "Eastwood", "333059", marketing);
        accountant333056.setSalary(500);
        accountant333057.setSalary(500);
        marketing333058.setSalary(500);
        marketing333059.setSalary(1000);
        accountants.listOfEmployees();
        marketing.listOfEmployees();
        ibm.listDepartments();

    }
}
