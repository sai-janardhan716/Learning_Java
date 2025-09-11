public class Practice {
    public static void main(String[] args) {
        //Problems
        /* 
            1) Create a base class Animal with a method sound(). Inherit Dog and Cat classes from it and print their sounds.
            2) Create a class Vehicle with method start(). Inherit Car and Bike classes and demonstrate calling start().
            3) Create a class Person with fields name and age. Inherit Student and Teacher classes that add extra fields 
               (rollNumber for Student, subject for Teacher). Print details for both.
            4) Create a class Shape with a method area(). Inherit Circle and Rectangle classes and calculate their areas.
            5)  Create a class Employee with a method work(). Inherit Manager and Developer classes and override work() to display their specific tasks.
        */

        //Solutions
        /* 
        !) class Animal{
            void sound(){
                System.out.println("Animals make sounds");
            }
        }
        class Dog extends Animal{
            void sound() {
                System.out.println("Dog barks");
            }
        }
        class Cat extends Animal{
            void sound(){
                System.out.println("Cat meows");
            }
        }

        2) class Vehicle{
            void start(){
                System.out.println("Vehicle is starting............");
            }
        }
        class Car extends Vehicle{
            void start(){
                System.out.println("Car starts with key");
            }
        }
        class Bike extends Vehicle{
            void start(){
                System.out.println("Bike starts with kick");
            }
        }
        */
    }
}
