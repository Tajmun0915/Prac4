package org.example;

class Car1 {
    private String engine;
    private int wheels;

    private boolean airbags;
    private boolean sunroof;

    private Car1(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airbags = builder.airbags;
        this.sunroof = builder.sunroof;
    }

    public static class CarBuilder {
        private String engine;
        private int wheels;

        private boolean airbags;
        private boolean sunroof;

        public CarBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setAirbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car1 build() {
            return new Car1(this);
        }
    }

    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", airbags=" + airbags + ", sunroof=" + sunroof + "]";
    }
}

public class BuilderDP {
    public static void main(String[] args) {
        Car1 car = new Car1.CarBuilder("V6", 4)
                .setAirbags(true)
                .setSunroof(true)
                .build();
        System.out.println(car);
    }
}
