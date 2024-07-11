package org.example;

public class Overloading {

    void add (int a, int b){
        System.out.println("Sum of a and b : " + (a+b));
//        return (a+b);
    }
    void add (int a, int b, int c){
        System.out.println("Sum of a and b and c : " + (a+b+c));
//        return (a+b+c);
    }
    void add (double a, int b){
        System.out.println("Sum of a and b :" + (a+b));
//        return (int) (a+b);
    }
    void add (double a, double b){
        System.out.println("Sum of a and b :" + (a+b));
//        return (a+b);
    }
    void add (String a, String b){
         System.out.println("Concatenation of a and b :" + (a+b));
//        return (a+b);

    }

    public static void main(String[] args) {
        Overloading ol = new Overloading();
        ol.add(1, 2);
        ol.add(4, 12,11);
        ol.add(111.87, 20);
        ol.add("Tajmun ", "Tasleem");

    }
}