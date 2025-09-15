// Abstraction :- The process of hiding internal details and shows essential details and functionality to the user is called Abstraction
// It focuses on what an object does, not how it does it.

/* 
    In Java, abstraction is achieved using:
    -> Abstract Classes
    -> Interfaces
*/
/*
    Abstract Class:-
    -----------------
    -> Declared with the abstract keyword.
    -> Cannot be instantiated (you cannot create objects of an abstract class).
    -> Can have:
            -> Abstract methods (methods without a body).
            -> Concrete methods (methods with implementation).
            -> Variables, constructors, and even static methods.

    abstract class Animal{
        abstract void sound();// abstract method (no body)
        void sleep(){          // concrete method
            System.out.println("Sleeping...");
        }
    }
    class Dog extends Animal{
        void sound(){
            System.out.println("Dog barks");
        }
    }
    public class Main{
        public static void main(String[] args) {
            Animal a = new Dog();  // upcasting
            a.sound();             // Dog barks
            a.sleep();             // Sleeping
        }
    }
*/

/*
    Interface:-
    ------------
    -> A completely abstract type that defines a contract of methods.
    -> Methods are public abstract by default (Java 8+ allows default and static methods).
    -> A class implements an interface and provides the method bodies.
    -> Supports multiple inheritance (a class can implement many interfaces).

    interface Animal{
        void sound();             // public abstract by default
    }
    class Dog implements Animal{
        public void sound() {
            System.out.println("Dog barks");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Animal a = new Dog();
            a.sound();            // Dog barks
        }
    }
*/