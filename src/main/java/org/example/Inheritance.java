package org.example;

class Animal {
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal{
    public void Bark() {
        super.sound();
        System.out.println("Dog will Bark Bark.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        dog.Bark();
        dog.sound();
        animal.sound();
//        animal.Bark();    //It won't support because the method is not in super class.
    }
}


