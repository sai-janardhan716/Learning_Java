public class Practice4 {
    public static void main(String[] args) {
    // Practice Problems

    /* 
        1) Create a class 'Student' with fields name, age, and grade. Write a method to display student details.
        2) Create a class 'Calculator' with methods add, subtract, multiply, divide.Test using objects.
        3) Write a class 'Rectangle' with fields length & breadth. Write methods to calculate area and perimeter.
        4) Create a class 'Car' with fields brand, model, and year. Add a method to display car details.
        5) Create a class 'BankAccount' with fields accountNumber and balance. Add methods deposit() and withdraw().
    */

    // Solutions

/*
    1)  class Student {
            String name;
            int age;
            char grade;
            void display() {
                System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
            }
        }
        public class Main {
            public static void main(String[] args) {
                Student s = new Student();
                s.name = "Sai";
                s.age = 21;
                s.grade = 'A';
                s.display();
            }
        }
    2)  class Calculator {
            int add(int a, int b) { return a + b; }        --> In java one, if the content present in curly brasis as single line we can write the syntax like this
            int subtract(int a, int b) { return a - b; }
            int multiply(int a, int b) { return a * b; }
            int divide(int a, int b) { return a / b; }
        }

        public class Main {
            public static void main(String[] args) {
                Calculator c = new Calculator();
                System.out.println("Add: " + c.add(5, 3));
                System.out.println("Subtract: " + c.subtract(5, 3));
                System.out.println("Multiply: " + c.multiply(5, 3));
                System.out.println("Divide: " + c.divide(6, 3));
            }
        }
*/
    }
}