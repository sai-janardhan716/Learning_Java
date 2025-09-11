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

        3) class Person{
            String name;
            int age;
            void display(){
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }

        class Student extends Person {
            int rollNumber;
            void displayStudent(){
                System.out.println("Roll Number: " + rollNumber);
                display();
            }
        }

        class Teacher extends Person{
            String subject;
            void displayTeacher(){
                System.out.println("Subject: " + subject);
                display();
            }
        }

        4) class Shape{
            void area(){
                System.out.println("Calculating area............");
            }
        }

        class Circle extends Shape{
            double radius;
            Circle(double r){
                radius = r;
            }
            void area(){
                System.out.println("Circle Area = " + (3.14 * radius * radius));
            }
        }
        class Rectangle extends Shape{
            int length, breadth;
            Rectangle(int l, int b){
                length = l;
                breadth = b;
            }
            void area(){
                System.out.println("Rectangle Area = " + (length * breadth));
            }
        }
        */

        /*
            Dog d = new Dog();
            Cat c = new Cat();
            d.sound();
            c.sound();

            Car c = new Car();
            Bike b = new Bike();
            c.start();
            b.start();

            Student s = new Student();
            s.name = "Sai Janardhan";
            s.age = 21;
            s.rollNumber = 99220040008;
            s.displayStudent();
            Teacher t = new Teacher();
            t.name = "Teacher";
            t.age = 45;
            t.subject = "Math";
            t.displayTeacher();

            Circle c =new Circle(5);
            Rectangle r = new Rectangle(4, 6);
            c.area();
            r.area();
        */
    }
}
