package org.example;

public class Car {

    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
//        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota Camry", 2023, "Green");
        Car car2 = new Car("Honda Accord", 2022, "Black");
        Car car3 = new Car("Ford Mustang", 2021, "Silver");
        Car car4 = new Car("BMW", 2020, "Red");

        car1.displayDetails();
        System.out.println();
        car2.displayDetails();
        System.out.println();
        car3.displayDetails();
        System.out.println();
        car4.displayDetails();
        System.out.println();
    }
}
