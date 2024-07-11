package org.example;

 class Engine {
    public void start() {
        System.out.println("Engine starts.");
    }
}

 class Van {
    private Engine engine;

    public Van() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Car starts.");
    }
}

public class Composition {
    public static void main(String[] args) {
        Van van = new Van();
        van.start();
    }
}
