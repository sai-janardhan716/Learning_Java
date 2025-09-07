
/*
    -> Java is purely OBJECT ORIENTED PROGRAMMING
    -> Basically a Procedural Oriented Programming is about writing procedures, methods to perform operations. 
    -> While Object Oriented Programming is about to creating objects that contains both data and methods.
    -> The Object Oriented Programming use objects as the primary source to implement the code.
    -> The Object Oriented Programming aims to implement the real world entities and provides the clear structure 
    for the programs.
*/

/*
    Key Concepts of OOP
    ----------------------
    -> Class: A blueprint/template that defines properties (variables) and behaviors (methods).
    -> Object: An instance of a class (real-world entity).
    -> Encapsulation: Wrapping variables & methods together in a single unit (class).
    -> Abstraction: Hiding implementation details and showing only essential features.
    -> Inheritance: Acquiring properties & behaviors from another class.
    -> Polymorphism: Ability of a method/operation to behave differently in different situations.
*/

/*
    Classes in Java
    -------------------
    -> A class is a user-defined blueprint or prototype.
    -> It contains:
        - Fields (variables, data members)
        - Methods (functions)
        - Constructors
        - Blocks
        - Nested classes
    Syntax:
        class ClassName {
            // fields
            int x;
            // methods
            void display() {
                System.out.println("Hello, Janardhan");
            }
        }
 */

/*
    Objects in Java
    -------------------
    -> An object is an instance of a class.
    -> Created using the `new` keyword.
    Example:
        ClassName obj = new ClassName();
 */

//Example
class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Calculator obj = new Calculator(); // --> Creating a object for the class calculator
        obj.add(1,2); // --> Calling the method by using object
    }
}