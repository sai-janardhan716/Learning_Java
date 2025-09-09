public class Practice {
    public static void main(String[] args) {
    /*
        1) Create an overloaded method `multiply`:
        - multiply two integers
        - multiply three integers
        - multiply two doubles

        2) Create a base class Vehicle with method `start()`.
        Override it in Car and Bike classes to display their own start mechanism.

        3) Overload a method `greet`:
        - No parameters → prints "Hello"
        - One parameter (name) → prints "Hello, <name>"
        - Two parameters (name, age) → prints "Hello, <name>, age: <age>"

        4) Override a method `area()` in Shape class:
        - Circle class calculates area of circle
        - Rectangle class calculates area of rectangle

        5) Write a program to demonstrate the difference between overloading and overriding
        in the same project.
    */

    //Solutions
    /*
    1) class Multiply {
        int multiply(int a, int b) {
            return a * b;
        }

        int multiply(int a, int b, int c) {
            return a * b * c;
        }

        double multiply(double a, double b) {
            return a * b;
        }
    }
    
    2) class Vehicle {
        void start() {
            System.out.println("Vehicle is starting...");
        }
    }
    class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car starts with a key ignition.");
        }
    }
    class Bike extends Vehicle {
        @Override
        void start() {
            System.out.println("Bike starts with a self-start button.");
        }
    }

    3) class Greeter {
        void greet() {
            System.out.println("Hello");
        }
        void greet(String name) {
            System.out.println("Hello, " + name);
        }
        void greet(String name, int age) {
            System.out.println("Hello, " + name + ", age: " + age);
        }
    }

    4) class Shape {
        void area() {
            System.out.println("Area is undefined for generic shape.");
        }
    }
    class Circle extends Shape {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
        @Override
        void area() {
            double result = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + result);
        }
    }
    class Rectangle extends Shape {
        double length, width;
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        @Override
        void area() {
            double result = length * width;
            System.out.println("Area of Rectangle: " + result);
        }
    }

    */

    }
}
