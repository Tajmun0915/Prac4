package org.example;

class Vehicle {
    public void Gear() {
        System.out.println("We have Gears in every vehicle.");
    }
}

class Bike extends Vehicle{
    public void Accelerator() {
        System.out.println("Bike will manage speed through accelerator.");
    }
}

class Lorry extends Vehicle{
    public void differential() {
        System.out.println("Lorry has differential to apply breaks.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Lorry lorry = new Lorry();
        Vehicle v = new Lorry();
        bike.Gear();
        bike.Accelerator();
        lorry.Gear();
        lorry.differential();
        v.Gear();
    }
}


