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
                System.out.println("Name: " +name + ", Age: "+ age + ", Grade: " + grade);
            }
        }
        public class Main {
            public static void main(String[] args) {
                Student s =new Student();
                s.name = "Sai";
                s.age =21;
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
                Calculator c =new Calculator();
                System.out.println("Add: " + c.add(5, 3));
                System.out.println("Subtract: " + c.subtract(5, 3));
                System.out.println("Multiply: "+ c.multiply(5, 3));
                System.out.println("Divide: " +c.divide(6, 3));
            }
        }
    3)  class Rectangle {
            int length, breadth;
            int area() { return length * breadth; }
            int perimeter() { return 2 * (length + breadth); }
        }
        public class Main {
            public static void main(String[] args) {
                Rectangle r= new Rectangle();
                r.length =10;
                r.breadth= 5;
                System.out.println("Area: " +r.area());
                System.out.println("Perimeter: " +r.perimeter());
            }
        }
     4)  class Car {
            String brand, model;
            int year;
            void display() {
                System.out.println(year+ " "+brand +" " + model);
            }
        }
        public class Main {
            public static void main(String[] args) {
                Car c =new Car();
                c.brand= "Toyota";
                c.model= "Supra";
                c.year =2022;
                c.display();
            }
        }
        5)class BankAccount {
            int accountNumber;
            double balance;
            void deposit(double amount) {
                balance +=amount;
                System.out.println("Deposited: "+ amount + ", New Balance: "+ balance);
            }
            void withdraw(double amount) {
                if(amount <= balance) {
                    balance-= amount;
                    System.out.println("Withdrew: " +amount + ", New Balance: " +balance);
                }else {
                    System.out.println("Insufficient balance!");
                }
            }
        }
        public class Main {
            public static void main(String[] args) {
                BankAccount b =new BankAccount();
                b.accountNumber=12345;
                b.balance = 1000;
                b.deposit(500);
                b.withdraw(300);
                b.withdraw(1500);
            }
        }
*/
    }
}