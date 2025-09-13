public class Practice {
    public static void main(String[] args) {
    //Problems
    /*
        1) Create an abstract class Vehicle with abstract method startEngine().
        Extend it in Car and Bike classes and implement startEngine() differently.

        2) Define an interface Shape with method area().
        Implement it in Circle and Rectangle classes.

        3) Create an interface Playable with method play().
        Implement in Guitar and Piano classes.

        4) Make an abstract class Employee with abstract method calculateSalary().
        Extend it to FullTimeEmployee and PartTimeEmployee classes.
    */

    /*
        1) abstract class Vehicle{
            abstract void startEngine();
        }
        class Car extends Vehicle{
            void startEngine(){
                System.out.println("Car engine starts with key");
            }
        }
        class Bike extends Vehicle{
            void startEngine(){
                System.out.println("Bike engine starts with kick");
            }
        }
        
        2) interface Shape{
            double area();
        }
        class Circle implements Shape{
            double radius;
            Circle(double r){} radius= r; }
            public double area(){ return 3.14* radius*radius; }
        }
        class Rectangle implements Shape{
            double length, breadth;
            Rectangle(double l, double b){ length = l; breadth = b; }
            public double area(){ return length *breadth; }
        }

    */

    /* 
    1)  Vehicle car=new Car();
        Vehicle bike=new Bike();
        car.startEngine();
        bike.startEngine();

    2)  Shape c =new Circle(5);
        Shape r =new Rectangle(4, 6);
        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    */

    }
}
