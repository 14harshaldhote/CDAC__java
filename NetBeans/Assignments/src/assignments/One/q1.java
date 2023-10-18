package assignments.One;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name);
    }
}

class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Manager: " + name);
    }
}

class CEO {
    private String name;

    public CEO(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("CEO: " + name);
    }
}

class Company {
    private Employee employee;
    private Manager manager;
    private CEO ceo;

    public Company(Employee employee, Manager manager, CEO ceo) {
        this.employee = employee;
        this.manager = manager;
        this.ceo = ceo;
    }

    public void displayCompanyInfo() {
        System.out.println("Company Information:");
        employee.displayInfo();
        manager.displayInfo();
        ceo.displayInfo();
    }
}

public class q1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Harshad Mehta");
        Manager manager = new Manager("Jain Sha");
        CEO ceo = new CEO("Narendra Modi");

        Company company = new Company(employee, manager, ceo);
        company.displayCompanyInfo();
       
}}
