package org.example;

 abstract class Animal1 {
    public abstract void makeSound();

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal1 {
    public void makeSound() {
        System.out.println("Meoww");
    }
}

public class AbstractMethodImplemetation {
    public static void main(String[] args) {
        Animal1 myCat = new Cat();
        myCat.makeSound(); // Outputs: Bark
        myCat.eat();       // Outputs: This animal eats food.
    }
}

