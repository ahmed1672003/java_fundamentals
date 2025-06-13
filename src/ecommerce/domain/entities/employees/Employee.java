package ecommerce.domain.entities.employees;

import ecommerce.domain.entities.users.User;

public class Employee extends User implements IEmployee {

    private double salary;

    public Employee(String name, String email, String password, double salary) {
        super(name, email, password);
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public void display() {
        System.out.println("employee information => id: " + super.getId() + ", name: " + this.name + ", email: " + this.email + ", salary: " + this.salary);
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
