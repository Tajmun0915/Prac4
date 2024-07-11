package org.example;


    class Person {
        public void eat() {
            System.out.println("Some sound");
        }
        public void play() {
            System.out.println("Play the ball");
        }
    }


    class Student extends Person {
        // Overrides makeSound method from superclass
        @Override
        public void eat() {
            System.out.println(" Chocolates");
        }

        public void play() {
            System.out.println("Play the ball");
        }
        public void standard() {
            System.out.println("2nd Standard");
        }
    }

    public class OverRiding {
        public static void main(String[] args) {
            Person person = new Person();
            Student student = new Student();

            person.eat();
            person.play();
            student.eat();
            student.play();
            student.standard();

            Person p = new Student();
            p.play();
        }
    }

