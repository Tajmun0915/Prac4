package org.example;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void listOfEmployees(){
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[]{new Employee("Sonu", 70000),new Employee("Monu", 60000)};
        for(Employee e: emp) {
            e.listOfEmployees();
            e.setName("Jane Doe");
            e.setSalary(60000);
            e.listOfEmployees();
        }

    }
}
