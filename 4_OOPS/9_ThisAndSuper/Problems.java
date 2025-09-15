public class Problems {
    public static void main(String[] args) {
            //Problems
    /*
        Practice Problems – this & super
        ---------------------------------
        1) Rectangle
        • Create a class Rectangle with fields length and breadth.
        • Use a constructor where parameters have same names as instance variables.  
          -> Use `this` to differentiate between them.
        • Create a method area() that returns length × breadth.

        2) Circle
        • Create a class Circle with field radius.
        • Provide two constructors: default (radius = 1) and parameterized.  
          -> Use constructor chaining with `this()` to call the default constructor from the parameterized one.

        3) Person & Employee
        • Create a parent class Person with a method display() that prints "I am a person".
        • Create a subclass Employee that overrides display() to print "I am an employee".
        • In Employee's display(), first call the parent method using `super.display()` and then print the child message.

        4) Vehicle & Car
        • Vehicle has a field speed and a constructor to initialize it.
        • Car extends Vehicle and has an additional field brand.
        • Use `super` in the Car constructor to call Vehicle’s constructor and initialize speed.

        5) Animal & Dog
        • Animal class has a method sound() that prints "Animal makes a sound".
        • Dog extends Animal and overrides sound() to print "Dog barks".
        • Create another method in Dog that calls the parent’s sound() using `super.sound()`.
    */

    //Solutions
    /*
    1) class Rectangle{
           private int length;
           private int breadth;
           Rectangle(int length, int breadth){
               this.length = length;   // using this to refer to instance variables
               this.breadth = breadth;
           }
           public int area(){
               return this.length * this.breadth;
           }
       }
       // Rectangle r = new Rectangle(5, 10);
       // System.out.println("Area: " + r.area());

    2) class Circle {
        private double radius;
        Circle(){
            this.radius = 1.0;
        }
        Circle(double radius){
            this();                // calling default constructor
            this.radius = radius;
        }
        public double area() {
            return Math.PI * radius * radius;
        }
    }
       // Circle c = new Circle(4.5);
       // System.out.println("Area: " + c.area());

    3) class Person{
           void display() {
               System.out.println("I am a person");
           }
       }
       class Employee extends Person{
           @Override
           void display() {
               super.display(); // call parent method
               System.out.println("I am an employee");
           }
       }
       // Employee e = new Employee();
       // e.display();

    4) class Vehicle {
        int speed;
        Vehicle(int speed) {
            this.speed = speed;
        }
    }
    class Car extends Vehicle{
        String brand;
        Car(int speed, String brand) {
            super(speed);        // call parent constructor
            this.brand = brand;
        }
        void show(){
            System.out.println("Brand: " + brand + ", Speed: " + speed);
        }
    }
    // Car c = new Car(120, "Tesla");
    // c.show();
    */
    }    
}
